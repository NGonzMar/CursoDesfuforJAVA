package com.rf.demo;

public class LineaFactura {

	public static void main(String[] args) {
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.4;
		double importe = cantidad * unidades * precio;
		double total = importe * 1.21;
		double iva = (double) (importe * 0.21);

		System.out.println("Cantidad: " + cantidad);
		System.out.println("Unidades: " + unidades);
		System.out.println("Precio: " + precio);
		System.out.println("Importe: " + importe);
		System.out.println("IVA: " + iva);
		System.out.println("Total (convertido a int): " + (int) total);
		System.out.println("Total (sin convertir a int): " + total);

	}
}
