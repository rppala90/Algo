import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

  public boolean isUniquechar(String input) {
    Set<Character> memo = new HashSet<Character>();
    for(char c: input.toCharArray()) {
      if(memo.contains(c)) return false;
      memo.add(c);
    }
    return true;
  }

  public static void main(String[] args) {
    UniqueChar uc = new UniqueChar();
    System.out.println(uc.isUniquechar("abcd"));
  }

}
