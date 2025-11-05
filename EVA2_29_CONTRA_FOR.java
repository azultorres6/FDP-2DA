/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_29_CONTRA_FOR {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String pass, usu;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 4; i++) { 
        System.out.println("Intruduce el usuario");
        usu = teclado.nextLine ();
        System.out.println("Intruduce tu contraseña");
        pass = teclado.nextLine();
        
        if (usu.equals("admin") && pass.equals ("admin")) {
            System.out.println("Acceso concedido");
            break;
            
       }else if (i == 4) {        
            System.out.println("acceso denegado");
       }else {
            System.out.println("Datos incorrectos, vuelve a intentarlo");
       }
        }
        
    }
    
}
