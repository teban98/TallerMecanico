package co.com.taller.uco.TallerMecanico.model;

public class Cliente {

    private Persona persona;
    private int idCliente;
    private String email;
    private Vehiculo vehiculo;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente(Persona persona, int idCliente, String email,Vehiculo vehiculo) {
        this.persona = persona;
        this.idCliente = idCliente;
        this.email = email;
        this.vehiculo = vehiculo;
    }
}
