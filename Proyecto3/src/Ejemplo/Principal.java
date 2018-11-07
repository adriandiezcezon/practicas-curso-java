package Ejemplo;

public class Principal {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new OrderedPair<Integer,String>(10, "Primer par rojo");
		Pair<Integer, String> p2 = new OrderedPair<Integer,String>(2, "Segundo par azul");
		System.out.print(p1.getKey());
		System.out.print("\t");
		System.out.println(p1.getValue());
		
		System.out.print(p2.getKey());
		System.out.print("\t");
		System.out.println(p2.getValue());

	}

}
