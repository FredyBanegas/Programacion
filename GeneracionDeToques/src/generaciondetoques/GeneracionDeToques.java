/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciondetoques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class GeneracionDeToques {

    /**
     * * Objetivos 
     * 1. Utilizar el ciclo de repeticion DO - WHILE
     * 2. Uso de Nuevas Librerias
     *      a. Random
     * 3. Uso de Otras Funciones de String
     * 
     * Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo.
     * 
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
     
     * @param args the command line arguments **el nombre empice con RT o SW Ccon 8 caracteres
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random RD = new Random(); //Es una libreria para liberar aleatorios tipos decimal, flotantes, enteros etc.     
        
        boolean longitudCorrecta = true;
        boolean prefijoCorrecto = true;
        boolean validacionCorrecta = true;
        
        String nombreEquipo = "a";
        
        int tipocaracter = 0;
        int numerotoken = 0;
        char letratoken = 'a';
        String token = "A";
        
        
        
        do {
            
        
        System.out.println("Bienvenido, Inngrese el nombre de su equipo: ");
        nombreEquipo = entrada.nextLine().toUpperCase();
       
        System.out.printf("Nombre del equipo es %s\n", nombreEquipo);
        
        longitudCorrecta = nombreEquipo.length() == 8;
        prefijoCorrecto = nombreEquipo.startsWith("RT") || nombreEquipo.startsWith("SW");
        
        //System.out.prinln(longitudCorrecta);
        //System.out.prinln(prefijoCorrecto);        
         
        validacionCorrecta = longitudCorrecta && prefijoCorrecto ;
        
        } while (!validacionCorrecta); //Se va a ejecutar al menos una vez, no importa sea true o false
        
        System.out.println("Registro Correcto");
        
        while (token.length() < 12){
            
            tipocaracter = RD.nextInt(2);
            
            if (tipocaracter == 0){    // el doble == sirve para comparar.
                numerotoken = RD.nextInt(10);
                token = token + numerotoken; //el simbolo + en cadena lo une, lo enlaza (token es cadena y numero token es entero)
            }// en if
            else{
            letratoken = (char) (RD.nextInt(26)+65);//TODO LO DE ESTE RENGLON ES UN CASTING. Y ES UN ACONVERSION TEMPORAL DE ENTERO A DOUBLE.
            token = token + letratoken;
            }//en else
        }
        System.out.printf("token es: %s", token);
    }//Fin de main
    
}
