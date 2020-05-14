package Decoradores;

import Componentes.ComboPizza;

public class ComplementoIngredienteExtra extends Complemento{
    
    public ComplementoIngredienteExtra(ComboPizza combo) {
        super(combo);
    }
    
    @Override
    public String getDescripcion(){
        return this.getCombo().getDescripcion() + "\n\tIngrediente Extra";
    }
    
    @Override
    public float getPrecio() {
        return this.getCombo().getPrecio() + 45;
    }
}
