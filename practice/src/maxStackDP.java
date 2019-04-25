import static java.lang.Math.max;

public class maxStackDP {

  private int dynamicP_solution(int[] input) {
    int[][] memo = new int[input.length][input.length];
    int max = 0;
    for(int row=memo.length-1; row>=0;row--) {
      for(int column=row; column<memo.length;column++) {
        int rowValue = input[input.length - row-1];
        int colValue = input[input.length - column-1];
        System.out.println("rowValue :" + rowValue);
        System.out.println("colValue :" + colValue);
        if(row == column) {
          memo[row][column] = 1;
          if(memo[row][column] > max) max = memo[row][column];
          continue;
        }
        if(rowValue < colValue) {                    /*include*/
          System.out.print(memo[row][column] +1 + " vs ");
          System.out.println(memo[row][column-1]);
          memo[row][column] = max(memo[row][column-1]+1, memo[row+1][column]);
        } else {
          memo[row][column] = max(memo[row][column-1], memo[row+1][column]);
        }
        if(memo[row][column] > max) max = memo[row][column];
      }
    }

    for(int i=0; i<memo.length; i++) {
      for(int j=0; j<memo.length; j++) {
        System.out.print(memo[i][j] + " ");
      }
      System.out.println();
    }
    return max;
  }

  private int solution(int[] input) {
    return dynamicP_solution(input);
  }

  public static void main(String args[]) {
    int[] input = {12, 2, 15, 10, 20, 8};
    //int[] input = {15, 10, 20, 8};
    //int[] input = {10,9,8};
    maxStackDP mp = new maxStackDP();
    System.out.println(mp.solution(input));
  }

}