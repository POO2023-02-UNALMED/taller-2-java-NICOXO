package test;

public class Asiento {

	String color;
	int precio;
	static int registro;
	
	
	void cambiarColor(String color) {
		String[] coloresPermitidos = {"rojo","verde","amarillo","negro","blanco"};
		for (String colorPermitido : coloresPermitidos) {
			if (colorPermitido.equals(color)) {
				this.color = color;
				break;
			}
		}
	}
	
	
	
}
