package Componentes;

public class PizzaChica extends ComboPizza{

    public PizzaChica(String dueno) {
        this.precio = 100;
        this.descripcion = "\nCombo de " + dueno
            + "\nIncluye: \n\tPizza chica\n\tRefresco 600 mililitros";
    }
}
