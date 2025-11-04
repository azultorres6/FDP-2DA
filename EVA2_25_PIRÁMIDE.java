/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_pirámide;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_25_PIRÁMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese un número para la pirámide:");
        
        try {
            int n = Integer.parseInt(scanner.nextLine());
        
        // Parte superior de la pirámide
        for (int i = 1; i <= n; i++){
            String asteriscos = "";
            for(int j = 0; j < i; j++){
                asteriscos += "*";
            }
            System.out.println(asteriscos);
        }    
        
        // Parte inferior de la pirámide
        for (int i = n - 1; i >= 1; i--){
            String asteriscos = "*";
            for (int j = 0; j < i; j++){
                asteriscos += "*";
        }
        System.out.println(asteriscos); // Imprimir asteriscos
      }
    
    } catch (NumberFormatException e){
          System.out.println("Entrada inválida. Ingrese un número entero.");
    } finally {
       
      }
   }
}  
    

