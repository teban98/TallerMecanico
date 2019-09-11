package co.com.taller.uco.TallerMecanico.model;
import co.com.taller.uco.TallerMecanico.model.parametros.TipoEstadoEnum;

import java.util.Date;
import java.util.List;

public class Movimiento {

    private Date fechaRegistro;
    private Date fechaSalida;
    private TipoEstadoEnum estadoEnum;
    private Diagnostico diagnostico;
    private Vehiculo vehiculo;
    public List<Movimiento> movimientos;

    public Movimiento(Vehiculo carro) {
        this.fechaRegistro = new Date();
        this.vehiculo = carro;
    }
 //Agregamos un moviemiento
    public void agregarMovimiento(Movimiento movimiento){
        this.movimientos.add(movimiento);
    }

     //Ingresamos un vehiculo
    private void ingresarVehiculo(TipoEstadoEnum tipoEstadoEnum){
        movimientos.get(1).setEstadoEnum(TipoEstadoEnum.INGRESADO);
    }

    //Cambio estado a entregado
    private void estadoEntregado(TipoEstadoEnum tipoEstadoEnum){
        movimientos.get(1).setEstadoEnum(TipoEstadoEnum.ENTREGADO);
    }

//GETTERS AND SETTERS
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public TipoEstadoEnum getEstadoEnum() {
        return estadoEnum;
    }

    public void setEstadoEnum(TipoEstadoEnum estadoEnum) {
        this.estadoEnum = estadoEnum;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}



