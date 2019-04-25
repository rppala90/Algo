package leetcode.Apr22.chapter1;

public class ReverseString {

  public static void main(String[] args) {
    String input = "abcd";
    ReverseString rs = new ReverseString();
    System.out.println(String.format("Reverse of String %s is %s.",
        input, rs.reverse(input)));
  }

  private String reverse(String input) {
    char[] input_chars = input.toCharArray();
    for(int i=0; i<input_chars.length/2; i++) {
      char temp = input_chars[i];
      input_chars[i] = input_chars[input_chars.length-1-i];
      input_chars[input_chars.length-1-i] = temp;
    }
    return new String(input_chars);
  }

}
