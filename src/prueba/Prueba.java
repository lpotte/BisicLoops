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
                + "2) Ciclo Hacer Mientras \n"
                + "3) Condicional \n"
                + "4) Salir");        
        System.out.print("Digite una opción ");
        int i = sc.nextInt();
        switch (i){
            case 0:
                for (int j=0; i<=9 ;j++){
                    System.out.println("Loop for!! "+j);
                }
                break;
            case 1:
                int k = 0;
                while(k<=9){
                    System.out.println("loop while!! "+k);
                    k++;
                }
                break;
            case 2:
                int f = 0;
                do{
                    System.out.println("loop do while!! "+f);
                    f++;
                }while (f<=10);
                break;
            case 3: 
                System.out.println("Digite ");
                break;
            case 4:
                System.out.println("Salida exitosa");
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        
    }
    
}
