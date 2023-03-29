package barajaespañola;

import java.util.HashSet;

public class Main {
	
	public static void main(String[] args) {
		
		HashSet<Carta> baraja = new HashSet<Carta>();
		
		for (int valor = 1; valor <= 7; valor++) {
		    for (String palo : new String[]{"oros", "copas", "espadas", "bastos"}) {
		        baraja.add(new Carta(valor, palo));
		    }
		}
		
		baraja.add(new Carta(10, "oros"));
		baraja.add(new Carta(11, "oros"));
		baraja.add(new Carta(12, "oros"));

		baraja.add(new Carta(10, "copas"));
		baraja.add(new Carta(11, "copas"));
		baraja.add(new Carta(12, "copas"));

		baraja.add(new Carta(10, "espadas"));
		baraja.add(new Carta(11, "espadas"));
		baraja.add(new Carta(12, "espadas"));

		baraja.add(new Carta(10, "bastos"));
		baraja.add(new Carta(11, "bastos"));
		baraja.add(new Carta(12, "bastos"));
		
		
		for (Carta carta : baraja) {
		    System.out.println(carta);
		}

	}

}
