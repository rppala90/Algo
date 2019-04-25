import java.util.Random;

public class TwoDimenPhone {

  /*
   * Print phone number from a two dimensional array
   */

  enum DIRECTION {
    RIGHT(0), LEFT(1), UP(2), DOWN(3);
    int val;
    DIRECTION(int val) {
        this.val = val;
    }
    public int getVal() { return this.val; };
  }

  public static void main(String args[]) {
    int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
    int start_x = 1, start_y = 0;
    String output = "";
    for(int i=0; i<7; i++) {
     output += matrix[start_x][start_y];
     DIRECTION d = null;
     switch(new Random().nextInt(4)) {
       case 0: d = DIRECTION.RIGHT; break;
       case 1: d = DIRECTION.LEFT; break;
       case 2: d = DIRECTION.UP; break;
       case 3: d = DIRECTION.DOWN; break;
     }
     assert(d==null);
     switch(d.getVal()) {
       case 0: start_y = getNextY(start_y, DIRECTION.RIGHT); break;
       case 1: start_y = getNextY(start_y, DIRECTION.LEFT); break;
       case 2: start_x = getNextX(start_x, DIRECTION.UP); break;
       case 3: start_x = getNextX(start_x, DIRECTION.DOWN); break;
     }
    }
    System.out.println(output);
  }

  private static int getNextY(int y, DIRECTION d) {
    if (d == DIRECTION.LEFT) {
      if(y == 0) return y+1;
      return y-1;
    } else {
      if(y == 2) return y-1;
      return y+1;
    }
  }

  private static int getNextX(int x, DIRECTION d) {
    if (d == DIRECTION.UP) {
      if(x == 0) return x+1;
      return x-1;
    } else {
      if(x == 2) return x-1;
      return x+1;
    }
  }

}
