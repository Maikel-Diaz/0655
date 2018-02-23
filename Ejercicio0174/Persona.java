import java.util.*;
/**
 * Write a description of class Persona here.
 * 
 * @author (Michael Díaz) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;
    private boolean sexoMasculino;
    private int peso;
    private int altura;
    private int edad;
    private int caloriasConsumidas;
    private int caloriasComidas;
    private int metabolismoBasal;

    /**
     * Constructor de objetos persona, en el se inicializan los valores
     * que tiene una persona. El nombre, si es hombre o no,
     * su peso en Kg, su altura en cm, su edad y su capacidad 
     * maxima de metabolismo.
     */
    public Persona(String nombre, boolean sexoMasculino, int pesoPersona, int alturaPersona, int edad)
    {
        // initialise instance variables
        nombrePersona = nombre;
        this.sexoMasculino = sexoMasculino;
        peso = pesoPersona;
        altura = alturaPersona;
        this.edad = edad;
        caloriasConsumidas = 0;
        caloriasComidas = 0;
        if(sexoMasculino == true){
            metabolismoBasal = (10 * peso) + (6 * altura) + (5 * edad) + 5;
        }
        else{
            metabolismoBasal = (10 * peso) + (6 * altura) + (5 * edad) - 161;
        }
    }
    
    /**
     * Devuelve las calorias consumidas hasta el momento.
     */
    public int getCaloriasIngeridas(){
        return caloriasConsumidas;
    }
    
    /**
     * 
     */
    public int comer(Comida comida){
        if(caloriasConsumidas <= metabolismoBasal){
            caloriasComidas = comida.getCaloriasComida();
            caloriasConsumidas = caloriasConsumidas + caloriasComidas;
        }
        else{
            System.out.println("Estoy lleno, no quiero mas comida, gracias");
            caloriasComidas = -1;
        }
        return caloriasComidas;
    }
    

}
