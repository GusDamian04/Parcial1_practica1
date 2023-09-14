/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1_practica1;
/**
 * @author GusDamian
 */
public class Parcial1_practica1 {
    private static double sumatoria(double x1){
        System.out.println("Estoy en sumatoria, num vale: " + x1);
        double z = 10;
        if (x1 == z){
            return x1 * x1 ;
        } else { 
            return x1 * x1 + sumatoria(x1 + 1);
            // return x1 * sumatoria(Math.pow(x1, 2), y);
            //return num * sumatoria(num -1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 1;
        double resultado;
        double y = 10;
        
        System.out.println("Programa que calcula la sumatoria al de un número");
        resultado = sumatoria(x);
        System.out.println("Es: " + resultado);
    }
 }