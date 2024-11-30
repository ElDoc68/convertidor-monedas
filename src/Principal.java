import com.google.gson.JsonSyntaxException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcionElegida = 0;

        ConsultaConversion consulta = new ConsultaConversion();
        Calculos calculos = new Calculos(consulta);
        GeneradorDeArchivos generador = new GeneradorDeArchivos();
        List<String> respuestas = new ArrayList<>();

        while (opcionElegida != 8) {
            try {
                System.out.println("\n*********************************************\n" +
                        "Sea bienvenido/a al Conversor de Moneda\n\n" +
                        " 1) USD - Dólar           ==> ARS - Peso argentino\n" +
                        " 2) ARS - Peso argentino  ==> USD - Dólar\n" +
                        " 3) USD - Dólar           ==> BRL-  Real brasileño\n" +
                        " 4) BRL - Real brasileño  ==> USD - Dólar\n" +
                        " 5) USD - Dólar           ==> COP - Peso colombiano\n" +
                        " 6) COP - Peso colombiano ==> USD - Dólar\n\n" +
                        " 7) Otra opción de moneda para conversión\n\n" +
                        " 8) Salir");
                System.out.println("*********************************************");
                System.out.println("Elija una opción válida");
                opcionElegida = Integer.parseInt(lectura.nextLine());

                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String formattedDate = myDateObj.format(myFormatObj);

                switch (opcionElegida) {
                    case 1:
                        calculos.almacenarValores("USD", "ARS");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 2:
                        calculos.almacenarValores("ARS", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 3:
                        calculos.almacenarValores("USD", "BRL");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 4:
                        calculos.almacenarValores("BRL", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 5:
                        calculos.almacenarValores("USD", "COP");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 6:
                        calculos.almacenarValores("COP", "USD");
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 7:
                        calculos.almacenarValoresPersonalizados();
                        respuestas.add(formattedDate + " - " + calculos.obtenerMensajeRespuesta());
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Elija una opción válida");
                }
            } catch (JsonSyntaxException | NullPointerException e) {
                System.out.println("Error. Ingrese solo códigos de moneda válidos.");
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Error. Ingrese un valor numérico válido.");
            }
        }
        generador.guardarJson(respuestas);
        System.out.println("Gracias por utilizar el Conversor de Monedas\n");
    }
}