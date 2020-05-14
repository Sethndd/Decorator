package Decoradores;

import Componentes.ComboPizza;

public abstract class Complemento extends ComboPizza{
    private ComboPizza combo;

    public Complemento(ComboPizza combo) {
        this.combo = combo;
    }

    public ComboPizza getCombo() {
        return combo;
    }

    public void setCombo(ComboPizza combo) {
        this.combo = combo;
    }
}
