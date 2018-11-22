
import java.util.ArrayList;

public class PrimeNumbers1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> primeNumbers = new ArrayList<>();       
		
		for (int i = 2; i <= 3000000; i++) { 
			if (isPrime(i)) {
				primeNumbers.add(i);
			} else {
				continue;
			}
		}
		System.out.println(primeNumbers.size());
	}
	
	// Method to check if number is prime 
	public static boolean isPrime(int n) { 
		
		if ((n > 2 && n % 2 == 0) || n == 1) {
			return false;
		}
		
		int top = (int) Math.sqrt(n) + 1;
		
		for (int i = 3; i < top; i += 2) {
			
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
