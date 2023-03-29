package curso.g11.genericos;

public class PruebaIntercambio {

    public static void main(String[] args) {

        Intercambio<String> nombres = new Intercambio<String>("Nuria", "Daniel");

        System.out.println("NOMBRES: \n1 - " + nombres.getUno() + "\n2 - " + nombres.getDos());

        nombres.intercambiar();
        
        System.out.println("\nINTERCAMBIO NOMBRES: \n1 - " + nombres.getUno() + "\n2 - " + nombres.getDos());
    }
    
    
}
