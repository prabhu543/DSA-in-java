class Solution{
  public static void utility(int number){
  if(number > 100)
  {
      System.out.println("Big");
      System.out.println("Number");
  }
  else 
  if(number < 10)
  System.out.println("Number");
}
}
public class Main
{
public static void main(String[] args) {
  Solution s = new Solution();
  s.utility(101);
}
}