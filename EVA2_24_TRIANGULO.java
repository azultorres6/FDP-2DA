/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;



/**
 *
 * @author Azul
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para el tríangulo");
     try {
        int n = Integer.parseInt(scanner.nextLine());
        // Código para generar el tríangulo de asteriscos 
        for (int i = 1; i <= n; i++){
                String asteriscos = "*"; // Reinciar la cadena en cada fila
                for (int j = 0; j < i; j++){
                     asteriscos += "*";
                }    
                System.out.println(asteriscos);
        } 
     } catch (NumberFormatException e){
          System.out.println("Entrada inválida. Ingresa un número entero.");
      }     
    } 
}    
            
         
            
            
            
            
          
       
        
        
        
        
        
         
    
   
    
