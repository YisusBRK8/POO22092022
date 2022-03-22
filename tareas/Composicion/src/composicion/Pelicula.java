/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

/**
 *
 * @author jesgm
 */
public class Pelicula {
    private String nombre;
    private Director dir;
    private Actor act;
    private Productora produc;

    public Pelicula() {
    }

    public Pelicula(String nombre, Director dir, Actor act, Productora produc) {
        this.nombre = nombre;
        this.dir = dir;
        this.act = act;
        this.produc = produc;
    }

    public Productora getProduc() {
        return produc;
    }

    public void setProduc(Productora produc) {
        this.produc = produc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDir() {
        return dir;
    }

    public void setDir(Director dir) {
        this.dir = dir;
    }

    public Actor getAct() {
        return act;
    }

    public void setAct(Actor act) {
        this.act = act;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", dir=" + dir + ", act=" + act + ", produc=" + produc + '}';
    }
    
}
