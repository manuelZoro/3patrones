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
public class PruebaPizza {
    public static void main (String []args){
        FabricaPizza Oaxaca= new OAXPizzaSucursal();
        FabricaPizza Huajuapan= new HUAPizzaSucursal();
 
		Pizza pizza = Oaxaca.ordenPizza("Queso");
		System.out.println("Guillermo Ordeno " + pizza.getNombre()+ "\n");
 
		pizza = Huajuapan.ordenPizza("Queso");
		System.out.println("Manuel Ordeno " + pizza.getNombre()+ "\n");
                
                pizza = Oaxaca.ordenPizza("Vegetariana");
		System.out.println("Guillermo Ordeno " + pizza.getNombre()+ "\n");
                
                pizza = Huajuapan.ordenPizza("Vegetariana");
		System.out.println("Manuel Ordeno " + pizza.getNombre()+ "\n");

	
	}
    }

