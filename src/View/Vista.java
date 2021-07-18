package View;

import model.Curso;
import model.Formador;

public class Vista {
    public static void main(String[] args) {// 'main' main es para puntos de entrada. Con él se crea un objeto = es un espacio de memoria
        // el objeto tiene informacion en ese espacio de memoria
        // si el objeto es una persona, debe tener informacion de la persona
        // si el objeto tiene 100 atributos, el objeto tiene informacion de los 100 atributos
        Curso cursoFrances = new Curso(52441, "Frances 101", 'N', 7400,"Guillaume");
        Curso cursoItaliano = new Curso(52442, "Italiano 102", 'T', 5800,"Vladimir Putin");

        Formador profesor =new Formador ("Carlitos",321654);
        System.out.println(profesor.getCodigo());

        System.out.println(cursoFrances.getFormador().getNombre());
        System.out.println(cursoFrances.getFormador().getCodigo());
        System.out.println(cursoItaliano.getFormador().getNombre());
        System.out.println(cursoItaliano.getFormador().getCodigo());

        System.out.println(cursoFrances.getCodigo());// ES el print de java 'syso' // Va a buscar el atributo código que es 52441
        System.out.println(cursoFrances.getJornada());
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoItaliano.getNombre());
        cursoFrances.setNombre("Hola");
        System.out.println(cursoFrances.getNombre());
        System.out.println(cursoItaliano.getNombre());
        System.out.println(cursoFrances.getFormador());
    }
}
