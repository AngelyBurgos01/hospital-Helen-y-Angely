package ejercicio1;

import java.time.LocalDate;

public class Examen {

    private int id;
    private LocalDate fechaDeExamen;
    private String tipoDeExamen;
    private String resultado;

    public Examen(int id, LocalDate fechaDeExamen, String tipoDeExamen, String resultado) {
        this.id = id;
        this.fechaDeExamen = fechaDeExamen;
        this.tipoDeExamen = tipoDeExamen;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return id + " - " + tipoDeExamen + " - " + resultado;
    }
}