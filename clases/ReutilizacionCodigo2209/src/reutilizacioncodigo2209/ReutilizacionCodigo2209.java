/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Servidor;
import ico.fes.herencia.polimorfismo.Animal;
import ico.fes.herencia.polimorfismo.Perro;
import javax.swing.JFrame;
import reutilizacioncodigo2209.ico.fes.componentes.Monitor;
import reutilizacioncodigo2209.ico.fes.componentes.Mouse;
import reutilizacioncodigo2209.ico.fes.componentes.Procesador;
import reutilizacioncodigo2209.ico.fes.componentes.Teclado;
/**
 *
 * @author jesgm
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=new String("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
       
        /*JFrame ventana= new JFrame("Mi primer ventana java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);*/
        Computadora miCompu=new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("intel", 2.6f));
        System.out.println(miCompu);
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        //ejercicio. Establecer un mouse marca Logitech del tipo optico
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        Computadora Compu2= new Computadora("Apple", "McBook Pro", new Monitor("Toshiba", 14.3f), new Mouse("Actek", "Optico"), new Teclado("Apple", 101), 
                new Procesador("M1", 2.4f));
        System.out.println(Compu2);
        
        Compu2.getRaton().setMarca("Apple");
        Compu2.getRaton().setTipo("Touch");
        System.out.println(Compu2);
        
        System.out.println("*************************************************");
        Alumno alu1= new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        Alumno alu2=new Alumno("1232314212", "ico", "Jose Perez", 19);
        System.out.println(alu2);
        
        alu1.setNumeroDeCuenta("28838728173");
        alu1.setEdad(19);
        System.out.println(alu1);
        
        System.out.println("---------------------Composicion y herencia en la misma clase--------------------------");  
        Servidor server = new Servidor();
        System.out.println(server);
        server.setNumeroTarjetasRed(2);
        System.out.println(server);
        server.setMarca("HP");
        System.out.println(server);
        server.setRaton(new Mouse("LG", "Optico"));
        System.out.println(server);
        server.getRaton().setMarca("Logitech");
        System.out.println(server);
         
        System.out.println("-----------ejemplo polimorfismo-------------");
        
        Perro dog= new Perro("Bull dog", "5 estrellas", 4);
        Animal animal= new Animal(4);
        dog.emitirSonido();
        animal.emitirSonido();
}
}
