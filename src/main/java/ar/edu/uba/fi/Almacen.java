package ar.edu.uba.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Almacen {

    private final ArrayList<Material> materiales;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen almacen = (Almacen) o;
        return Objects.equals(materiales, almacen.materiales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materiales);
    }

    public Almacen(Material... materiales) {
        this.materiales = new ArrayList<>();

        this.materiales.addAll(List.of(materiales));
    }

    public void consumir(ArrayList<Material> consumos) {

        for(Material m : consumos) {
            for(Material deAlmacen : this.materiales) {
                deAlmacen.reducirCantidadEquivalenteA(m);
            }
        }
    }


}
