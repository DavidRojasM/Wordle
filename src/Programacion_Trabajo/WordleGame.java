package Programacion_Trabajo;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class WordleGame {

    WordleFileManager fileManager = new WordleFileManager();
    Scanner scan = new Scanner(System.in);

    // Atributos
    private static final int WORD_LENGTH = 5;
    private int MAX_TRIES;
    private int RemainningAtempts;
    private String [] fileWords;
    private String secretWord;
    private String [] triesHistory;
    private String guess = "";
    boolean game_finish;
    int index;



    // Constructor
    public void wordleGame(String[] fileWords){
        this.fileWords = fileWords;
        secretWord = select_Ramdom_World(fileWords);
        MAX_TRIES = 6;
        RemainningAtempts = MAX_TRIES;
        triesHistory = new String[MAX_TRIES];
        boolean game_finish = false;
        int index = 0;
    }

    //Bucle del juego
    public void start(){

       fileManager.println(WordleFeedBack.ANSI_WHITE + "Bienvenido al juego del Wordle:\n" + WordleFeedBack.ANSI_RESET);

        while (!game_finish){
          fileManager.println("\nTienes " + RemainningAtempts+ " intentos restantes" + "\n");
            showTriedHistory();
            // Pide palabra al usuario
            do{
                guess = getUserInput(scan);
            }while (guess.length() != WORD_LENGTH);

            // Se comprueba si el juego ha terminado
            if (Objects.equals(guess, secretWord)) {
                fileManager.println(WordleFeedBack.feedBackString(guess, secretWord));
                fileManager.println("Enhorabuena, te has pasado el juego del Wordle!!!");
                game_finish = true;
            }else if (RemainningAtempts == 1){
                fileManager.println("Lo sentimos, te has quedado sin intentos. Vuelve a intentarlo en otra ocasión.\n"
                +"La palabra correcta era: " + secretWord);
                game_finish = true;
            }else{
                triesHistory[index] = WordleFeedBack.feedBackString(guess, secretWord);
                index++;
                RemainningAtempts--;
                fileManager.println(WordleFeedBack.feedBackString(guess, secretWord));
            }


        }
        fileManager.escribirHistorial();
    }

    // Muestra el historial
    public void showTriedHistory(){
       for(int i =0; i < triesHistory.length; i++)
           if (triesHistory[i] != null){
               fileManager.println(triesHistory[i]);
           }
    }
    // Selecciona una palabara aleatoria de Words.txt
    public String select_Ramdom_World(String[] Words){
        int ramdon = (int) (Math.random() * Words.length);
        return Words[ramdon];

    }
    // Guarda la palabra del usuario
    public String getUserInput(Scanner scanner){
        fileManager.print("\nEscribe tu palabra de 5 letras: ");
        String guess = scanner.nextLine().toLowerCase(Locale.ROOT).trim();
        fileManager.scanerprint(guess);
        try {
            if (guess.length() != WORD_LENGTH){
                throw new WordleException("La palabra ha de ser de " + WORD_LENGTH +" letras");
            }
        }catch (Exception e){
            fileManager.println("Error: " + e.toString());
        }
        return guess;
    }
}
