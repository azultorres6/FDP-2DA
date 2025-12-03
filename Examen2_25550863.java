/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_25550863;
import java.util.Scanner;
/**
 *
 * @author PC MONSTER HUNTER
 */
public class Examen2_25550863 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionContinuar =1;
        
        while (opcionContinuar == 1) {
            
            System.out.print("Ingrese un numero entero: ");
            int num = sc.nextInt();
            
            System.out.print("¿Desea imprimir PRIMOS (1) o NO PRIMOS (2)? ");
            int opcion = sc.nextInt();
            
            System.out.println("-----------------------------");
            
          if (opcion == 1) {
                System.out.println("Los numeros primos entre 2 y " + num + " son:");
                for (int i = 2; i <= num; i++) {
                    if (esPrimo(i)) {
                        imprimirEstrellas(i);
                    }
                }
            }  else if (opcion == 2) {
                  System.out.println("Los numeros NO primos entre 2 y " + num + " son:");
                  for(int i = 2; i <= num; i++) {
                     if (!esPrimo(i)) {
                        imprimirEstrellas(i);
                     }  
                  }
               } else {
                  System.out.println("Opcion no valida. ");
                        
               }         
               System.out.println("----------------------------------");
               System.out.print("¿Desea repetir el proceso? Si(1) / No(0): ");
               opcionContinuar = sc.nextInt();
        }     
        
        System.out.println("Programa finalizado. ");
    }
    // Metodo para saber si un numero es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
            
        }
        return true;
    }

    //Metodo para imprimir el numero y sus estrellas
    public static void imprimirEstrellas(int n) {
        System.out.print(n + " ");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}    
                         
                    
                
            
        
    
    

