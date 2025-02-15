class Solution{
  String isVowel(char c){
      // code here
      if(c == 'a' || c == 'A' ||
          c == 'e' ||c == 'E' ||
          c == 'i' ||c == 'I' ||
          c == 'o' ||c == 'O' ||
          c == 'u' ||c == 'U' )
      {
          return "YES";
      }
      else return "NO";
  }
}

public class Main
{
public static void main(String[] args) {
    Solution s = new Solution();
    
  System.out.println(s.isVowel('a'));
}
}