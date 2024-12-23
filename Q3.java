public class Q3 {
    public static int largest(int[] arr) {
        int large = arr[0];
        for(int i : arr)
        {
            if(i > large)
            large =i;
        }
        return large;
    }
    
	public static void main(String[] args) {
		int arr[] = {1, 8, 7, 56, 90};
		System.out.println( largest(arr));
	}
}
