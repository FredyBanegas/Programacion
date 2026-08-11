/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobaciondemateria;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class SistemaDeAprobacionDeMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        String nombreCompleto = "Basilio";
        double parcial1 = 0;
        double parcial2 = 0;
        double promedioFinal = 0.0;
        
        
        
        System.out.println("Bienvenido");
        System.out.println("Cual es el nombre del estudiante? ");
        nombreCompleto = entrada.nextLine();
        
        System.out.println("Ingrese porfavor la nota del Primer Parcial: ");
        parcial1 = entrada.nextDouble();
        
        System.out.println("Ingrese porfavor la nota del segundo Parcial: ");
        parcial2 = entrada.nextDouble();
        
        promedioFinal = (parcial1 + parcial2)/2;
          System.out.println("Promedio final es: " + promedioFinal);
          
        
      if (promedioFinal>=65.0){
          System.out.println("APROBADO");
          
          
          
          
    
      }else{
          System.out.println("REPROBADO");
          
    
               
       
          
          
      }
                
        
        
        
        
        
        
    }
    
}
