public class Q5 {
    static int sumOfDigits(int n) {
        int sum = 0;
		while(n > 0)
		{
		    int rem = n % 10;
		    sum += rem;
		    n /= 10;
		}
		return sum;
    }
    
	public static void main(String[] args) {
		int n = 208;
		
		System.out.println(" sum =  " + sumOfDigits(n));
	}
}
