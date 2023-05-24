package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Edificio {

    private ArrayList<Material> base;
    private int nroPisos;

    public Edificio(int nroPisos) {
        this.nroPisos = nroPisos;

        iniciarRequisitosBase();

    }

    private void iniciarRequisitosBase() {
        this.base = new ArrayList<>();
        this.base.add(new Cemento(100));
        this.base.add(new Caño(100));
        this.base.add(new Pintura(100));
    }

    private void consumirBase(Almacen almacen) {

        almacen.consumir(this.base);
    }
    public Almacen construirCon(Almacen almacen) {
        consumirBase(almacen);
        consumirVivienda(almacen);

        IntStream.range(0, nroPisos).forEach(
                i -> {
                    consumirPlanta(almacen, i + 1);
                }
        );

        return almacen;
    }

    private void consumirPlanta(Almacen almacen, int nroPlanta) {
        ArrayList<Material> materialesPlanta = new ArrayList<>();
        materialesPlanta.add(new Cemento(100 * nroPlanta));
        materialesPlanta.add(new Caño(100));
        materialesPlanta.add(new Pintura(100));

        almacen.consumir(materialesPlanta);
    }

    private void consumirVivienda(Almacen almacen) {
        Casa c = new Casa(5);
        c.construirCon(almacen);
    }
}
