/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos.pkg66187;

/**
 *
 * @author Alondra Palma
 */
public class TipoDeDatos66187 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Elabore un programa que imprima los valores mínimos y máximos 
        //de cada uno de los tipos de datos primitivos siguientes:
        //byte, short, int, long y double.
        
        // Byte     
        System.out.println("Valor Mínimo y Máximo de byte:");
        System.out.println(Byte.MIN_VALUE + " a " + Byte.MAX_VALUE+ "\n");
        //Short
        System.out.println("Valor Mínimo y Máximo de short:");
        System.out.println(Short.MIN_VALUE + " a " + Short.MAX_VALUE + "\n");
        // Int
        System.out.println("Valor Mínimo y Máximo de int:");
        System.out.println(Integer.MIN_VALUE + " a " + Integer.MAX_VALUE + "\n");
        //Long
        System.out.println("Valor Mínimo y Máximo de long:");
        System.out.println(Long.MIN_VALUE + " a " + Long.MAX_VALUE + "\n");
        //Double
        System.out.println("Valor Mínimo y Máximo de double:");
        System.out.println(Double.MIN_VALUE + " a " + Double.MAX_VALUE + "\n");
        
        System.out.println("Valor Mínimo y Máximo de float:");
        System.out.println(Float.MIN_VALUE + " a " + Float.MAX_VALUE + "\n");
    }
    
}
