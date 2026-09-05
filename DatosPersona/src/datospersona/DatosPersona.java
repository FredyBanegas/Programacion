/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datospersona;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class DatosPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    
    String[] nombres = new String[3];
    char[] generos = new char[3];
    int[] edades = new int[3];
    double[] pesos = new double[3];
    double[] estaturas = new double[3];
    
    for (int i = 0; i < 3; i++) {
        System.out.print ("Ingresa Nombre: ");
        nombres[i] = entrada.nextLine();
        
        System.out.println("ingrese el genero (M/F): ");
        generos[i] = entrada.next().charAt(0);
    
        System.out.println("ingrese la edad: ");
        edades[i] = entrada.nextInt();
    
        System.out.println("ingrese el peso: ");
        pesos[i] = entrada.nextDouble();
    
        System.out.println("ingrese la estatura: ");
        estaturas[i] = entrada.nextDouble();
        
        entrada.nextLine();
        System.out.println("-----------------------");
            
    }//FIN CLICLO FOR
    
    for (int i= 0; i < 3; i++){
        System.out.printf("Nombre: %s\n",nombres[i]);
        System.out.printf("Edad:%d \t, Genero: %c \n",edades[i],generos[i]);
        System.out.printf("Peso:%.2f \t, Estatura: %.2f \n",pesos[i],estaturas[i]);
        System.out.println("-----------------------");
    
    }//FIN CICLO FOR mostrando datos
    
    
   
    /**
    String nombre1 = "";
    char genero1 = '@';
    int edad1 = 0;
    double peso1 = 0.0;
    double estatura1 = 0.0;
    
    String nombre2 = "";
    char genero2 = '@';
    int edad2 = 0;
    double peso2 = 0.0;
    double estatura2 = 0.0;
    
    String nombre3 = "";
    char genero3 = '@';
    int edad3 = 0;
    double peso3 = 0.0;
    double estatura3 = 0.0;
    
    System.out.println("---------------");
    System.out.println("Primer Persona");
    System.out.println("---------------");
    
    System.out.println("ingrese el nombre: ");
    nombre1 = entrada.nextLine();
    
    System.out.println("ingrese el genero (M/F): ");
    genero1 = entrada.next().charAt(0);
    
    System.out.println("ingrese la edad: ");
    edad1 = entrada.nextInt();
    
    System.out.println("ingrese el peso: ");
    peso1 = entrada.nextDouble();
    
    System.out.println("ingrese la estatura: ");
    estatura1 = entrada.nextDouble();
    
    entrada.nextLine();
    
    
       System.out.println("---------------");
    System.out.println("Segunda Persona");
    System.out.println("---------------");
    
    System.out.println("ingrese el nombre: ");
    nombre2 = entrada.nextLine();
    
    System.out.println("ingrese el genero (M/F): ");
    genero2 = entrada.next().charAt(0);
    
    System.out.println("ingrese la edad: ");
    edad1 = entrada.nextInt();
    
    System.out.println("ingrese el peso: ");
    peso2 = entrada.nextDouble();
    
    System.out.println("ingrese la estatura: ");
    estatura2 = entrada.nextDouble();
    
    entrada.nextLine();
    
    
       System.out.println("---------------");
    System.out.println("Primer Persona");
    System.out.println("---------------");
    
    System.out.println("ingrese el nombre: ");
    nombre3 = entrada.nextLine();
    
    System.out.println("ingrese el genero (M/F): ");
    genero3 = entrada.next().charAt(0);
    
    System.out.println("ingrese la edad: ");
    edad3 = entrada.nextInt();
    
    System.out.println("ingrese el peso: ");
    peso3 = entrada.nextDouble();
    
    System.out.println("ingrese la estatura: ");
    estatura3 = entrada.nextDouble();
    
    entrada.nextLine();
    */
    
    
    
        
        
    
            
 }           
}
