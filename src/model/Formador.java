package model;

public class Formador {
    private String nombre;
    private int codigo;

    public Formador(String nombre, int codigo) {//'ctor' es el constructor
        super();
        this.codigo=codigo;
        this.nombre=nombre;

    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
}
