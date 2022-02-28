/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectolibro;

/**
 *
 * @author jesgm
 */
public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private String idioma;
    private int paginas;

    public Libro() {
    }

    public Libro(String nombre, String autor, String editorial, String idioma, int paginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void abrir(){
        System.out.println("Se abrio el libro: "+this.nombre);
    }
    public void cerrar(){
        System.out.println("El libro "+this.nombre+ " y sus "+this.paginas+ " paginas. Se cerraron");
    }
}
