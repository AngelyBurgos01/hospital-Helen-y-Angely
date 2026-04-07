package ejercicio1;

public class Tratamiento {

    private int id;
    private String nombreTratamiento;
    private int duracionEnDias;
    private String efectosSecundarios;

    public Tratamiento(int id, String nombreTratamiento, int duracionEnDias, String efectosSecundarios) {
        this.id = id;
        this.nombreTratamiento = nombreTratamiento;
        this.duracionEnDias = duracionEnDias;
        this.efectosSecundarios = efectosSecundarios;
    }

    public double calcularEficacia(String tipoCancer) {
        if (tipoCancer.equalsIgnoreCase("Sarcoma")) return 60;
        if (tipoCancer.equalsIgnoreCase("Leucemia")) return 75;
        if (tipoCancer.equalsIgnoreCase("Linfoma")) return 80;
        return 50;
    }

    @Override
    public String toString() {
        return nombreTratamiento + " (" + duracionEnDias + " días)";
    }
}