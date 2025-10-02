/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_examen;

import java.util.Scanner;

/**
 *
 * @author Luism
 */
public class EVA2_1_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int nata, cicli, carre, total;
        System.out.println("Tiempo de natacion; ");
        nata = captu.nextInt();
        System.out.println("Tiempo de ciclismo; ");
        cicli = captu.nextInt();
        System.out.println("Tiempo de carrera; ");
        carre = captu.nextInt();
        total = nata + cicli + carre;
        if (total < 120) && ((nata< 60) && (cicli < 60) && (carre < 60) ){
        System.out.println("Exelente");
        if (total < 120) || ((nata< 60) && (cicli < 60) && (carre < 60) )
        System.out.println("Buena");
       
            }
    }
    
}
