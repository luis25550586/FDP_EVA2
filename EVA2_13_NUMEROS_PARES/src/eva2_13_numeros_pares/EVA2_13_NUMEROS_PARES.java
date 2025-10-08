/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_13_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System .in);
        int n1, n2;
        System.out.println("INICIO: ");
        n1 = captu.nextInt();
        System.out.println("FIN: ");
        n2 = captu.nextInt();
        
        for( int i = n1; i<=n2; i++){
            int resi = i % 2;
            if (resi == 0)
                System.out.println(i + " - ");
        }
    }
    
}
