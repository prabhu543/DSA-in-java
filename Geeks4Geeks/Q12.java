class Solution{
  public static String utility(int n) 
  {
      if(n % 2 != 0)
      return ("You"); // odd -> I won
      else
      return ("Friend"); // even -> My Friend won
  }
}
public class Main
{
public static void main(String[] args) {
  int n = 10;
  Solution s = new Solution();
  System.out.println(s.utility(9));
}
}