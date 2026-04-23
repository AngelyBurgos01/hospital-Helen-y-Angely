package hospital;

import java.time.LocalDate;

public class Hospital {

    public static void main(String[] args) {

        Sistema sistema = new Sistema();

        // ---------------- PACIENTES ----------------
        Paciente p1 = new Paciente(1, "Ana", 30, "F", "Sarcoma", "I", "En tratamiento");
        Paciente p2 = new Paciente(2, "Luis", 40, "M", "Leucemia", "II", "Remisión");
        Paciente p3 = new Paciente(3, "Carlos", 50, "M", "Linfoma", "III", "En tratamiento");
        Paciente p4 = new Paciente(4, "Laura", 35, "F", "Sarcoma", "II", "En tratamiento");
        Paciente p5 = new Paciente(5, "Pedro", 60, "M", "Leucemia", "III", "Remisión");
        Paciente p6 = new Paciente(6, "Sofía", 28, "F", "Linfoma", "I", "En tratamiento");

        sistema.agregarPaciente(p1);
        sistema.agregarPaciente(p2);
        sistema.agregarPaciente(p3);
        sistema.agregarPaciente(p4);
        sistema.agregarPaciente(p5);
        sistema.agregarPaciente(p6);

        // ---------------- EXÁMENES ----------------
        Examen e1 = new Examen(1, LocalDate.now(), "Resonancia", "Positivo");
        Examen e2 = new Examen(2, LocalDate.now(), "Biopsia", "Negativo");

        sistema.agregarExamen(p1, e1);
        sistema.agregarExamen(p1, e2);
        sistema.agregarExamen(p2, e1);
        sistema.agregarExamen(p3, e2);

        // ---------------- TRATAMIENTOS ----------------
        Tratamiento t1 = new Tratamiento(1, "Quimioterapia", 30, "Náuseas");
        Tratamiento t2 = new Tratamiento(2, "Radioterapia", 20, "Fatiga");

        sistema.agregarTratamiento(p1, t1);
        sistema.agregarTratamiento(p1, t2);
        sistema.agregarTratamiento(p2, t1);
        sistema.agregarTratamiento(p3, t2);

        // ---------------- RESULTADOS ----------------
        sistema.contarPorTipoDeCancer();
        sistema.porcentajePorEstado();
    }
}