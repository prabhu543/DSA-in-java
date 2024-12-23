public class Q2 {
    static int findNthTerm(int N) {
        return ((N* (N+1))/2);
    }
	public static void main(String[] args) {
		int n = 6;
		System.out.println("ss = " + findNthTerm(n));
	}
}
