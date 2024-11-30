import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneradorDeArchivos {
    public void guardarJson(List<String> lista) {
        try {
            FileWriter fileWriter = new FileWriter("historial_conversiones.txt");
            for (String resultado : lista) {
                fileWriter.write(resultado);
                fileWriter.write("\n");
            }
            fileWriter.close();
            System.out.println("\nHistorial de conversiones guardado en 'historial_conversiones.txt'");
        } catch (IOException e) {
            System.out.println("Error al guardar el historial de conversiones: " + e.getMessage());
        }
    }
}
