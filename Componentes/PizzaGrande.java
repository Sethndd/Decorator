package Componentes;

public class PizzaGrande extends ComboPizza{

    public PizzaGrande(String dueno) {
        this.precio = 200;
        this.descripcion = "\nCombo de " + dueno
            + "\nIncluye: \n\tPizza grande\n\tPlatos desechables\n\tRefresco de 2 litros";
    }
}
