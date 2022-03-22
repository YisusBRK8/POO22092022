/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author jesgm
 */
public class Libro {
    private String nombre;
    private Autor creador;
    private Editorial edi;

    public Libro() {
    }

    public Libro(String nombre, Autor creador, Editorial edi) {
        this.nombre = nombre;
        this.creador = creador;
        this.edi = edi;
    }

    public Editorial getEdi() {
        return edi;
    }

    public void setEdi(Editorial edi) {
        this.edi = edi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getCreador() {
        return creador;
    }

    public void setCreador(Autor creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", creador=" + creador + ", edi=" + edi + '}';
    }
    
}
