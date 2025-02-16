class Solution {
  public static boolean prime(int n){
      if(n == 1) return false;
      else if (n == 2) return true ;
      else
      for(int i = 2 ; i * i <= n ; i++) 
        if(n % i == 0)
          return false;
    return true;
  }
}
public class Main
{
public static void main(String[] args) {
  int n = 20;
  Solution sol = new Solution();
  System.out.println("n :" + n  + " is " +  sol.prime(n) + " prime");
}
}