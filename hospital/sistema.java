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


    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        Paciente p1 = new Paciente(1, "Ana", 30, "F", "Sarcoma", "I", "En tratamiento");
        Paciente p2 = new Paciente(2, "Luis", 40, "M", "Leucemia", "II", "Remisión");
        Paciente p3 = new Paciente(3, "Carlos", 50, "M", "Linfoma", "III", "En tratamiento");
        Paciente p4 = new Paciente(4, "Laura", 35, "F", "Sarcoma", "II", "En tratamiento");
        Paciente p5 = new Paciente(5, "Pedro", 60, "M", "Leucemia", "III", "Remisión");
        Paciente p6 = new Paciente(6, "Sofia", 28, "F", "Linfoma", "I", "En tratamiento");

        sistema.agregarPaciente(p1);
        sistema.agregarPaciente(p2);
        sistema.agregarPaciente(p3);
        sistema.agregarPaciente(p4);
        sistema.agregarPaciente(p5);
        sistema.agregarPaciente(p6);

        // Exámenes
        Examen e1 = new Examen(1, LocalDate.now(), "Resonancia", "Positivo");
        Examen e2 = new Examen(2, LocalDate.now(), "Biopsia", "Negativo");

        sistema.agregarExamen(p1, e1);
        sistema.agregarExamen(p1, e2);
        sistema.agregarExamen(p2, e1);
        sistema.agregarExamen(p3, e2);

        // Tratamientos
        Tratamiento t1 = new Tratamiento(1, "Quimioterapia", 30, "Náuseas");
        Tratamiento t2 = new Tratamiento(2, "Radioterapia", 20, "Fatiga");

        sistema.agregarTratamiento(p1, t1);
        sistema.agregarTratamiento(p1, t2);
        sistema.agregarTratamiento(p2, t1);
        sistema.agregarTratamiento(p3, t2);

        // Resultados
        sistema.contarPorTipoDeCancer();
        sistema.porcentajePorEstado();
    }
}