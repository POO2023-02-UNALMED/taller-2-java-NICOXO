package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
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
	
	String verificarIntefridad() {
		if (motor.getRegistro() != registro) {
			return "Las piezas no son originales";
		}
		for (Asiento asiento : asientos) {
			if (asiento != null && asiento.getRegistro() !=registro) {
				return "Las peizas no son originales";
			}
		}
	     return "Auto original";
	}
	
	
	
}
