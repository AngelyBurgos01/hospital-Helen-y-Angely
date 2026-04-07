package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private int id;
    private String nombre;
    private int edad;
    private String genero;
    private String tipoCancer;
    private String etapa;
    private String estadoActual;
    private List<Examen> listaExamenes;
    private List<Tratamiento> listaTratamientos;

    public Paciente(int id, String nombre, int edad, String genero, String tipoCancer, String etapa, String estadoActual) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.tipoCancer = tipoCancer;
        this.etapa = etapa;
        this.estadoActual = estadoActual;
        listaExamenes = new ArrayList<>();
        listaTratamientos = new ArrayList<>();
    }

    public void agregarExamen(Examen e) {
        listaExamenes.add(e);
    }

    public void agregarTratamiento(Tratamiento t) {
        listaTratamientos.add(t);
    }

    public int getId() {
        return id;
    }

    public String getTipoCancer() {
        return tipoCancer;
    }

    public String getEstadoActual() {
        return estadoActual;
    }
}