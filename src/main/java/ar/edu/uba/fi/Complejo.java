package ar.edu.uba.fi;

import java.util.stream.IntStream;

public class Complejo {
    private int nroEdificios;
    private int nroCasas;

    public Complejo(int nroEdificios, int nroCasas) {

        this.nroEdificios = nroEdificios;
        this.nroCasas = nroCasas;
    }

    public Almacen construirCon(Almacen almacen) {
        Edificio e = new Edificio(3);

        IntStream.range(0, nroEdificios).forEach(
                i -> {
                    e.construirCon(almacen);
                }
        );
        Casa c = new Casa(5);

        IntStream.range(0, nroCasas).forEach(
                i -> {
                    c.construirCon(almacen);
                }
        );

        return almacen;
    }
}
