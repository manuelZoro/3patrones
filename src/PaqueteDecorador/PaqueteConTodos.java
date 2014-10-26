package PaqueteDecorador;
/**
 * Indica un tipo de combo Familiar,
 * heredando de la clase padre Combo
 * @author chenao
 *
 */
public class PaqueteConTodos extends Paquete
{
	public PaqueteConTodos(){
		descripcion="3 Pizza \n" + "Que Papas, Palitos de Queso, Pops de Queso \n"+ "2 Refresco de (2 L)";
	}

	@Override
	public int valor() {
		return 400;
	}

}
