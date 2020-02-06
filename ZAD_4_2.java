import java.io.*;
import java.util.ArrayList;
import java.util.Collections; //jeżeli chcemy posortować wyniki
import java.util.List;



public class ZAD_4_2 {
    // PROGRAM tworzy sam przedziały czasowe zczytując okresy zamówień

    //na bazie zad3  czyta plik textowy  I DRUKUJE NA KONSOLE
    // plus  drukuje do pliku pięknie go przygotowując do dalszego przetwarzania
    // przetwarza plik  z SAP (zrzucony do worlda wg print screena)
    //trzeba zamienić "," na "." zrobimy to w 4_2




    public static void main(String[] args)throws IOException,
            NumberFormatException {


         FileReader fileReader3 = new FileReader("C:\\Users\\Dell\\IdeaProjects\\OLO_OLO_1\\DELL\\DZIAŁANIA_NA_PLIKACH_&_STRING\\src\\CZAS_WORLD.txt");
         BufferedReader bufferedReader3 = new BufferedReader(fileReader3); // tworzy obiekt Bufferreader
        //Reader fileReader = new fileReader(" C:\\Users\\Dell\\IdeaProjects\\OLO_OLO_1\\DELL\\DZIAŁANIA_NA_PLIKACH_&_STRING\\src\\CZAS_PLIK_BEZ_KONWERSJI.txt");
        //String data = fileReader.read();
        // InputStream  stream= new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\OLO_OLO_1\\DELL\\DZIAŁANIA_NA_PLIKACH_&_STRING\\src\\CZAS_PLIK_BEZ_KONWERSJI.txt");
        // Reader inputStreamReader =new InputStreamReader(stream);
        // String textLine = bufferedReader3.readLine();
        int index=0;
        String outputFile = "C:\\Users\\Dell\\IdeaProjects\\OLO_OLO_1\\DELL\\DZIAŁANIA_NA_PLIKACH_&_STRING\\src\\CZAS_output_zad_4_2_czas.txt";
        FileWriter fileWriter = new FileWriter(outputFile); //tworzy obiekt do zapisywania w pliku

        PrintWriter out = new PrintWriter(fileWriter);
        List<String> lineList = new ArrayList<String>();
        // String inputLine = null;
        String inputLine= bufferedReader3.readLine();
        do{

            String [] wynik1 =inputLine.split("\t");

            ++index;

            if(inputLine.contains("PP81")) {
                // String wynik2 = textLine.substring(4, 14);  // powinien drukowac  tylko "NUMER DETALU"
                String wynik2= wynik1[10].replace(",",".");
                String wynik3 =wynik1[13].replace(",",".");
                System.out.println("wiersz "+index+"\t"+wynik1[0]+"\t"+wynik1[1]+"\t"+wynik1[2]+"\t"+wynik1[3]+"\t"+wynik1[4]+"\t"+wynik1[5]+"\t"+wynik1[6]+"\t"+wynik1[7]+"\t"+wynik1[8]+"\t"+wynik1[9]+"\t"+wynik1[10]+"\t"+wynik1[11]+"\t"+wynik1[12]+"\t"+wynik1[13]+"\t"+wynik1[14]);
                lineList.add("wiersz "+index+"\t"+wynik1[0]+"\t"+wynik1[1]+"\t"+wynik1[2]+"\t"+wynik1[3]+"\t"+wynik1[4]+"\t"+wynik1[5]+"\t"+wynik1[6]+"\t"+wynik1[7]+"\t"+wynik1[8]+"\t"+wynik1[9]+"\t"+wynik1[10]+"\t"+wynik1[11]+"\t"+wynik1[12]+"\t"+wynik1[13]+"\t"+wynik1[14]);
                out.println("wiersz "+index+"\t"+wynik1[0]+"\t"+wynik1[1]+"\t"+wynik1[2]+"\t"+wynik1[3]+"\t"+wynik1[4]+"\t"+wynik1[5]+"\t"+wynik1[6]+"\t"+wynik1[7]+"\t"+wynik1[8]+"\t"+wynik1[9]+"\t"+wynik1[10]+"\t"+wynik1[11]+"\t"+wynik1[12]+"\t"+wynik1[13]+"\t"+wynik1[14]);
                //System.out.println();
            }




            // String [] wynik1 =textLine.split(" ");
            //System.out.println(wynik1[2]);
            // for(int row=0;row<wynik1.length;row++)
            //     System.out.print(wynik1);
            // System.out.println();
            inputLine = bufferedReader3.readLine();  // zamiana readLine na toString
            //  String textLine = bufferedReader.readLine();
//        if (textLine.contains("158")){
//            // textLine.substring(5,16);
//            // System.out.println("zawiera 158");
//            String s1= textLine.substring(4,15);
//            System.out.println(s1);

//        }
//        if (textLine.contains("16")||textLine.contains("06")||textLine.contains("13")||textLine.contains("30")){
//            String s2= textLine.substring(19,21);
//            System.out.println(s2);
//        }
//        else
//            return;
        }


        while(inputLine!=null);


        bufferedReader3.close();

        out.flush();
        out.close();
        fileWriter.close();

    }
}

