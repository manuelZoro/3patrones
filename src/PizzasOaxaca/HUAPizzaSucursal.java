/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzasOaxaca;

/**
 *
 * @author Memito
 */
public class HUAPizzaSucursal extends FabricaPizza{

    @Override
    public Pizza crearPizza(String tipo) {
        	if (tipo.equals("Queso")) {
            		return new PizzaQuesoHuajupan();
        	} else if (tipo.equals("Pepperoni")) {
        	    	return new PizzaPepperoniHuajuapan();
        	} else if (tipo.equals("Hawaiana")) {
        	    	return new PizzaHawaianaHuajupan();
        	} else if (tipo.equals("Vegetariana")) {
            		return new PizzaVegetarianaHuajupan();
        	} else 
                    return null;
    }

    @Override
    public Pizza ordenPizza(String tipo) {
                Pizza pizza = crearPizza(tipo);
		System.out.println("--- Procesando Orden " + pizza.getNombre() + " ---");
		pizza.preparar();
		pizza.hornear();
		pizza.cortar();
		pizza.empacar();
		return pizza;
    }
    
}
