package Ejemplo;



public class Limite<T>{
			private T t;
			public T get() {
				
				return t;
			}
			public void set (T t) {
				this.t=t;
			}				
		
			
			public <U extends Number> void revision(U u) {
				System.out.println("T es de tipo"+t.getClass().getName());
			
				
			}		
			
			
			public static void main(String[] args) {
				

			Limite <Integer> lim = new Limite <>();			
			lim.set(34);
			System.out.println(lim.get());
			lim.revision(35);
			
			
			
			Limite <Double> limD = new Limite <>();			
			limD.set(34D);
			System.out.println(limD.get());
			limD.revision(35);
			
			
			
			Limite <String> limString = new Limite <>();
			limString.set("hola");
			System.out.println(limString.get());
		//	limString.revision("Otro string");	//Da fallo pq solo admite Numeros
			
			}

}
