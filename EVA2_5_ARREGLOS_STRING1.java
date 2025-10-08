/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string1;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_5_ARREGLOS_STRING1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int dia;
    
    
        String diasSemanas[] = new String[7];
    diasSemanas[0] = "Domingo";
    diasSemanas[1] = "Lunes";
    diasSemanas[2] = "Martes";
    diasSemanas[3] = "Miercoles";
    diasSemanas[4] = "Jueves";
    diasSemanas[5] = "Viernes";
    diasSemanas[6] = "Sabado";
    System.out.println("Introduce el dia numero (0 - 6: ");
    dia = captu.nextInt();
    System.out.println("El dia es" + diasSemanas[dia]);
    }
   }   

