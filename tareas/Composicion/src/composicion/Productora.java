/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author jesgm
 */
public class Productora {
    private String nombre;
    private int anoFunda;

    public Productora() {
    }

    public Productora(String nombre, int anoFunda) {
        this.nombre = nombre;
        this.anoFunda = anoFunda;
    }

    public int getAnoFunda() {
        return anoFunda;
    }

    public void setAnoFunda(int anoFunda) {
        this.anoFunda = anoFunda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", anoFunda=" + anoFunda + '}';
    }
    
}
