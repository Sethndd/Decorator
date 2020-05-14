package Decoradores;

import Componentes.ComboPizza;

public class ComplementoQueso extends Complemento{
    
    public ComplementoQueso(ComboPizza combo) {
        super(combo);
    }
    
    @Override
    public String getDescripcion(){
        return this.getCombo().getDescripcion() + "\n\tQueso Extra";
    }
    
    @Override
    public float getPrecio() {
        return this.getCombo().getPrecio() + 20;
    }
}
