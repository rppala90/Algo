import java.util.BitSet;

public class BitSetCheck {

  public static void main(String args[]) {
    BitSet b = new BitSet();
    b.set(550);
    for(char c: "abcdea".toCharArray()) {
      if( b.get(c) ) System.out.println("Duplicate Char :" +  c);
      b.set(c);
    }
    System.out.println(b);
    int currpos = 0, lastpos = -1, max=1, maxsofar=0;
    while((currpos = b.nextSetBit(currpos)) >= 0) {
      if(lastpos == currpos-1) {
        max++;
      } else {
        if(max > maxsofar) maxsofar = max;
        max=1;
      }
      lastpos = currpos++;
    }
    System.out.println("largest subsequence is :" + maxsofar);
  }

}
