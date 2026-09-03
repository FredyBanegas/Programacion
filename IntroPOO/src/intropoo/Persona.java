/*//Fredy Banegas
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intropoo;

/**
 *
 * @author matebook-14
 */
public class Persona {
    
    //Variabl - Atributos
    public String nombre;
    public int edad;
    public double estatura;
    private char genero;
    
    //constructor
    public Persona(){
     this.nombre = "JohnDoe";   
     this.edad = 15;
     this.estatura = 1.90;
     
    }
    
    public Persona(String nombre, int edad, double estatura){
      this.nombre = nombre;
      this. edad =edad;
      this.estatura = estatura;
     
      
    }
    //Funciones - Metodos
    public void ImpresionNombre (){
        System.out.println("Tu nombres: "+nombre);
    }    
    
    public void CaracteristicasPersonas(){
        System.out.println("Edad: "+ edad);
        System.out.printf("Estatura: %.2f",estatura);
        System.out.println();
        
    }
    
    public void SetGenero(char gen){
        
        this.genero = gen;
    }
    
    public char GetGenero(){
        
        return this.genero;
    }
        
}//Fin Class Persona
