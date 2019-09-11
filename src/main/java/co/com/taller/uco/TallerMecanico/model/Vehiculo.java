package co.com.taller.uco.TallerMecanico.model;



public class Vehiculo {

    private String marca;
    private String version;
    private int modelo;
    private String placa;
    private Persona propietario;
    private Cliente cliente;

    public Vehiculo(String marca, String version, int modelo, Cliente cliente) {
        this.marca = marca;
        this.version = version;
        this.modelo = modelo;
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
