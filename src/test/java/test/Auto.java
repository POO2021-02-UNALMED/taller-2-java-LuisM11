package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	public int cantidadAsientos() {
		int ct = 0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (asientos[i] != null && asientos[i] instanceof Asiento) {
				ct++;
			}
		}
		return ct;
	}

	

	public String verificarIntegridad(){
		String a = "Auto original";
		String b= "Las piezas no son originales";
		String c="";
		for (int i = 0; i < this.asientos.length; i++) {
			if (asientos[i] != null && asientos[i] instanceof Asiento) {
				if( asientos[i].registro == this.motor.registro && asientos[i].registro == this.registro && this.registro== this.motor.registro) {
					c=a;
				}else {
					c=b;
					break;
				}
			}else {}
		}
		return c;
	}

}
