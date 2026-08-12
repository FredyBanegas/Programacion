/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmeticadeconsola;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class CalculadoraAritmeticaDeConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
       int num1 = 0;
       int num2 = 0;
       char operacion = 's';
       double resultado = 0;
       
       System.out.println ("Ingrese el primer numero entero: ");
       num1 = entrada.nextInt();
       
       System.out.println ("Ingrese el segundo numero entero: ");
       num2 = entrada.nextInt();
       
       System.out.println("Que operacion realizara(+, -, /, *, %):  ");
       operacion = entrada.next().charAt(0);
       
       switch (operacion){
           
           case '+':
               resultado = num1 + num2;
               System.out.println("El resultado es: " + resultado);
               break;
               
            case '-':
               resultado = num1 - num2;
               System.out.println("El resultado es: " + resultado);
               break;   
              
            case '/':
                if (num2 == 0){
                    System.out.println("ERROR");
                }else{
                    
               resultado = (double)num1 / num2;
               System.out.println("El resultado es: " + resultado);
               
               }break;
               
            case '*':
               resultado = num1 * num2;
               System.out.println("El resultado es: " + resultado);
               break;
               
            case '%':
               if (num2 == 0){
                   System.out.println("ERROR");
               }else {
               resultado = num1 % num2;
               System.out.println("El resultado es: " + resultado);    
               }break;
               
        default:
            System.out.println("Operador no reconocido");
               
               
                   
       }//FIN MAIN
       
        
    }
    
}
