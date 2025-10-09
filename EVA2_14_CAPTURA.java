/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("Cuantas calificaciones va a capturar?");
        tama = captu.nextInt();
        int califas[] = new int[tama];
        for(int i = 0; i < califas.length; i++){
            System.out.println("Califación " + (i + 1) + ":");
            califas[i] = captu.nextInt();  
        }
       for(int i = 0; i < califas.length; i++){  
          System.out.print("[" + califas [i] + "]");
          
    }
    }
    
}
