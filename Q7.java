public class Q7 {
    static int search(int arr[], int x) 
    {
        for(int i = 0;i<arr.length ; i++)
        {
            if(arr[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		
		int arr[] = { 10, 8, 30, 4, 5 };
		int x = 1;
		System.out.println(search(arr,x));
	}
}
