package co.com.taller.uco.TallerMecanico.model.parametros;

public enum TipoEstadoEnum {

    INGRESADO(1,"Ingresado"),
    EN_PROCESO(2,"En proceso"),
    LISTO(3,"Listo"),
    ENTREGADO(4,"Entregado");

    private int estado;
    private String descripcion;

    TipoEstadoEnum(int estado, String descripcion) {
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public String getDescripcion() {
        return descripcion;
    }
}