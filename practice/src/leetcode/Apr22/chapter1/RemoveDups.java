package leetcode.Apr22.chapter1;

public class RemoveDups {

  public static void main(String[] args) {
    RemoveDups rd = new RemoveDups();
    String input = "abcdefgh";
    System.out.println(String.format("%s after removing duplicates is : %s",
        input, rd.removeDuplicate(input)));
  }

  private String removeDuplicate(String input) {
      StringBuilder sb = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
          boolean skip = false;
            for(char c: sb.toString().toCharArray()) {
              if(input.charAt(i) == c) { skip = true; break;}
            }
            if(!skip) sb.append(input.charAt(i));
        }
        return sb.toString();
  }
}
