/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;

import java.util.Scanner;

/**
 *
 * @author Azul
 */
public class EVA2_23_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int posi;
        Scanner captu = new Scanner(System.in);
        int datos[] = new int[10];

        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar");
        int valor = captu.nextInt();
        //BUSQUEDAD LINEAL

        for (int i = 0; i < datos.length; i++) {
            if (valor == datos[i]) { //lO ENCONTRAMOS
                posi = i; //rgresamos donde lo encontramos
                //ya lo encontré, detengo la búsquedad
                System.out.println("Posicion: " + (posi + 1));
                break;
            } else System.out.print ("-1");
            break;
        }

    }

}


