class Solution {
  public String convertDateToBinary(String date) {
      String[] parts = date.split("-");
    
    String year = Integer.toBinaryString(Integer.parseInt(parts[0])); 
    String month = Integer.toBinaryString(Integer.parseInt(parts[1]));
    String day = Integer.toBinaryString(Integer.parseInt(parts[2]));
    
    String dateInBinary = year + "-" + month + "-" + day ;
    
    return dateInBinary;
  }
}
public class Main
{
public static void main(String[] args) {
    String date = "2080-02-15";
    
    Solution sol = new Solution();
    System.out.println(" dateInBinary :" + sol.convertDateToBinary(date));
}
}

/*
 *
 * Integer.toBinaryString(parameter) method is used to convert the integer value to binary string.
 * Integer.parseInt(parameter) method is used to convert the string to integer.
 * .split(parameter) method is used to split the string based on the parameter.
 * 
 */