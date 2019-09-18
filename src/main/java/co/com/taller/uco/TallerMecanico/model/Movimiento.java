package co.com.taller.uco.TallerMecanico.model;
import co.com.taller.uco.TallerMecanico.model.businessException.EstadoNoValidoExeption;
import co.com.taller.uco.TallerMecanico.model.parametros.TipoEstadoEnum;

import java.util.Date;
import java.util.List;

public class Movimiento {

    private Date fechaRegistro;
    private Date fechaSalida;
    private TipoEstadoEnum estadoEnum;
    private Diagnostico diagnostico;
    private Vehiculo vehiculo;
    private List<Movimiento> movimientos;
    private int estado;

    public Movimiento(Vehiculo carro) {
        this.fechaRegistro = new Date();
        this.vehiculo = carro;
    }

 //Agregamos un moviemiento
    public void agregarMovimiento(Movimiento movimiento){
        this.movimientos.add(movimiento);
    }

     //Ingresamos un vehiculo
    private void ingresarVehiculo(TipoEstadoEnum tipoEstadoEnum) throws EstadoNoValidoExeption {
        for (Movimiento movimiento : movimientos){
        estado = TipoEstadoEnum.INGRESADO.getEstado();
    }
    }

    //Cambiar estado a en proceso
    private void cambiarEstadoEnProceso(TipoEstadoEnum tipoEstadoEnum,Movimiento carro) throws EstadoNoValidoExeption {

        for (Movimiento movimiento : movimientos){
            if (carro.getEstado()!= TipoEstadoEnum.EN_PROCESO.getEstado()){
                carro.setEstado(TipoEstadoEnum.EN_PROCESO.getEstado());
        }
        }
    }
    private void cambiarEstadoListo(TipoEstadoEnum tipoEstadoEnum,Movimiento carro) throws EstadoNoValidoExeption {

        for (Movimiento movimiento : movimientos){
            if (carro.getEstado() != TipoEstadoEnum.LISTO.getEstado()){
                carro.setEstado(TipoEstadoEnum.LISTO.getEstado());
            }
        }
    }

    public int verEstado (){
        return estado;
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

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getEstado() throws EstadoNoValidoExeption {
        if(estado == estadoEnum.getEstado()){
            throw new EstadoNoValidoExeption(Mensaje.Movimiento.MOVIMIENTO_INVALIDO);
        }
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}



