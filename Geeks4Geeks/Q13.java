class Solution{
  public static void utility(int n){

  int ans = Math.abs(n % 10);

  System.out.println(ans);
}
}
public class Main
{
public static void main(String[] args) {
  Solution s = new Solution();
  s.utility(18);
}
}