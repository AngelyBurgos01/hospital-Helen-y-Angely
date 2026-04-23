package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Sistema {

    private List<Paciente> listaPacientes;

    public Sistema() {
        listaPacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        listaPacientes.add(p);
    }

    public void agregarExamen(Paciente p, Examen e) {
        p.agregarExamen(e);
    }

    public void agregarTratamiento(Paciente p, Tratamiento t) {
        p.agregarTratamiento(t);
    }

    public Paciente buscarPaciente(int id) {
        for (Paciente p : listaPacientes) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void contarPorTipoDeCancer() {
        int sarcoma = 0, leucemia = 0, linfoma = 0;

        for (Paciente p : listaPacientes) {
            if (p.getTipoCancer().equalsIgnoreCase("Sarcoma")) sarcoma++;
            else if (p.getTipoCancer().equalsIgnoreCase("Leucemia")) leucemia++;
            else if (p.getTipoCancer().equalsIgnoreCase("Linfoma")) linfoma++;
        }

        System.out.println("Sarcoma: " + sarcoma);
        System.out.println("Leucemia: " + leucemia);
        System.out.println("Linfoma: " + linfoma);
    }

    public void porcentajePorEstado() {
        int tratamiento = 0, remision = 0;

        for (Paciente p : listaPacientes) {
            if (p.getEstadoActual().equalsIgnoreCase("En tratamiento")) tratamiento++;
            else if (p.getEstadoActual().equalsIgnoreCase("Remisión")) remision++;
        }

        int total = listaPacientes.size();

        System.out.println("En tratamiento: " + (tratamiento * 100 / total) + "%");
        System.out.println("Remisión: " + (remision * 100 / total) + "%");
    }


   