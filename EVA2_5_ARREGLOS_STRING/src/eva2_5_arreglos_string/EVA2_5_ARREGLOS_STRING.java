/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a, b ,c;
        int x[], y, z;
        String cadenas [] = new String[7];
        cadenas [0] = "lunes";
        cadenas [1] = "Martes";
        cadenas [2] = "Miercoles";
        cadenas [3] = "jueves";
        cadenas [4] = "Viernes";
        cadenas [5] = "Sabado";
        cadenas [6] = "Domingo";
        Scanner captu = new Scanner (System.in);
        int dia;
        System.out.println("Dia de la semana (0-6): ");
        dia = captu.nextInt();
        System.out.println(cadenas[dia]);
    }
    
}
