package Programacion_Trabajo;


public class Main {
    public static void main(String[] args) {
        WordleGame WG = new WordleGame();
        WordleFileManager WFM = new WordleFileManager();
        String[] listaPalabras = WFM.leerfichero();

        WG.wordleGame(listaPalabras);
        WG.start();

        }
    }
