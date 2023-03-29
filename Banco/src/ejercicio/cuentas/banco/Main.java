package ejercicio.cuentas.banco;

public class Main {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("345-5667-3211-434", "Nuria Gonzalez");
		
		cuenta.ingresar(1000);
		cuenta.retirar(10000);
		
		System.out.println(cuenta.getSaldo());
	}

}
