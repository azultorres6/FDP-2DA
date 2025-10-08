/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multi;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_12_TABLA_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int ini,fin;
       System.out.println ("inicio");
            ini = captu.nextInt ();
              System.out.println ("final");
              fin = captu.nextInt ();
              for (int i =1 ; i <= 10; i++){
               int mult = ini *i; 
              System.out.println(ini + "x" + i + "=" + mult);
              }
          }
   
}
