/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos_multidim;

/**
 *
 * @author Azul
 */
public class EVA2_16_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][] = new int[3][4];
        System.out.println(matriz.length);
        System.out.println(matriz [0].length);
        System.out.println(matriz [1].length);
        System.out.println(matriz [2].length);
        
        //ciclos anidados:
        for(int i = 0; i < matriz.length; i++){//filas
            for(int j = 0; j  < matriz[i].length; j++){//columnas
                System.out.println("[" + matriz[i][j]+ "[j]");  
   }
            System.out.println("");
        }
    }
}
