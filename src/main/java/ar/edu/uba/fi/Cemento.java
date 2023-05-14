package ar.edu.uba.fi;

import java.util.Objects;

public class Cemento implements Material {
    private int unidades;

    public Cemento(int unidades) {

        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cemento cemento = (Cemento) o;
        return unidades == cemento.unidades;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unidades);
    }

    @Override
    public void reducirCantidadEquivalenteA(Material gasto) {
        if (!gasto.getClass().equals(this.getClass())) {
            return;
        }

        Cemento other = (Cemento) gasto;
        unidades = unidades - other.unidades;
    }

}
