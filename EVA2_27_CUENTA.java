/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in); 
        double saldo = 1000000.0; //SALDO INICIAL
        
     while (saldo > 0){
         System.out.println("Su saldo actual es: $" + saldo);
         System.out.println("¿Cuánto desea retirar?(Ingrese 0 para salir");
        
        double retiro = scanner.nextDouble();
        
        if (retiro == 0){
            System.out.println("Gracias por usar nuestros servicos");
            break; // el usuario ingreso 0
        }
        if (retiro > saldo) {
            System.out.println("No tiene fondos suficientes");
        }else{
           saldo = retiro;
            System.out.println("Retiro exitoso. Su nuevo saldo es: 0" + saldo);
        }
     }
    if (saldo <= 0); 
        System.out.println("Su cuenta se ha quedado sin fondos.");
   }  
}    
     
     
     
     
     
     
  
