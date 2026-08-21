/*//Fredy Banegas

Simulación de Trayectoria Balística (Uso estricto de for)
Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.

• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.

• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.

• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondetrayectoriabalistica;

import java.util.Scanner;

/**
 *
 * @author matebook-14
 */
public class SimulacionDeTrayectoriaBalistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        
        
        double velocidad = 0;
        double angulo = 0;
        double gravedad = 9.8;
        double altura = 0;
        double tiempoMaximo = 0;
        int segundoMaximo = 0;
        
        
                
            System.out.println("-------------------------");
            System.out.println("Bienvenido al simulacro");
            System.out.println("-------------------------");
            
        do{
            System.out.println("Ingrese la velocidad inicial (m/s): ");
            velocidad = entrada.nextDouble();
            
            System.out.println ("La velocidad ingresada es: "+ velocidad +" m/s");
            
            if (velocidad > 0){
                System.out.println("Velocidad correcta");
            }else{ System.out.println("ERROR!!!!! La velocidad tiene que ser mayor a 0");
            
            }
        }while(velocidad <= 0);
            
            System.out.println("-------------------------------------");
            
        do {
            System.out.println("Ingrese el angulo de lanzamiento: "); 
            angulo = entrada.nextDouble();
            
            System.out.println ("El angulo ingresado es: "+ angulo +"grados");
            
            if (angulo > 1 && angulo < 89){
                System.out.println("Angulo correcto");
            }else{ System.out.println("ERROR!!!!! El angulo debe estar entre 1 y 89 grados");
            }        
        }while(angulo <= 1 || angulo >= 89);
            
            System.out.println("-------------------------------------");
            
            tiempoMaximo = (velocidad * Math.sin(Math.toRadians(angulo))) / gravedad;
            segundoMaximo = (int) Math.round(tiempoMaximo);

            
            
        for (int t = 1; t <= 10; t ++){
           
            
            altura = velocidad * Math.sin(Math.toRadians(angulo)) * t
                     - (0.5 * gravedad * Math.pow(t, 2));
            
            if(altura < 0 ){
            System.out.println("Segundo" + t + " = " + altura + "metros");
            System.out.println("El proyectil acaba de impactar en el suelo");
            break;
            
            }else if ( t == 10 || altura > 
            (velocidad * Math.sin(Math.toRadians(angulo)) * (t + 1)
            - (0.5 * gravedad * Math.pow(t + 1, 2)))) {
                
                System.out.println("Segundo " + t + " = " + altura + "metros");
                System.out.println("El proyectil alcanza su altura maxima estimada.");
            
            }else {
                System.out.println("Segundo" + t + " = " + altura + "metros");
            }
            
            
        }//FIN FOR
            
            
            
            
        }
                
    }
    
//}
