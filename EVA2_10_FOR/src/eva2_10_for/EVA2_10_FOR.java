/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // IMPRIME NUMEROS DEL 1 AL 20
        for(int i = 1; i <= 20;i++){
            System.out.print(i + " - ");
        }
        System.out.println("");
        for(int i = 20; i >= 1;i--){
            System.out.print(i + " - ");
        }
        // += -= *= /=
        System.out.println("");
        for(int i = 0; i <= 100;i+=2){
            System.out.print(i + " - ");
        }
        System.out.println("");
        for(int i = 100; i >= 0;i-=2){
            System.out.print(i + " - ");
        }
        // SOLISITAR DOS NUMEROS AL USUARIO, IMPRIMIR LA LISTA
        //ENTRE ESOS NUMEROS
        // -3 Y 3 --> -3 -2 -1 0 1 2 3
        System.out.println("");
        Scanner captu = new Scanner (System .in);
        int n1, n2;
        System.out.println("Dame un numero: ");
        n1 = captu.nextInt();
        System.out.println("Dame otro numero: ");
        n2 = captu.nextInt();
        for (int i = n1; i <= n2;i++){
            System.out.println(i);
        }
        System.out.println("");
        
        int N1, N2;
        System.out.println("Dame un numero: ");
        N1 = captu.nextInt();
        System.out.println("Dame otro numero: ");
        N2 = captu.nextInt();
        for (int i = N1; i >= N2;i--){
            System.out.println(i);
        }
    }
    
}
