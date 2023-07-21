/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author sebas
 */
public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private double c1;
    private double c2;
    private double c3;
    private double promedio;
    

     public void establecerId(int id) {
        this.id = id;
    }
    
    public int obtenerId() {
        return id;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public void establecerC1(double c1) {
        this.c1 = c1;
    }

    public void establecerC2(double c2) {
        this.c2 = c2;
    }

    public void establecerC3(double c3) {
        this.c3 = c3;
    }

    public void calcularPromedio() {
        this.promedio = (c1 + c2 + c3) / 3;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerC1() {
        return c1;
    }

    public double obtenerC2() {
        return c2;
    }

    public double obtenerC3() {
        return c3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n"
                + "calificaciones: %.2f\n%.2f\n%.2f\nPromedio: %.2f\n\n", obtenerNombre(), obtenerApellido(),
                obtenerC1(), obtenerC2(), obtenerC3(), obtenerPromedio());

        return cadena;
    }

}
