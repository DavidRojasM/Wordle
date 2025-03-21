package Programacion_Trabajo;

public class WordleFeedBack {
        //Colores

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_WHITE = "\u001B[37m";


        // Aplica color a la letra
        private static String applyColor(String letter, String color) {
            return color + letter + ANSI_RESET;
        }
        // forma la palabra con los colores correctos
        public static String feedBackString(String guess, String secretWord) {
            StringBuilder feedback = new StringBuilder();
            for(int i = 0; i< guess.length(); i++){
                if (secretWord.contains(String.valueOf(guess.charAt(i)))){
                    if (secretWord.charAt(i) == guess.charAt(i))
                        feedback.append(applyColor(String.valueOf(guess.charAt(i)), ANSI_GREEN));
                    else
                        feedback.append(applyColor(String.valueOf(guess.charAt(i)), ANSI_YELLOW));
                }else
                    feedback.append(applyColor(String.valueOf(guess.charAt(i)), ANSI_RED));
            }
            return String.valueOf(feedback);
        }
}

