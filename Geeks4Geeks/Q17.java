
class Solution {
  static String delAlternate(String S) {
      String newS = "";
      for(int i = 0 ;i< S.length() ; i++)
      {
          if(i % 2 == 0)
          newS += S.charAt(i);
      }
      return newS;
  }
}
public class Main
{
public static void main(String[] args) {
  String s = "Prabhu";
  Solution sol = new Solution();
  System.out.println(sol.delAlternate(s) );
}
}