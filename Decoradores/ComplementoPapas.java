package Decoradores;

import Componentes.ComboPizza;

public class ComplementoPapas extends Complemento{
    
    public ComplementoPapas(ComboPizza combo) {
        super(combo);
    }
    
    @Override
    public String getDescripcion(){
        return this.getCombo().getDescripcion() + "\n\tPapas";
    }
    
    @Override
    public float getPrecio() {
        return this.getCombo().getPrecio() + 35;
    }
}
