public class Q4 {
    static int evenlyDivides(int n) 
    {
        int num = n;
		int count = 0;
		
		while(num >=1)
		{
		    int rem = num % 10;
		    if(rem != 0 && n % rem == 0) count++;
		    num /= 10;
		}
		return count;
    }
    
	public static void main(String[] args) {
		
		int num =20;
		
		System.out.println( "count =  " + evenlyDivides(num));
	}
}
