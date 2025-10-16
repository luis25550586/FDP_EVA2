/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_.pkg19_.tic_tac_tor;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_19_TIC_TAC_TOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tictac [][] = new int [3][3];
        int Fila, Col, jug;
        Scanner captu = new Scanner (System.in);
        for (int i = 0; i < 10; i++)
          System.out.println("introduce tu jugada: ");
          Fila = captu.nextInt();
          System.out.println("introduce tu jugada: ");
          Col = captu.nextInt();
          System.out.println("introduce tu jugada: ");
          jug = captu.nextInt();
          tictac [Fila][Col] = jug;
          
          for(int i = 0; i < tictac.length;i++){
          for (int j = 0; j < tictac[i].length; j++){
              System.out.print( "[" + tictac [i][j]+ "]");
          }
            System.out.println();
        
    }
    }
}
