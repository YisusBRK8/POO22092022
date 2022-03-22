/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author jesgm
 */
public class Director {
    private String nombre;
    private String otraPeli;

    public Director() {
    }

    public Director(String nombre, String otraPeli) {
        this.nombre = nombre;
        this.otraPeli = otraPeli;
    }

    public String getOtraPeli() {
        return otraPeli;
    }

    public void setOtraPeli(String otraPeli) {
        this.otraPeli = otraPeli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", otraPeli=" + otraPeli + '}';
    }
    
}
