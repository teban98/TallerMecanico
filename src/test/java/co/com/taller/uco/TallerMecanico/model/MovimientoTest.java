package co.com.taller.uco.TallerMecanico.model;


import co.com.taller.uco.TallerMecanico.model.businessException.EstadoNoValidoExeption;
import co.com.taller.uco.TallerMecanico.model.businessException.ModeloNoValidoExeption;
import co.com.taller.uco.TallerMecanico.model.parametros.TipoEstadoEnum;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MovimientoTest {
    private Movimiento movimiento;
    private int modelo = 2006;
    private Vehiculo vehiculo1 = new Vehiculo("Hyundai", "i20", 2003, "QOI324");
    private TipoEstadoEnum tipoEstadoEnum;


    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before

    public void setUp() {
        movimiento = new Movimiento(vehiculo1);
    }


    @Test
    public void agregarMovimiento() throws  ModeloNoValidoExeption{

        if (vehiculo1.getModelo() < 2006){
            List<Movimiento> movimientos = new ArrayList<>();
            movimientos.add(new Movimiento(vehiculo1));
        }
        else {

            exception.expect(ModeloNoValidoExeption.class);
            exception.expectMessage(Mensaje.Movimiento.MODELO_INVALIDO);
        }
    }

    @Test

    public void ingresarVehiculo() throws ModeloNoValidoExeption {

        movimiento.setEstado(TipoEstadoEnum.INGRESADO.getEstado());

    }

    @Test

    public void cambioEstadoEnProceso() throws EstadoNoValidoExeption {


        if (TipoEstadoEnum.EN_PROCESO.getEstado() != movimiento.getEstado()) {

            movimiento.setEstado(TipoEstadoEnum.EN_PROCESO.getEstado());

        }
        else {
            exception.expect(EstadoNoValidoExeption.class);
            exception.expectMessage(Mensaje.Movimiento.MOVIMIENTO_INVALIDO);

        }
    }

    @Test
    public void cambioEstadoListo() {

        if (TipoEstadoEnum.LISTO.getEstado() != movimiento.getEstado()) {

            movimiento.setEstado(TipoEstadoEnum.LISTO.getEstado());

        }
    }


    @Test
    public void cambioEstadoEntregado() {

        if (TipoEstadoEnum.ENTREGADO.getEstado() != movimiento.getEstado()) {

            movimiento.setEstado(TipoEstadoEnum.ENTREGADO.getEstado());
        }
    }
}




