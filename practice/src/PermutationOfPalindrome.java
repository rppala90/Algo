import java.util.BitSet;

public class PermutationOfPalindrome {

  public boolean isPermutationOfPalindrome(String input) {
    int bitVector = 0;
    for(char c: input.toCharArray()) {
      int x = getIntFromChar(c);
      bitVector = toggle(bitVector, x);
    }
    return (bitVector == 0 || (bitVector & (bitVector-1)) == 0);
  }

  private int toggle(int bitVector, int index) {
    if(index <0) return bitVector;
    int mask = 1 << index;
    if( (bitVector & mask) == 0) {
      bitVector |= mask;
    } else {
      bitVector &= ~mask;
    }
    return bitVector;
  }

  private int getIntFromChar(char c) {
    if(c == ' ') return -1;
    return c - 'A';
  }

  public static void main(String[] args) {
    PermutationOfPalindrome pp = new PermutationOfPalindrome();
    System.out.println(pp.isPermutationOfPalindrome("Tact Coa"));
  }

}