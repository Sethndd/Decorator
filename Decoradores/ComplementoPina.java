package Decoradores;

import Componentes.ComboPizza;

public class ComplementoPina extends Complemento{
    
    public ComplementoPina(ComboPizza combo) {
        super(combo);
    }
    
    @Override
    public String getDescripcion(){
        return this.getCombo().getDescripcion() + "\n\tPiña";
    }
    
    @Override
    public float getPrecio() {
        return this.getCombo().getPrecio() + 20;
    }
}
