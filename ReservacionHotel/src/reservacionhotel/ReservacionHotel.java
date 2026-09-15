/*//Fredy Banegas & Antonio Bonillo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservacionhotel;


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
    static final int totalHabit = 20;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    
   
    
    
 
    
    int opcion = 0;
        
    /*
    int opcion = 0;
    static final int totalHabit = 20;
    int tipoHabit = 0;
    String nombre = "";
    int ID = 0;
    int edad = 0;
    double precio = 0;
    double subTotal = 0;
    double total = 0;
    int noches = 0;
    */
    
    System.out.println("=================================");
    System.out.println("  H O T E L   L A  V E R E D A    ");
    System.out.println("=================================");
    
    do{

   MenuPrincipal();
   
    System.out.println("=================================");
    System.out.println("    =========================   ");
    System.out.print("     *Ingrese una opcion: ");  
    opcion = entrada.nextInt();
    System.out.println("---------------------------------");     
    
    
    
    switch (opcion){
        
        case 1:
            HabitacionesDisponibles();
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
            break;
            
        case 7:
           break;
        
        case 8:
           break;
            
        case 9:
            System.out.println("Gracias por utilizar el sistema");
            break;
            
        default:
            System.out.println("Opcion NO Validad");
            
            System.out.print("Seleccione una opcion de 1 al 9");
     
    }//Fin Switch           
    
    if (opcion != 9){
        PAUSA();}        
    
            
    } while (opcion != 9);
    

        
    }// FIN MAIN



   public static void MenuPrincipal(){
        

    System.out.println("---------------------------------");
    System.out.println("        MENU PRINCIPAL   ");
    System.out.println("---------------------------------"); 
    System.out.println("1. Habitaciones Disponibles");
    System.out.println("2. Precio de Habitaciones");
    System.out.println("3. Registro de Habitacion");
    System.out.println("4. Agregar serivico");
    System.out.println("5. Mostrar Factura");
    System.out.println("6. Realizar Check-Out (SALIDA)");
    System.out.println("7. Cancelar Registro de Habitacion");
    System.out.println("8. Reporte de Reservaciones");
    System.out.println("9. Salir");
    System.out.println("---------------------------------");
    
    
    
    }// FIN MenuPrincipal
   
   public static void HabitacionesDisponibles(){
       
       System.out.println("===============================");
       System.out.println("   HABITACIONES DISPONIBLES  ");
       System.out.println("===============================");
          
    
       
       for(int i = 0 ;i < totalHabit; i ++){
           
           System.out.print("Habitacion: " + numeroHabit [i] );
           System.out.print(" | Tipo: " + tipoHabit [i] );
           
           if (Disponible [i] ){
               System.out.println(" | Estado: OCUPADA");
           } else {
               System.out.println(" | Estado: DISPONIBLE");
           }
           
       }
       
               
       
       
   }//

   
   public static void Precio(){
       
    System.out.println("=================================");
    System.out.println("   PRECIO DE LAS HABITACIONES ");
    System.out.println("=================================");
       
    System.out.println("Habitacion Sencilla 1200.00lps la noche");
    System.out.println("Habitacion Doble 2100.00lps la noche");
    System.out.println("Habitacion Triple 3100.00lps la noche");
    System.out.println("Habitacion Familiar 6000.00lps la noche");
    System.out.println("Habitacion Suit 5000.00lps la noche");
    System.out.println("Habitacion Suit Presidencial 8000.00lps la noche");
            
       
   }//Fin Precio
   
   public static void Registro(){
    System.out.println("=================================");
    System.out.println("       RESERVAR HABITACION    ");
    System.out.println("=================================");  
    
    Scanner input = new Scanner(System.in);
     
       String nombre;
       String telefono;
       String ID ;
       int tipoHabit = 0;
       int noches = 0;
       int Habitacion = 0;
       int posicion = 0;
   
    HabitacionesDisponibles();   
    System.out.println("---------------------------------");
    System.out.print("Ingrese el numero de habitacion: ");
        Habitacion = input.nextInt(); 
        input.nextLine();
    System.out.println("---------------------------------");
    posicion = Buscar (Habitacion);
    
    if (posicion == - 1){
        System.out.println("La habitacion NO EXISTE");
        
        return; 
                
    }//Fin If
    
    if (Disponible[posicion]){
       System.out.println("La habitacion ya esta ocupada");
       
       return; 
       
    }//Fin If
    
    System.out.print("Ingrese el nombre: ");
        nombre = input.nextLine();
    System.out.print("Ingrese el ID: ");
        ID = input.nextLine();
    System.out.print("Cuantas noches se hospedara: ");
        noches = input.nextInt();
    System.out.println("--Registro Exitoso--");
       
   }//Fin de Registro
   
   public static void PAUSA(){
       Scanner entrada = new Scanner(System.in);
       
       System.out.println();
       System.out.println("Presione ENTER para continuar...");
        entrada.nextLine();
   }//Fin pausa
   
    public static int Buscar(int numero){
        for
            (int i = 0; i < totalHabit; i++){
            
            if(numeroHabit[i] == numero){
                return i;
            }//
        }//Fin For
        return -1;
    }//Fin Buscar
       
    public static int [] numeroHabit = { 
        101, 102, 103, 104, 105, 106, 107, 108,
        201, 202, 203, 204,
        301, 302, 303,
        401, 402,
        501, 502,
        601
    };//Fin numeroHabit
    
    public static String[] tipoHabit = {
        "Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla","Sencilla",
        "Doble","Doble","Doble","Doble",
        "Triple","Triple","Triple",
        "Familiar","Familiar",
        "Suite","Suite",
        "Suite Presidencial",
    };
    
    public static double[] precioHabit = {
        1200, 1200, 1200, 1200, 1200, 1200, 1200, 1200,
        2100, 2100, 2100, 2100,
        3100, 3100, 3100,
        6000, 6000, 
        5000, 5000,
        8000
    };
    
    public static boolean[] Disponible = new boolean[totalHabit];
            
   
}

