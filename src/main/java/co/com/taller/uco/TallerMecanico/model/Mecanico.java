package co.com.taller.uco.TallerMecanico.model;

import co.com.taller.uco.TallerMecanico.model.parametros.TipoEstadoEnum;


public class Mecanico {

    private Persona persona;
    private int idMecanico;
    private Vehiculo vehiculo;


    public Mecanico(Persona persona, int idMecanico,Vehiculo vehiculo,Movimiento movimiento) {
        this.persona = persona;
        this.idMecanico = idMecanico;
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }



}
