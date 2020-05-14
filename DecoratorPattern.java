package decoratorpattern;

import Componentes.ComboPizza;
import Componentes.PizzaChica;
import Componentes.PizzaGrande;
import Decoradores.Complemento;
import Decoradores.ComplementoIngredienteExtra;
import Decoradores.ComplementoPapas;
import Decoradores.ComplementoQueso;
import Decoradores.ComplementoPina;

public class DecoratorPattern {
    public static void main(String[] args) {
        ComboPizza pedido1 = new PizzaChica("Seth");
        System.out.println(pedido1.getDescripcion() + "\nTotal: " + pedido1.getPrecio());
        
        pedido1 = new ComplementoQueso(pedido1);  
        pedido1 = new ComplementoPina(pedido1);
        pedido1 = new ComplementoPapas(pedido1);
        
        System.out.println(pedido1.getDescripcion() + "\nTotal: " + pedido1.getPrecio());
        
        ComboPizza pedido2 = new PizzaGrande("Midguet");
        System.out.println(pedido2.getDescripcion() + "\nTotal: " + pedido2.getPrecio());
        
        pedido2 = new ComplementoIngredienteExtra(pedido2);
        pedido2 = new ComplementoQueso(pedido2);
        
        System.out.println(pedido2.getDescripcion() + "\nTotal: " + pedido2.getPrecio());
        
    }
}
