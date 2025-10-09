/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author axelm
 */
public class Perro {
    String color;
    String raza;
    String nombre;
    int numPatas;
    int numOrejas;
    
    public Perro(){
        
    }
    public Perro(String color, String raza, String nombre, int numPatas, int numOrejas){
        this.color = color;
        this.nombre = nombre;
        this.numOrejas = numOrejas;
        this.numPatas = numPatas;
        this.raza = raza;
    }
    public void ladrar(){
        System.out.println("El perro ladra: ");
    }
    public void correr(){
        System.out.println("El corre: ");
    }
    public void comer(){
        System.out.println("El come: ");
    }
    public void saltar(){
        System.out.println("El salta: ");
    }
    public void jugar(){
        System.out.println("El juega: ");
    }
    public void imprimirPerro (){
        System.out.println("Numero de orejas: "+numOrejas);
        System.out.println("Numero de patas: "+numPatas);
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Raza: "+raza);
    }
}
