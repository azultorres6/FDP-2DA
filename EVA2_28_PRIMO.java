/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Ingrese un número entero positivo:");
            int número = scanner.nextInt();
            
            if (número <= 1) {
                System.out.println(número + "no es un número primo.");
            } else {
                boolean esPrimo = true;
                for (int i = 2; i< Math.sqrt(número); i++){
                    if (número % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo){
                    System.out.println(número + "es un número primo.");
                } else {
                    System.out.println(número + "no es un número primo.");
                }
            }}
    }
}
     
               
    
    
