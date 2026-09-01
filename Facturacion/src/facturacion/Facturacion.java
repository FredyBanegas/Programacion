/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

import java.util.Scanner;

/**
 * 
 * Objetivos
 * 1. Definir el concepto de funcion/metodo
 * 2. conocer la estructura de una funcion.
 * 3. Implementar funciones en el algoritmo.
 * 
 * caracteristicas de las Funciones/Metodos
 * 1. Reutilizable
 * 2. Modular -> Pequenias Tareas
 * 3. Mantenimiento
 * 
 * Estructura de una funcion
 * 1. Acceso de la funcion
 *        Public,Private,protected
 * 2. Tipo de Dato Retorna/Devuelve
 *        int, double
 *        char, string
 *        boolean, long
 *        arraylist ...
 * 3. Nombre de la funcion
 * 4. Parametro de Trabajo
 *        int, double
 *        char, string
 *        boolean, long
 *        arraylist ...
 *
 * @author matebook-14
 */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        
    
        //2da Funcion
        System.out.print("Ingresa el Precio del Producto: ");
        precioProducto = scan.nextInt();
        precioProducto = ValidacionNumerica(precioProducto,scan);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scan.nextInt();
        cantidad = ValidacionNumerica(cantidad,scan);
        
        subTotal = precioProducto * cantidad;
       
        //3re Funacion
        total = Calculos(subTotal,ISV);
        
        //4to Funacion
        ResultadoFactura(subTotal,descuento,impuesto,total);
        
     
    }//fin de main
    
   
    /**
     * Funcion con las siguientes coracteristicas
     * Sin Parametros
     * Sin Retorno
     * */
    public static void MensajeBienvenida(){
        
        System.out.println("---------------------------");
        System.out.println(" Sistema de Facturacion");
        System.out.println(" La logica de Programacion");
        System.out.println("---------------------------");
        
        
            
    }//Fin de la Funcion MensajeBienvenid
    
    public static int ValidacionNumerica(int numero, Scanner input){
        int numeroValido = numero;
        final int LIMITE = 0;
         
        do{
            if(numeroValido<LIMITE){
              System.out.println("Valor numerico no puede");   
              System.out.println("Ser menos a 0");
              System.out.println("Ingrese nuevamente el dato");
              numeroValido = input.nextInt();
            }
            
        }while (numeroValido<LIMITE);
        return numeroValido;
    }//Fin funcion ValidacionNumerica
    
    public static double Calculos(double sub, double valor){
        double resultadoCalculo = 0;
        double descuento = 0;
        double impuesto = 0;
        
         if(sub >100){
            descuento = sub *0.10;
        }
        else{
            descuento = 0;
        }
         
         impuesto = (sub - descuento)*valor;
        resultadoCalculo = sub - descuento + impuesto;
        
        return resultadoCalculo;
    }
    
    public static void ResultadoFactura(double sub, double des, double imp, double tot){
        
        
        System.out.printf("\nSubtotal: %.2f",sub);
        System.out.printf("\nDescuento: %.2f",des);
        System.out.printf("\nImpuesto: %.2f",imp);
        System.out.printf("\nPrecio a Pagar: %.2f",tot);
        
    }//Fin Funcion ResultadoFactura
    
}
