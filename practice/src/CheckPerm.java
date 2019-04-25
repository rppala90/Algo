import java.util.HashMap;

public class CheckPerm {

  class Count {
    int count = 1;
    public int getCount() { return count;}
    public void incrementCount() { count++; }
    public void decrementCount() { count--; }
  }

  public boolean isPermutation(String input1, String input2) {
    HashMap<Character, Count> memo = new HashMap<Character, Count>();
    for(char c: input1.toCharArray()) {
        if(memo.containsKey(c)) memo.get(c).incrementCount();
        else memo.put(c, new Count());
    }
    for(char c: input2.toCharArray()) {
      if(! memo.containsKey(c)) return false;
      else {
        if(memo.get(c).getCount() == 1) memo.remove(c);
        else memo.get(c).decrementCount();
      }
    }
    return memo.isEmpty();
  }

  public static void main(String args[]) {
    CheckPerm cp = new CheckPerm();
    System.out.println(cp.isPermutation("geod", "doeg"));
  }

}