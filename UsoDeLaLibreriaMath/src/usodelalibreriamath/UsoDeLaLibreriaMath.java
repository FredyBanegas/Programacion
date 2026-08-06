/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelalibreriamath;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class UsoDeLaLibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double radio;
        double area; 
        double circunferencia;
        
        System.out.println("Bienvenido");
        
        System.out.println("Ingrese el radio del circulo:  ");
          radio = entrada.nextDouble();
          System.out.println("Radio");
        
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = 2 * Math.PI * radio;
        
        System.out.printf("El area del circulo es: %.2f%n", area);
        System.out.printf("La circunferencia del circulo es: %.2f%n", circunferencia);
       
        
        entrada.close();
        
        
    }//Fin
    
}
