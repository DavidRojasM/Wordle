package Pruebas;

import Programacion_Trabajo.WordleFeedBack;
import Programacion_Trabajo.WordleFileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class pruebas {
    public static void main(String[] args) {
        String hola = "asda, sd, asd, asd";
        String[] holas = new String[10];
        hola = hola.replace(" ", "");
        holas = hola.split(",");
      for (int i = 0; i < holas.length;i++){
          System.out.println(holas[i]);
      }


        }


    }












