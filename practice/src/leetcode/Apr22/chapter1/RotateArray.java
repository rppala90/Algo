package leetcode.Apr22.chapter1;

public class RotateArray {
  /*
     Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
     write a method to rotate the image by 90 degrees. Can you do this in place?
   */

  public static void main(String[] args) {
    RotateArray ra = new RotateArray();
    int[][] input = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3},{4,4,4,4}};
    printArray(input);
    System.out.println();
    //printArray(ra.rotate(input));
    ra.rotate_inplace(input);
    printArray(input);
    System.out.println();
  }

  private static void printArray(int[][] input) {
    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input.length; j++) {
        System.out.print(input[i][j]);
      }
      System.out.println();
    }
  }

  private int[][] rotate(int[][] input) {
    int[][] output = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    for (int i = 0; i < output.length; i++) {
      for (int j = 0; j < output.length; j++) {
        output[i][j] = input[input.length - 1 - j][i];
      }
    }
    return output;
  }

/*
    1 2 3   0,0   0,1   0,2
    4 5 6   1,0   1,1   1,2
    7 8 9   2,0   2,1   2,2

    7 4 1   2,0   1,0   0,0
    8 5 2   2,1   1,1   0,1
    9 6 3   2,2   1,2   0,2

    1 2 3 4    0,0   0,1   0,2   0,3
    5 6 7 8    1,0   1,1   1,2   1,3
    9 a b c    2,0   2,1   2,2   2,3
    d e f g    3,0   3,1   3,2   3,3

    d 9 5 1    3,0   2,0   1,0   0,0
    e a 6 2    3,1   2,1   1,1   0,1
    f b 7 3    3,2   2,2   1,2   0,2
    g c 8 4    3,3   2,3   1,3   0,3

 */


  /*

      INPLACE -->
          0,0 ==> 0,2 ==> 2,2  ==> 2,0
          0,1 ==> 1,2 ==> 2,1  ==> 1,0

      INPLACE  -->
          0,0 ==> 0,3 ==>  3,3  ==>  3,0
          0,1 ==> 1,3 ==>  3,2  ==>  2,0
          0,2 ==> 2,3 ==>  3,1  ==>  1,0
          0,3 ==> 3,3 ==>  3,0  ==>  0,0

          1,1 ==> 1,2 ==>  2,2  ==>  2,1
   */
  private void rotate_inplace(int[][] input) {
    for(int layer = 0; layer<input.length/2; layer++) {
      int first = layer;
      int last = input.length-1-layer;
      for(int i=first; i<last; ++i) {
        int offset = i - first;
        int top = input[first][i];

        input[first][i] = input[last-offset][first];
        input[last-offset][first] = input[last][last-offset];
        input[last][last-offset] = input[i][last];
        input[i][last] = top;

      }
    }
  }

}