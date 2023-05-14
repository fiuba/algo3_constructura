package ar.edu.uba.fi;

import java.util.Objects;

public class Caño implements Material {
    private int unidades;

    public Caño(int unidades) {

        this.unidades = unidades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caño caño = (Caño) o;
        return unidades == caño.unidades;
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

        Caño other = (Caño) gasto;
        unidades = unidades - other.unidades;
    }
}
