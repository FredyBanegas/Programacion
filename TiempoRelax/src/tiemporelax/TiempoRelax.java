/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class TiempoRelax {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        int seleccionMenu = 0;
        
        System.out.println("Agencia De Viajes");
        System.out.printf("|%20s| |%-20s| \n", "Tanina's Travel", "Buen Viaje");
        System.out.println("---------------------------------------------");
        System.out.println("1. Japon");
        System.out.println("2. Francia");
        System.out.println("3. Nueva Zelanda");
        System.out.println("4. Canada");
        System.out.print("Respuesta: ");
        seleccionMenu = sc.nextInt();
        
        
        /*
        if/else -> Rango VALORES
        switch -> Igualdad / Todas opciones estan en el mismo nivel
        */
        
        switch (seleccionMenu){
            case 1:
                System.out.println("Bienvenido a Japon");
                System.out.println("-----------------------");
                
                
                System.out.println("A. Osaka");
                System.out.println("B. Tokio");
                System.out.println("C. Kioto");
                System.out.println("Respuesta: ");
                
                sc.nextLine(); //Limpieza de Buffer
            char seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                switch(seleccionSubMenu){
                    case 'A':
                        System.out.println("Super Nintendo World Tour");
                    break;
                    
                    case 'B':
                        System.out.println("Car Meet");
                    break;
                    
                    case 'C':
                        System.out.println("Pabellon Dorado segun GOOGLE");
                    break;
                    
                    default:
                       System.out.println("Cualquier ciudad... ");
                       System.out.println("Porque no esta la opcion");
                       System.out.println("que escogistes");
                       break;
                
                }//Fin de SwitchSubMenu
                break;
            case 2:
                System.out.println("Bienvenido a Francia");
                System.out.println("-------------------------");
                
                System.out.println("1. Paris");
                System.out.println("2. Marcella");
                System.out.println("3. Lyon");
                System.out.println("Respuesta: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().charAt(0);
                
                switch(seleccionSubMenu){
                    case '1':
                        System.out.println("Torre Eiffel");
                    break;
                    
                    case '2':
                        System.out.println("Palacio de Marshella");
                    break;
                    
                    case '3':
                        System.out.println("Elestadio!!");
                    break;
                    
                    default:
                       System.out.println("Lea ombe... no esta la opcion esa");
                }
                break; //Fin de Switch SubMenu   
            case 3:
                System.out.println("Bienvenido a Nueva Zelanda");
                System.out.println("--------------------------");
                
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbittom");
                System.out.println("C. Mildford Sound");
                System.out.println("Respuesta: ");
                
                sc.nextLine();
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);
                
                if (seleccionSubMenu == 'A'){
                    System.out.printf("%s SkyTower %s","\u001B[31m","\u001Bm[0");//Es para darle color a la respuestas.
                    
                }else if (seleccionSubMenu == 'B'){
                    System.out.printf("%s SkyTower %s","\u001B[32m","\u001Bm[0");
                    
                }else if (seleccionSubMenu == 'C'){
                    System.out.printf("%s SkyTower %s","\u001B[36m","\u001Bm[0");
                }
                break;    
            case 4:
                System.out.println("Bienvenido a Canada");
                break; 
            
                
                
                
        }// Fin de Switch MENU
// Fin de Switch MENU
        
        
    }//Fin de Main
    
}
