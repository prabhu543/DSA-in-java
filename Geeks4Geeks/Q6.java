public class Q6 {
    public static boolean isPowerofTwo(int n) {
        int flag = 0;
        for(int i = 0;i<=n/2;i++)
        {
            if(Math.pow(2,i) == n)
            {
                System.out.println(i);
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		int n = 3;
		System.out.println(isPowerofTwo(n));
	}
}
