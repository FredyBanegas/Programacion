/*//Fredy Banegas #61651218
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double interes;
        int tiempo;
        int tasa;
        double capital;
        
        System.out.println("Bienvenido");
        System.out.println("Ingrese el capital inicial:  ");
        capital = entrada.nextDouble();
        
        System.out.println("Ingrese la tasa de interes anual (%);  ");
        tasa = entrada.nextInt();
        
        System.out.println("Ingrese el tiempo en anios;   ");
        tiempo = entrada.nextInt();
        
        interes = (capital * tasa * tiempo) / 100;
        
        System.out.printf("%n El interes es: %.2f%n", interes);
           
    }//Fin
    
}
