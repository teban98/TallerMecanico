package co.com.taller.uco.TallerMecanico.model;

public class Diagnostico {
    private int idDiagnostico;
    private double tiempoReparacion;
    private DetalleDiagnostico diagnostico;

    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(int idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public double getTiempoReparacion() {
        return tiempoReparacion;
    }

    public void setTiempoReparacion(double tiempoReparacion) {
        this.tiempoReparacion = tiempoReparacion;
    }

    public DetalleDiagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(DetalleDiagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
}
