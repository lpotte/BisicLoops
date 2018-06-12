/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.Scanner;
/**
 *
 * @author LUIS POTTE
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de prueba, Conceptos básicos de programación.");
        System.out.println("Menú de opciones \n"
                + "0) Ciclo para \n"
                + "1) Ciclo Mientras Que \n"
                + "2) Ciclo Hacer Mientras \n");
        System.out.print("Digite una opción ");
        int i = sc.nextInt();
        switch (i){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        
    }
    
}
