/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un número para calcular su factorial:");
        
        try {
            int número = Integer.parseInt(scanner.nextLine());
            
            if(número < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                long factorial = 1;
                for ( long i = 1; i <= número; i++) {
                     factorial *= i;
            }  
            System.out.println("El factorial de " + número + "es:" + factorial);
            
            }    
                
        } catch (NumberFormatException e) {  
              System.out.println("Entrada inválida. ingrese un número entero.");  
        } finally {
                scanner.close();
             }
        }
}