/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentoentiendasotfware;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class DescuentoEnTiendaSotfware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        int edadCliente = 0;
        char membresiaPrem = 's';
        double precioOriginal = 0;
        double precioConDescuento = 0;
        double porcentajeDescuento = 0;
        
        System.out.println("Bienvenido");
        System.out.println("Porfavor ingrese la edad del cliente: ");
        edadCliente = entrada.nextInt();
        
        System.out.println("Tiene membresia Premium: ");
        membresiaPrem = entrada.next().charAt(0);
        
        
        
        if (edadCliente>=18){
            
            if ( edadCliente>=65 || membresiaPrem == 's' || membresiaPrem == 'S'){
             porcentajeDescuento = 0.20;
             System.out.println("Aplica al 20% de descuento");
          
            }else{
              porcentajeDescuento = 0.10;
              System.out.println("Aplica al 10% de descuento");
            }//FIN IF
           
      }else{
                
            if (edadCliente>=12 || membresiaPrem == 's' || membresiaPrem == 'S' ){
             porcentajeDescuento = 0.15;
             System.out.println("Aplica al 15% de descuento");
             
            }else{
              porcentajeDescuento = 0.0;
              System.out.println("No aplica al descuento");
          }
        }//FIN IF
        
        
        System.out.println("Precio de venta original: ");
        precioOriginal = entrada.nextDouble();
        
        
        precioConDescuento = precioOriginal - (precioOriginal * porcentajeDescuento);
        
        System.out.println("Porcentaje con descuento aplicado: " + (porcentajeDescuento * 100) + "%");
        System.out.println("Precio de venta original: " + precioOriginal);
        System.out.println("Nuevo total a pagar: " + precioConDescuento);
        
   
        
    }//FIN MAIN
    
}
