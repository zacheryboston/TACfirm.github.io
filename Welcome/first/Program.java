package first;

public class Program {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			// Pad with zeros and a width of 5 chars.
			String result = String.format("%1$05d %2$05d", i, i + 10);
			System.out.println(result);
			
		}
	}
}
