package org.examplepolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("IGJH568","Ferrari","A89");
		misVehiculos[1] = new VehiculoTurismo(4, "IKSS", "Toyota", "B45");
		misVehiculos[2] = new VehiculoDeportivo(500, "45GH", "mitsubishi", "KJ8");
		misVehiculos[3] = new VehiculoFurgoneta(2000, "JI8", "Toyota", "JA9");
		
		for(Vehiculo vehiculo: misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
			System.out.println("");
		}
	}

}
