class Solution{
  public static void utility(int a, int b, int operator){
      if(operator == 3)
      System.out.print(a * b);
      else 
      if(operator == 2)
      System.out.print(b-a);
      else 
      if(operator == 1)
      System.out.print(a +b);
      else 
      System.out.print(" Invalid Input ");
      return;
  }
}

public class Main
{
  public static void main(String[] args) {
    Solution s = new Solution();
    s.utility(1,2,2);
}
}