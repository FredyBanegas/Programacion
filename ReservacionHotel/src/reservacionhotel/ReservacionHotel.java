/*//Fredy Banegas & Antonio Bonillo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservacionhotel;

import java.util.Random;
import java.util.Scanner;

/**
 * Menu Principal
 * 1. Cotizacion de reservacion de habitaciones.
 * 2. Reserva de Habitacion.
 * 3. Cancelar Rervacion.
 * 4. Concultar Reservacion.
 * 5. Salir.
 *
 * @author matebook-14
 */
public class ReservacionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    Random RD = new Random();
    
    int opcion = 0;
    int []totalHabit = new int[20];
    int tipoHabit = 0;
    String nombre = "";
    int ID = 0;
    int edad = 0;
    double precio = 0;
    double subTotal = 0;
    double total = 0;
    int noches = 0;
    boolean []reservado = ; 
    
    System.out.println("+++++++++++++++++++");
    System.out.println("Bienvenido al Hotel");
    System.out.println("+++++++++++++++++++");
    
    do{

   MenuPrincipal();
   
    System.out.println("+++++++++++++++++++++");
    System.out.print("Ingrese una opcion: ");  
    opcion = entrada.nextInt();
    System.out.println("---------------------");     
    
    
    
    switch (opcion){
        
        case 1:
            
            break;
        
        case 2: 
            
            Precio();
            
            break;
        case 3:
            
            Registro();
            
            break;
            
        case 4:
            break;
            
        case 5:
            break;
            
        case 6:
            System.out.println("Gracias por utilizar el sistema");
            break;
            
        default:
            System.out.println("Opcion NO Validad");
     
    }//Fin Switch           
                
    } while (opcion != 5);
    

        
    }// FIN MAIN



   public static void MenuPrincipal(){
        

    System.out.println("-------------------");
    System.out.println("  Menu Principal  ");
    System.out.println("-------------------"); 
    System.out.println("1. Habitaciones Disponibles");
    System.out.println("2. Precio de Habitaciones");
    System.out.println("3. Registro de Habitacion");
    System.out.println("4. Cancelar Registro de Habitacion");
    System.out.println("5. Reporte de Reservaciones");
    System.out.println("6. Salir");
    
    
    
    }// FIN MenuPrincipal
   
   public static void Precio(){
       
    System.out.println("Habitacion Sencilla 1200.00lps la noche");
    System.out.println("Habitacion Doble 2100.00lps la noche");
    System.out.println("Habitacion Triple 3100.00lps la noche");
    System.out.println("Habitacion Cuadruple 4200.00lps la noche");
    System.out.println("Habitacion Familiar 6000.00lps la noche");
    System.out.println("Habitacion Suit 5000.00lps la noche");
    System.out.println("Habitacion Suit Precidencial 8000.00lps la noche");
            
       
   }//Fin Precio
   
   public static void Registro(){
       
    Scanner input = new Scanner(System.in);
       
       String nombre = "";
       int edad = 0;
       double ID = 0;
       int tipoHabit = 0;
       int noches = 0;
        
    System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();
    System.out.print("Ingrese la edad: ");
        edad = input.nextInt();
    System.out.print("Ingrese el ID: ");
        ID = input.nextDouble();
    System.out.print("--Tipo de Habitacion-- \n1.Sencilla \n2.Doble \n3.Triple \n4.Cuadruple \n5.Familiar \n6.Suit \n7.Suit Precidencial \nElija la Habitacion: ");
        tipoHabit = input.nextInt();
    System.out.print("Cuantas noches se hospedara: ");
        noches = input.nextInt();
    System.out.println("--Registro Exitoso--");
       
   }//Fin de Registro
   
   
}

