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

import java.util.ArrayList;

public abstract class Pizza {
	String nombre;
	String masa;
	String salsa;
	ArrayList ingredientesextra = new ArrayList();
 
	void preparar() {
		System.out.println("Preparando " + nombre);
		System.out.println("Amasando...");
		System.out.println("Agregando... "+salsa);
		System.out.println("Agregando Ingredientes: ");
		for (int i = 0; i < ingredientesextra.size(); i++) {
			System.out.println("   " + ingredientesextra.get(i));
		}
	}
  
	void hornear() {
		System.out.println("Horneando Pizza por 20 minutos a 350°");
	}
 
	void cortar() {
		System.out.println("Cortando pizza en rebanadas triangulares");
	}
  
	void empacar() {
		System.out.println("Empacando Pizza en Caja");
	}
 
	public String getNombre() {
		return nombre;
	}

        @Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + nombre + " ----\n");
		display.append(masa + "\n");
		display.append(salsa + "\n");
		for (int i = 0; i < ingredientesextra.size(); i++) {
			display.append((String )ingredientesextra.get(i) + "\n");
		}
		return display.toString();
	}
}

 
 
