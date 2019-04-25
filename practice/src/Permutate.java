public class Permutate {

  private void printPermutation(String input, int l, int r) {
      if(l==r) System.out.println(input);
      else {
         for(int i=l; i <= r; i++) {
           input = swap(input, l, i);
           System.out.println(input);
           //printPermutation(input, l+1, r);
           input = swap(input, l, i);
         }
      }
  }

  public String swap(String input, int i, int j) {
    char[] inputchars = input.toCharArray();
    char temp = inputchars[i];
    inputchars[i] = inputchars[j];
    inputchars[j] = temp;
    return new String(inputchars);
  }

  public static void main(String arg[]) {
    Permutate p = new Permutate();
    String input = "abc";
    p.printPermutation(input, 0, input.length()-1);
  }
}
