/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner captu = new Scanner (System.in);
        int saldo = 5000;
        int calculo;
        int pin, opc, monto;
        System.out.println ("introduce el PIN");
        pin = captu.nextInt();
        if (pin == 1234) {
            System.out.println ("1. Consultar saldo...");
            System.out.println ("2.Retirar monto...");
            System.out.println ("3.Depositar monto...");
            System.out.println("Seleciona la operación.");
            opc = captu.nextInt ();
            if (opc == 1){
                System.out.println ("Tu saldo es de " + saldo);
                monto = captu.nextInt ();
                if (monto <= saldo){
                    calculo = saldo - monto;
                    System.out.println (" Tu saldo es de " + calculo);
                    }else{
                        System.out.println("Monto Negativo!");
                }
            }else{   
                 System.out.println ("Opcion incorrecta!");
              
                 }
            }else{ 
                System.out.println("PIN incorrecto!");
                    }
                }
           }
    
    
  
