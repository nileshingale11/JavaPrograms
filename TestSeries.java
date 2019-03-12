package series;
import java.util.*;

public class TestSeries{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms to be printed:");
		int numOfTerms = sc.nextInt();
		Squares sq = new Squares(numOfTerms);
		Primes p = new Primes(numOfTerms);
		p.printPrimes();
	}
}
