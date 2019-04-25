import java.util.StringTokenizer;

public class URLify {

  public String urlifiedString_prebuilt(String input, int length) {
    return input.trim().replaceAll(" ", "%20");
  }

  public String urlifiedString_notefficent(String input, int length) {
    char[] inputChars = input.toCharArray();
    for(int i=0; i<input.length() && length!=0; i++) {
      if(inputChars[i] == ' ') {
        replaceChar(inputChars, i);
      } else {
        length--;
      }
    }
    return new String(inputChars);
  }

  private void replaceChar(char[] inputChars, int i) {
    inputChars[i] = '%';
    shiftCharsbyTwo(inputChars, i+1);
    inputChars[i+1] = '2';
    inputChars[i+2] = '0';
  }

  private void shiftCharsbyTwo(char[] inputChars, int i) {
    for(int curr=inputChars.length-1; curr>=i+2; curr--) {
      inputChars[curr] = inputChars[curr-2];
    }
  }

  public String urlifiedString_efficient(String input, int trueLength) {
    //Find blanks with in true length.
    int numBlanks = 0;
    char[] inputChars = input.toCharArray();
    for(int i=0; i<trueLength-1; i++) {
      if(inputChars[i] == ' ') numBlanks++;
    }
    int fullLength = trueLength + ( 2 * numBlanks) -1;
    int index = fullLength;
    for(int i=trueLength-1; i>=0; i--) {
      if(inputChars[i] == ' ') {
        inputChars[index--] = '0';
        inputChars[index--] = '2';
        inputChars[index--] = '%';
      } else {
        inputChars[index--] = inputChars[i];
      }
    }
    return new String(inputChars);
  }

  public static void main(String arg[]) {
    URLify u = new URLify();
    System.out.println(u.urlifiedString_efficient("Mr John Smith    ", 13));
  }

}
