/*//Fredy Banegas
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordeunidadesfisicas;

import java.util.Scanner;

/**
 * 2. Conversor de Unidades Físicas (Uso Do-while)
Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
* 
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
* 
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
 *
 * @author matebook-14
 */
public class ConversorDeUnidadesFisicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        
        int opc = 0;
        double metros, pies, kilogramos, libras, centimetros, pulgadas = 0;
        int salir = 0;
        boolean condicion = false;
        
        do{
            
            System.out.println("Ingrese la opcion que desea: ");
            System.out.println("1. Metros a pies.");
            System.out.println("2. Kilogramos a libras.");
            System.out.println("3. Centimetros a pulgadas.");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            
            opc = lector.nextInt();
            
            switch(opc){
                case 1:
                    do{
                    System.out.println("Ingresar la cantidad de metros a convertir: ");
                    metros = lector.nextDouble();
                    
                    if(metros < 0)
                    System.out.println("Error, la longitud no puede ser negativa.");
                    }while (metros < 0);
                   
                    pies = metros * 3.2808;
                    System.out.println(metros+" metros equivalen a "+pies+"pies.");
                    break;
                    
                    
                    
                case 2:
                    do{
                    System.out.println("Ingresar la cantidad de kilogramos a convertir: ");
                    kilogramos = lector.nextDouble();
                    
                    if(kilogramos < 0)
                    System.out.println("Error, el peso no puede ser negativo.");
                    }while (kilogramos < 0);
                   
                    libras = kilogramos * 2.2046;
                    System.out.println(kilogramos+" kilogramos equivalen a "+libras+"libras.");
                    break; 
                    
                       
                    
                case 3:
                    do{
                    System.out.println("Ingresar la cantidad de centimetros a convertir: ");
                    centimetros = lector.nextDouble();
                    
                    if(centimetros < 0)
                    System.out.println("Error, la longitud no puede ser negativo.");
                    }while (centimetros < 0);
                   
                    pulgadas = centimetros / 2.54;
                    System.out.println(centimetros+" centimetros equivalen a "+pulgadas+"pulgadas.");
                    break;
                            
                case 4:
                    System.out.println("Programa finalizado");
                    break;
                
                default:
                    System.out.println("La opcion seleccionada no es valida");
            }//FIN SWITCH
        } while(condicion);
        }//FIN MAIN
    }
 
