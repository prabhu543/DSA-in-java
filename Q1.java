public class Q1
{
	public static long seriesSum(int n) {
	    long sum =0;
		for(int i =n;i>=1;i--) sum += i;
		return sum;
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(" " + seriesSum(n));
	}
}