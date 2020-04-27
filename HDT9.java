/*
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Autor: Diana Sosa y Martin España -Fecha: 10/03/2020
 */
package hdt9;

/**
 *
 * @author diana
 */
import java.util.*;
import java.io.*;
import java.lang.*;

public class HDT9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Factory<String,String> mapFactory = new Factory<String,String>();
        
        String FILENAME = "Spanish.txt";
        
        BufferedReader br = null;
        FileReader fr = null;
        String output = "";
        
        //empezo el programa
        
        Scanner scan = new Scanner(System.in);
        int tipoMap = 0;
        
        //Menu de mapas a elegir
        System.out.println("   *** Menu de Mapas *** ");
        System.out.println(" 1. HashMap  ");
        System.out.println(" 2. TreeMap  ");
        System.out.println(" 3. LinkedHashMap  ");
        System.out.println(" -- Ingrese el número del mapa que desea utilizar: ");
        
        //programación defensiva
        try{
            tipoMap = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e){
            scan.nextLine();
            System.out.println(" ## No ingreso un número! ##");
        }
        
        //Da error si se ingresa un número diferente a 3 o si se ingresa algún otro caracter
        while (tipoMap < 1 || tipoMap >3){
            System.out.println(" ## No ingreso una opción valida! ## ");
            System.out.println(" -- Ingrese el número del mapa que desea utilizar: ");
            
            try{
                tipoMap = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e){ 
                scan.nextLine();
                System.out.println(" ## No ingreso un número! ##");
            }
        }
 
   
        
  }
}
