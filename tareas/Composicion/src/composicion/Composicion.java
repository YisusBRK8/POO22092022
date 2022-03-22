/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

/**
 *
 * @author jesgm
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Libro
        Libro libr1= new Libro();
        libr1.setNombre("Donde habitan los angeles");
        libr1.setCreador(new Autor("Claudia Celis", "Mexicana"));
        libr1.setEdi(new Editorial("SM","Mexico"));
        System.out.println(libr1);
        
        //Pelicula
        Pelicula peli= new Pelicula();
        peli.setNombre("Logan");
        peli.setDir(new Director("James Mangold"," Wolverine: inmortal"));
        peli.setAct(new Actor("Hugh Jackman", 53));
        peli.setProduc(new Productora("Marvel entertainment", 1998));
        System.out.println(peli);
    }
    
}
