class Solu {
  public static int gcd(int a, int b){
  //code here to calculate and return gcd of a and b
  while(b != 0)
      {
          int rem = a % b;
          a = b;
          b = rem;
      }
      return a ;
  }
}

public class Main
{
  
public static void main(String[] args) {
    Solu s = new Solu();
    
  System.out.println(s.gcd(60,24));
}
}