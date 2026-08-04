/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 * Objetivos
 *    1.Estructura de Seleccion Anidadas
 *    2.Operadores Booleanos
 *      a. AND  &&
 *      b. OR   ||
 *      c. NOT  !
 *    3.Operacion Ternaria
 */
public class DonacionDeSangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Scanner entrada = new Scanner (System.in);
        
        int edad = 0;
        int peso = 0;
        char comio = 'a';
        int niveles = 0;
        String genero = "x"; //Puedo haber sido con char tambien.
        
        System.out.println("Ingrese la edad:");
        edad = entrada.nextInt();
        
        System.out.println("edad");
        
        System.out.println("Ahora ingrese el peso:");
        peso = entrada.nextInt();
        
        System.out.println("peso");
        
        if (edad>=18 && edad<=65 && peso>=110){
            
            entrada.nextLine();
            
            System.out.println("Ya comio?");
            comio = entrada.nextLine().charAt(0);
        
            if(comio == 'S'||comio == 's' ){
               System.out.println("Si se puede donar"); 
            }
            else{
                System.out.println("Necesita comer!");
            }
        }
            else
            
            System.out.println("No se puede donar");
        
        System.out.println("Cuales son sus niveles de hierro?");
        niveles = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Masculino o femenino: ");
        genero = entrada.nextLine().toUpperCase(); //toUpperCase significa convertir a mayuscula el tipo de letra.
        
        if ((niveles >= 14 && genero.equals("MASCULINO")) ||
           (niveles >= 12 && genero.equals("FEMENINO"))){
            
            System.out.println("Si se puede donar sangre");
        }
        else {
            System.out.println("No se puede donar sangre");
        }    
    } 
}
