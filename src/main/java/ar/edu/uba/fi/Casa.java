package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Casa {
    private ArrayList<Material> base;
    private ArrayList<Material> ambiente;
    private int ambientes;

    public Casa(int ambientes) {
        this.ambientes = ambientes;

        iniciarRequisistosBase();

        iniciarRequisitosAmbiente();
    }

    private void iniciarRequisitosAmbiente() {
        final ArrayList<Material> ambiente;
        this.ambiente = new ArrayList<Material>();
        this.ambiente.add(new Cemento(10));
        this.ambiente.add(new Caño(100));
        this.ambiente.add(new Pintura(500));
    }

    private void iniciarRequisistosBase() {
        final ArrayList<Material> base;
        this.base = new ArrayList<>();
        this.base.add(new Cemento(50));
    }

    public Almacen construirCon(Almacen almacen) {
        almacen.consumir(this.base);

        IntStream.range(0, ambientes).forEach(
                i -> {
                    almacen.consumir(this.ambiente);
                }
        );

        return almacen;
    }
}
