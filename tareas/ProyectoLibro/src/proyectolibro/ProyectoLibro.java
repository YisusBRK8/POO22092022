/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolibro;

/**
 *
 * @author jesgm
 */
public class ProyectoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Buenas tardes");
        System.out.println("Ejemplo : ");
        
        Libro libr1= new Libro();
        libr1.setNombre("Donde habitan los angeles");
        System.out.println("Nombre del libro: "+libr1.getNombre());
        libr1.setAutor("Claudia Celis");
        System.out.println("Autora: "+libr1.getAutor());
        libr1.setEditorial("SM");
        System.out.println("Editorial: "+libr1.getEditorial());
        libr1.setPaginas(130);
        System.out.println("Numero de paginas: "+libr1.getPaginas());
        libr1.setIdioma("Español");
        System.out.println("Idioma del libro: "+libr1.getIdioma());
        libr1.abrir();
        libr1.cerrar();
    }
    
}
