package ar.edu.uba.fi;

import java.util.Objects;

public class Pintura implements Material {
    private int unidades;

    public Pintura(int unidades) {

        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pintura pintura = (Pintura) o;
        return unidades == pintura.unidades;
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

        Pintura other = (Pintura) gasto;
        unidades = unidades - other.unidades;
    }

}
