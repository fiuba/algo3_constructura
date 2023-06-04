package ar.edu.uba.fi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstructuraTest {

    @Test
    public void construir_casa_de_5_ambientes() {
        Almacen almacen = new Almacen(new Cemento(100), new Caño(500), new Pintura(2500));
        Casa c = new Casa(5);

        Almacen restante = c.construirCon(almacen);
        assertEquals(
                new Almacen(new Cemento(0), new Caño(0), new Pintura(0)),
                restante
        );
    }

    @Test
    public void construir_edificio_de_5_pisos() {
        Almacen almacen = new Almacen(
                new Cemento(100 /* casa */ + 100 /* base */ + (1 * 100) + (2 * 100) + (3 * 100)),
                new Caño(500 /* casa */ + 100 /* base */ + (3 * 100)),
                new Pintura(2500 /* casa */ + 100 /* base */ + (3 * 100)));
        Edificio c = new Edificio(3);

        Almacen restante = c.construirCon(almacen);
        assertEquals(
                new Almacen(new Cemento(0), new Caño(0), new Pintura(0)),
                restante
        );
    }

    @Test
    public void construir_complejo_de_5_edificio_y_5_casas() {
        int totalCemento = 2 * (100 /* casa */ + 100 /* base */ + (1 * 100) + (2 * 100) + (3 * 100))
                +
                1 * (100);
        int totalCaño = 2 * (500 /* casa */ + 100 /* base */ + (3 * 100))
                +
                1 * (500);
        int totalPintura = 2 * (2500 /* casa */ + 100 /* base */ + (3 * 100))
                +
                1 * (2500);
        Almacen almacen = new Almacen(
                new Cemento(totalCemento),
                new Caño(totalCaño),
                new Pintura(totalPintura));
        Complejo c = new Complejo(2, 1);

        Almacen restante = c.construirCon(almacen);
j        assertEquals(
                new Almacen(new Cemento(0), new Caño(0), new Pintura(0)),
                restante
        );
    }
}
