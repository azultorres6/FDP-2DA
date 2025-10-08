/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_9_for;
import java.util.Scanner;
/**
 *
 * @author azul
 */
public class EVA_9_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("mensaje a repartir");  
        mensaje = captu.nextLine();    
        System.out.println("cantidad de repeticiones");
        rep = captu.nextInt();
        for(int i = 1; i <= rep; i++){
        System.out.println (mensaje);
    }
    }
    }
      
