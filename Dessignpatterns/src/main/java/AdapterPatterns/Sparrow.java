package AdapterPatterns;

public class Sparrow implements Bird{
	public void makeSound() {
		System.out.println("<--- Chirp Chirp --->");
	}
	public void fly() {
		System.out.println("<--- Sparrow is Flying --->");
		
	}
}
