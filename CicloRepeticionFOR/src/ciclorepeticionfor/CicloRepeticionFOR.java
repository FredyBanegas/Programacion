/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class CicloRepeticionFOR {

    /**
     * Objetivo
     * 1. Importar ciclo de repeticion.
     * 2. Uso de CONSTANTES
     *  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        /**
        * Se quiere contabilizar la cantidad
        * de minutas que se entregan a los ninos
        * y ninias en una fuesta. con ellos sacar el porcentaje  
        * de cuantos fueron ninios y ninias
        *
        1. VARIABLE CONBTROL -> VALOR INICIAL
        2. CONDICION -> LIMITR
        3. MODIFICADOR -> INCREMENTO / DECREMENTO
        */
        
        for (int i = 0 ; i<10 ;i++) {
            System.out.printf("valor: %d\n", i);
        }// fin de ciclo FOR
        
        System.out.println("");
        System.out.println("2do ciclo FOR");
        
        for (int i = 2; i < 10; i +=2){
             System.out.printf("Valor: %d\n", i);
        }//Fin de ciclo FOR
        
        //DECLARACION DE VARIABLES
        Scanner sc = new Scanner (System.in);
        final int TOTAL = 10;//Ventajas de trabajar con constante.
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion ='a';
        double porcentaje = 0.0;
        
        for (int i = 0; i < TOTAL; i++) {
            System.out.printf("%d) Quien viene x minuta?\n", i+1);
            System.out.println("V: varon / M: Mujer");
            System.out.print("Respuesta: ");
            seleccion = sc.next().toUpperCase().charAt(0);
            
            switch (seleccion){
                case 'V':
                    System.out.println("Varon comeindo minuta");
                    numVarones++;
                    break;
                case 'M':
                    System.out.println("Mujer comiendo minuta");
                    numMujeres++;
                    break;
                  
                default:
                    System.out.println("Seleccion no valida");
                    break;
            }//Fin de Swhitch
            
            
        }//Fin de Ciclo FOR
        
            System.out.println("Porcentaje de Varones");
            porcentaje = (double)numVarones / TOTAL;
            System.out.printf("porcentaje: %.2f\n", porcentaje);
            
            System.out.println("Porcentaje de Mujeres");
            porcentaje = (double)numMujeres / TOTAL;
            System.out.printf("porcentaje: %.2f\n", porcentaje);
            
        
        
        
    }//Fin de Main
    
}//Fin
