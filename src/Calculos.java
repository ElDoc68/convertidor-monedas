import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    ConsultaConversion conversion;

    public Calculos(ConsultaConversion conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void almacenarValores(String monedaBase, String monedaObjetivo){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que deseas convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public void almacenarValoresPersonalizados(){
        System.out.println("\n***************************************************************" +
                "\nCurrency Code       Currency Name         Country" +
                "\nAED - UAE Dirham                          United Arab Emirates" +
                "\nAFN - Afghan Afghani                      Afghanistan" +
                "\nALL	- Albanian Lek	                      Albania" +
                "\nAMD - Armenian Dram	                      Armenia" +
                "\nANG - Netherlands Antillian Guilder       Netherlands Antilles" +
                "\nAOA	- Angolan Kwanza	                  Angola" +
                "\nARS	- Argentine Peso	                  Argentina" +
                "\nAUD	- Australian Dollar	                  Australia" +
                "\nAWG - Aruban Florin	                      Aruba" +
                "\nAZN - Azerbaijani Manat	                  Azerbaijan" +
                "\nBAM - Bosnia and Herzegovina Mark	      Bosnia and Herzegovina" +
                "\nBBD - Barbados Dollar	                  Barbados" +
                "\nBDT - Bangladeshi Taka	                  Bangladesh" +
                "\nBGN	- Bulgarian Lev	                      Bulgaria" +
                "\nBHD	- Bahraini Dinar	                  Bahrain" +
                "\nBIF	- Burundian Franc	                  Burundi" +
                "\nBMD	- Bermudian Dollar	                  Bermuda" +
                "\nBND	- Brunei Dollar	                      Brunei" +
                "\nBOB	- Bolivian Boliviano	              Bolivia" +
                "\nBRL	- Brazilian Real	                  Brazil" +
                "\nBSD	- Bahamian Dollar	                  Bahamas" +
                "\nBTN	- Bhutanese Ngultrum	              Bhutan" +
                "\nBWP	- Botswana Pula	                      Botswana" +
                "\nBYN	- Belarusian Ruble	                  Belarus" +
                "\nBZD	- Belize Dollar	                      Belize" +
                "\nCAD	- Canadian Dollar	                  Canada" +
                "\nCDF	- Congolese Franc	                  Democratic Republic of the Congo" +
                "\nCHF	- Swiss Franc	                      Switzerland" +
                "\nCLP	- Chilean Peso	                      Chile" +
                "\nCNY	- Chinese Renminbi	                  China" +
                "\nCOP	- Colombian Peso	                  Colombia" +
                "\nCRC	- Costa Rican Colon	                  Costa Rica" +
                "\nCUP	- Cuban Peso	                      Cuba" +
                "\nCVE	- Cape Verdean Escudo	              Cape Verde" +
                "\nCZK	- Czech Koruna	                      Czech Republic" +
                "\nDJF	- Djiboutian Franc	                  Djibouti" +
                "\nDKK	- Danish Krone	                      Denmark" +
                "\nDOP	- Dominican Peso	                  Dominican Republic" +
                "\nDZD	- Algerian Dinar	                  Algeria" +
                "\nEGP	- Egyptian Pound	                  Egypt" +
                "\nERN	- Eritrean Nakfa	                  Eritrea" +
                "\nETB	- Ethiopian Birr	                  Ethiopia" +
                "\nEUR	- Euro	                              European Union" +
                "\nFJD	- Fiji Dollar	                      Fiji" +
                "\nFKP	- Falkland Islands Pound	          Falkland Islands" +
                "\nFOK	- Faroese Króna	                      Faroe Islands" +
                "\nGBP	- Pound Sterling	                  United Kingdom" +
                "\nGEL	- Georgian Lari	                      Georgia" +
                "\nGGP	- Guernsey Pound	                  Guernsey" +
                "\nGHS	- Ghanaian Cedi	                      Ghana" +
                "\nGIP	- Gibraltar Pound	                  Gibraltar" +
                "\nGMD	- Gambian Dalasi	                  The Gambia" +
                "\nGNF	- Guinean Franc	                      Guinea" +
                "\nGTQ	- Guatemalan Quetzal	              Guatemala" +
                "\nGYD	- Guyanese Dollar	                  Guyana" +
                "\nHKD	- Hong Kong Dollar	                  Hong Kong" +
                "\nHNL	- Honduran Lempira	                  Honduras" +
                "\nHRK	- Croatian Kuna	                      Croatia" +
                "\nHTG	- Haitian Gourde	                  Haiti" +
                "\nHUF	- Hungarian Forint	                  Hungary" +
                "\nIDR	- Indonesian Rupiah	                  Indonesia" +
                "\nILS	- Israeli New Shekel	              Israel" +
                "\nIMP	- Manx Pound	                      Isle of Man" +
                "\nINR	- Indian Rupee	                      India" +
                "\nIQD	- Iraqi Dinar	                      Iraq" +
                "\nIRR	- Iranian Rial	                      Iran" +
                "\nISK	- Icelandic Króna	                  Iceland" +
                "\nJEP	- Jersey Pound	                      Jersey" +
                "\nJMD	- Jamaican Dollar	                  Jamaica" +
                "\nJOD	- Jordanian Dinar	                  Jordan" +
                "\nJPY	- Japanese Yen	                      Japan" +
                "\nKES	- Kenyan Shilling	                  Kenya" +
                "\nKGS	- Kyrgyzstani Som	                  Kyrgyzstan" +
                "\nKHR	- Cambodian Riel	                  Cambodia" +
                "\nKID	- Kiribati Dollar	                  Kiribati" +
                "\nKMF	- Comorian Franc	                  Comoros" +
                "\nKRW	- South Korean Won	                  South Korea" +
                "\nKWD	- Kuwaiti Dinar	                      Kuwait" +
                "\nKYD	- Cayman Islands Dollar	              Cayman Islands" +
                "\nKZT	- Kazakhstani Tenge	                  Kazakhstan" +
                "\nLAK	- Lao Kip	                          Laos" +
                "\nLBP	- Lebanese Pound	                  Lebanon" +
                "\nLKR	- Sri Lanka Rupee	                  Sri Lanka" +
                "\nLRD	- Liberian Dollar	                  Liberia" +
                "\nLSL	- Lesotho Loti	                      Lesotho" +
                "\nLYD	- Libyan Dinar	                      Libya" +
                "\nMAD	- Moroccan Dirham	                  Morocco" +
                "\nMDL	- Moldovan Leu	                      Moldova" +
                "\nMGA	- Malagasy Ariary	                  Madagascar" +
                "\nMKD	- Macedonian Denar	                  North Macedonia" +
                "\nMMK	- Burmese Kyat	                      Myanmar" +
                "\nMNT	- Mongolian Tögrög	                  Mongolia" +
                "\nMOP	- Macanese Pataca	                  Macau" +
                "\nMRU	- Mauritanian Ouguiya	              Mauritania" +
                "\nMUR	- Mauritian Rupee	                  Mauritius" +
                "\nMVR	- Maldivian Rufiyaa	                  Maldives" +
                "\nMWK	- Malawian Kwacha	                  Malawi" +
                "\nMXN	- Mexican Peso	                      Mexico" +
                "\nMYR	- Malaysian Ringgit	                  Malaysia" +
                "\nMZN	- Mozambican Metical	              Mozambique" +
                "\nNAD	- Namibian Dollar	                  Namibia" +
                "\nNGN	- Nigerian Naira	                  Nigeria" +
                "\nNIO	- Nicaraguan Córdoba	              Nicaragua" +
                "\nNOK	- Norwegian Krone	                  Norway" +
                "\nNPR	- Nepalese Rupee	                  Nepal" +
                "\nNZD	- New Zealand Dollar	              New Zealand" +
                "\nOMR	- Omani Rial	                      Oman" +
                "\nPAB	- Panamanian Balboa	                  Panama" +
                "\nPEN	- Peruvian Sol	                      Peru" +
                "\nPGK	- Papua New Guinean Kina	          Papua New Guinea" +
                "\nPHP	- Philippine Peso	                  Philippines" +
                "\nPKR	- Pakistani Rupee	                  Pakistan" +
                "\nPLN	- Polish Złoty	                      Poland" +
                "\nPYG	- Paraguayan Guaraní	              Paraguay" +
                "\nQAR	- Qatari Riyal	                      Qatar" +
                "\nRON	- Romanian Leu	                      Romania" +
                "\nRSD	- Serbian Dinar	                      Serbia" +
                "\nRUB	- Russian Ruble	                      Russia" +
                "\nRWF	- Rwandan Franc	                      Rwanda" +
                "\nSAR	- Saudi Riyal	Saudi                 Arabia" +
                "\nSBD	- Solomon Islands Dollar	          Solomon Islands" +
                "\nSCR	- Seychellois Rupee	                  Seychelles" +
                "\nSDG	- Sudanese Pound	                  Sudan" +
                "\nSEK	- Swedish Krona	                      Sweden" +
                "\nSGD	- Singapore Dollar	                  Singapore" +
                "\nSHP	- Saint Helena Pound	              Saint Helena" +
                "\nSLE	- Sierra Leonean Leone	              Sierra Leone" +
                "\nSOS	- Somali Shilling	                  Somalia" +
                "\nSRD	- Surinamese Dollar	                  Suriname" +
                "\nSSP	- South Sudanese Pound	              South Sudan" +
                "\nSTN	- São Tomé and Príncipe Dobra	      São Tomé and Príncipe" +
                "\nSYP	- Syrian Pound	                      Syria" +
                "\nSZL	- Eswatini Lilangeni	              Eswatini" +
                "\nTHB	- Thai Baht	                          Thailand" +
                "\nTJS	- Tajikistani Somoni	              Tajikistan" +
                "\nTMT	- Turkmenistan Manat	              Turkmenistan" +
                "\nTND	- Tunisian Dinar	                  Tunisia" +
                "\nTOP	- Tongan Paʻanga	                  Tonga" +
                "\nTRY	- Turkish Lira	                      Turkey" +
                "\nTTD	- Trinidad and Tobago Dollar	      Trinidad and Tobago" +
                "\nTVD	- Tuvaluan Dollar	                  Tuvalu" +
                "\nTWD	- New Taiwan Dollar	                  Taiwan" +
                "\nTZS	- Tanzanian Shilling	              Tanzania" +
                "\nUAH	- Ukrainian Hryvnia	                  Ukraine" +
                "\nUGX	- Ugandan Shilling	                  Uganda" +
                "\nUSD	- United States Dollar	              United States" +
                "\nUYU	- Uruguayan Peso	                  Uruguay" +
                "\nUZS	- Uzbekistani So'm	                  Uzbekistan" +
                "\nVES	- Venezuelan Bolívar Soberano	      Venezuela" +
                "\nVND	- Vietnamese Đồng	                  Vietnam" +
                "\nVUV	- Vanuatu Vatu	                      Vanuatu" +
                "\nWST	- Samoan Tālā	                      Samoa" +
                "\nXAF	- Central African CFA Franc	          CEMAC" +
                "\nXCD	- East Caribbean Dollar	              Organisation of Eastern Caribbean States" +
                "\nXDR	- Special Drawing Rights	          International Monetary Fund" +
                "\nXOF	- West African CFA franc	          CFA" +
                "\nXPF	- CFP Franc	                          Collectivités d'Outre-Mer" +
                "\nYER	- Yemeni Rial                     	  Yemen" +
                "\nZAR	- South African Rand	              South Africa" +
                "\nZMW	- Zambian Kwacha	                  Zambia" +
                "\nZWL	- Zimbabwean Dollar	                  Zimbabwe" +
                "\n***************************************************************");
        System.out.println("Ingrese la moneda base con 3 letras");
        this.monedaBase = lectura.next();
        System.out.println("Ingrese la moneda a convertir con 3 letras");
        this.monedaObjetivo = lectura.next();

        boolean entradaValida = false;
        do {
            System.out.println("Ingrese el valor que deseas convertir");
            if (lectura.hasNextDouble()) {
                this.cantidad = lectura.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Error. Ingrese un valor numérico.");
                lectura.next(); // Limpiar el buffer de entrada
            }
        } while (!entradaValida);
    }

    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaBase().toUpperCase() + " " + getCantidad() + " equivalen a " + getMonedaObjetivo().toUpperCase() + " " + conversion.buscaConversion(getMonedaBase(), getMonedaObjetivo(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}
