/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;

import java.util.ArrayList;

/**
 *
 * @author matebook-14
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo;
        int dimension = 0;
        

        ArrayList<Integer> numeros = new ArrayList<Integer>();//int
        ArrayList<Double> decimales = new ArrayList<Double>();//double
        ArrayList<Character> letras = new ArrayList<Character>();//char
        ArrayList<String> palabras = new ArrayList<String>();//string
        ArrayList<Boolean> estado = new ArrayList<Boolean>();//boolean
        
        dimension = DimensionArrayList(numeros);
        MostrarDimension(dimension);
        
        numeros.add(10);
        numeros.add(200);
        numeros.add(-300);
        numeros.add(50);
        
        dimension = DimensionArrayList(numeros);
        MostrarDimension(dimension);
        
        numeros.add(80);
        dimension = DimensionArrayList(numeros);
        MostrarDimension(dimension);
        
        
        System.out.println("");
        System.out.println("---------------");
        System.out.println("Modificando un Valor");
        numeros.set(0, 600);
        MostrarContenidoArrayList(numeros);
        System.out.println("\nOtro Cambio");
        numeros.set(3,-40);
        MostrarContenidoArrayList(numeros);
        System.out.println("---------------");
        System.out.println("Eliminando un Valor");
        MostrarDatoEliminado(numeros);
        numeros.remove(0);
        MostrarDatoEliminado(numeros);
        numeros.remove(2);
        MostrarDatoEliminado(numeros);
        
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Eliminando Todos los valores");
        numeros.clear();
        MostrarDatoEliminado(numeros);
        
        System.out.println("");
        System.out.println("-------------");
        System.out.println("Usando For Each");
        numeros.add(10);
        numeros.add(20);   
        numeros.add(30);
        UsoForEach(numeros);
    }//Fin main
    
    
    
    public static int DimensionArrayList(ArrayList<Integer> arreglo){
        int tempo = 0;
        tempo = arreglo.size();
        return tempo;
    }//Fin funcion DimensionArrayList
    
    public static void MostrarDimension(int valor){
        System.out.printf("La dimension del ArrayList: %d\n", valor);
    }//Fin funcion MostrarDimension
    
    public static void MostrarContenidoArrayList(ArrayList<Integer> datos){
            int valor = 0;
            for (int i = 0; i < datos.size(); i ++){
                valor = datos.get(i);
                System.out.printf("Indice: %d\t ", i);
                System.out.printf("Valor [%d]: %d\n", i, valor);
            }//Fin For
   }//Fin MostrarContenidoArrayList
    
    public static void MostrarDatoEliminado(ArrayList<Integer> datos){
        int dimension = DimensionArrayList(datos);
        MostrarDimension(dimension);
        MostrarContenidoArrayList(datos);
    }//Fin Funcion MostrarDatoEliminado
    
    public static void UsoForEach(ArrayList<Integer> arreglo){
        
        for(int i: arreglo){
            System.out.printf("Valor: %d\n", i);
        }
    }//Fin UsoForEach

    
}//Fin de Class
