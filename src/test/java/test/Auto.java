package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	static int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (Asiento asiento : asientos) {
			if (asiento != null) {
				cantidad++;
			}
		}
	return cantidad;
	}
	String verificarIntegridad() {
		if (registro == Asiento.registro && registro == motor.registro) {
			return ("Auto original");
		}
		else {
			return("Las piezas no son originales");
		}
	}
	
	
	
}
