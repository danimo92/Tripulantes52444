package model;

public class Curso {
    private int codigo;
    private String nombre;
    private char jornada;//son parámetros

    private Formador formador;

    public Curso(int pcodigo,String pnombre, char pjornada, int fCodigo, String fNombre) {//método constructor. Para poder crear objetos a través de esto
        super();// hace referencia a jerarquía
        this.codigo=pcodigo; //this es una palabra reservada
        this.jornada=pjornada;
        this.nombre=pnombre;
        formador= new Formador(fNombre,fCodigo);// Se hace aquí porue el objeto formador lo tiene curso
    }

    public int getCodigo() { //'get'
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public char getJornada() {
        return jornada;
    }

    public Formador getFormador() {
        return formador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
