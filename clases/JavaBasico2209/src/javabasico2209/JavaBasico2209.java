/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jesgm
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        System.out.println("Edad= "+edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x=edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println("-------------------");
        //convertir String a entero
        String cadena="99";
        int altura= Integer.parseInt(cadena);//metodo miembro o de clases
        Color c1 = Color.BLUE;
        
        altura+=1;
        System.out.println("Altura= "+altura);
        
        float y= Float.parseFloat(cadena);
        y=y+0.5f;
        System.out.println("Altura= "+y);
        System.out.println("----------------");
        
        
        System.out.println("Troncos de un arbol = "+Arbol.tronco);
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
        
        
        int edad3=20;

        String resultado="";
        if(edad<18){
            resultado="menor de edad";
        }else{
            resultado="Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        int edad4=15;
        String res="";
        res=edad4<18?"Menor de edad 4":"Mayor de edad, tequila";
        System.out.println(res);
        
        
        int edad5=19;
        System.out.println(edad5<18?"Menor de edad 5":"Ya! el tequila");
        
        int val1=1;
        int val2=2;
        
        System.out.println(val1 &val2);
        int val3=1;
        int val4=0;
        val4=val3<<1;
        System.out.println(val4);
        
        System.out.println("ARREGLOS---------------------------------");
        
        int[]edades;
        edades=new int[5];
        System.out.println(edades);
        edades[0]=10;
        System.out.println("La primer edad es: "+edades[0]);
        
        int [] estaturas=new int[5];
        
        int [] pesos={86, 99,56, 76, 77};
        System.out.println(pesos[0]);
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
    
        System.out.println("----Con FOR--------");
        for (int i=0; i<pesos.length; i++){
            System.out.println(pesos[i]);
        }
        System.out.println("Orden inverso");
        for(int i=pesos.length-1; i>=0; i--){
            System.out.println(pesos[i]);
        }
        System.out.println("Arreglos de los alumnos");
        Alumno[] lista =new Alumno[5];
        lista[0] = new Alumno("99999", 2, 9.0f);
        lista[1] = new Alumno("77777", 2, 7.0f);
        lista[2] = new Alumno("55555", 2, 7.0f);
        lista[3] = new Alumno("88888", 2, 8.0f);
        lista[4] = new Alumno("66666", 2, 6.0f);
        
        for (int i = 0; i < lista.length; i++) {
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesenpenio());
            System.out.println("lñllñlñllñlññlñ");
        }
        
        System.out.println("Con for each...");
        for(Alumno alumno : lista){
            System.out.println(alumno.evaluarDesenpenio());
            
        }
        ArrayList<Alumno> grupo2209= new ArrayList<Alumno>();
        grupo2209.add( new Alumno("9999", 2, 9.0f));
        grupo2209.add( new Alumno("8888", 2, 8.0f));
        grupo2209.add( new Alumno("7777", 2, 7.0f));
        grupo2209.add( new Alumno("6666", 2, 6.0f));
        grupo2209.add( new Alumno("5555", 2, 5.0f));
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        System.out.println("Add con indice");
        grupo2209.add(2, new Alumno("81111", 3, 9.9f));
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        Alumno tmp= grupo2209.get(1);
        System.out.println("Alumno en index= 1 : "+tmp);
        
        System.out.println("Eliminar el index 3");
        Alumno tmp2= grupo2209.remove(3);
        System.out.println("Elemento sacado= "+tmp2);
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        System.out.println("Reemplazar el i-esimo elemento");
        Alumno tmp3 = grupo2209.set(0, new Alumno("44444", 4, 4.0f));
        System.out.println("El sacado es = " + tmp3);
        
        for (Alumno alumno : grupo2209) {
            System.out.println(alumno);
        }
        
        //Excepciones
        try {
            System.out.println("Excepciones");
            System.out.println(grupo2209.get(20));
        } catch (Exception e) {
            System.out.println("Error... revisa los indices");
        }
        System.out.println("Fin del programa");
}
}
