package Programacion_Trabajo;
import java.io.*;

public class WordleFileManager {
    // Atributos
    private String historial;
    String nextline;
    String [] words = null;
    int longFichero = 0;
    File fl = new File("Words.txt");


    // constructor
    public WordleFileManager(){
        historial = "";
    }

    // Escribe en el archivo Historial.txt el texto que sale por pantalla sin colores
    public void escribirHistorial(){
        try(FileWriter fw = new FileWriter("Historial.txt");
            PrintWriter pw = new PrintWriter(fw);){
            String [] removeAnsi = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[37m", "\u001B[0m"};
            for (int i =0;i< removeAnsi.length;i++)
                historial = historial.replace(removeAnsi[i], "" );
        pw.println(historial);

    }
        catch (IOException e){
            System.out.println("Error al escribir fichero: " + e.toString());
        }
    }

    // Lee el fichero Words.txt y guarda las palabras en el String words[]
    public String [] leerfichero() {
        // Inicializamos el reader
        try (FileReader fr = new FileReader(fl);
             BufferedReader br = new BufferedReader(fr);
             BufferedReader br2 = new BufferedReader(new FileReader(fl))){

            // Comprobamos longitud del fichero
            while ((nextline = br.readLine()) != null)
                longFichero++;
            // Guardamos las palabras en un Array
            words = new String[longFichero];
            for (int i = 0; i < longFichero; i++)
                words[i] = br2.readLine();
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.toString());
        }

        return words;
    }


    // Los tres metodos se encargan de mostrar el texto por pantalla y añadirlo a la variable historial
    public void println(String printnl){
        System.out.println(printnl);
        historial += printnl + "\n";
    }
    public void print(String print){
        System.out.print(print);
        historial += print;
    }
    public void scanerprint(String print){
        historial += print + "\n";
    }


}

