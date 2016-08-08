package cube;

public class RubiksCube {
  private int cube[][][];

  public static final int WHITE = 0;
  public static final int TOP = 0;
  public static final int ORANGE = 1;
  public static final int BACK = 1;
  public static final int GREEN = 2;
  public static final int LEFT = 2;
  public static final int BLUE = 3;
  public static final int RIGHT = 3;
  public static final int RED = 4;
  public static final int FRONT = 4;
  public static final int YELLOW = 5;
  public static final int BOTTOM = 5;

  /**
   * Builds a rubik's cube
   * 
   * @param top
   * @param back
   * @param left
   * @param right
   * @param front
   * @param bottom
   */
  public RubiksCube(int cube[][][]) {
    this.cube = new int[6][3][3];
    copyCube(this.cube, cube);
  }

  /**
   * Copies Cube - probably only going to be used in Constructor
   * 
   * @param thisCube
   * @param newCube
   */
  private void copyCube(int[][][] thisCube, int[][][] newCube) {
    for (int x = 0; x < newCube.length; x++) {
      for (int y = 0; y < newCube[x].length; y++) {
        for (int z = 0; z < newCube[x][y].length; z++) {
          thisCube[x][y][z] = newCube[x][y][z];
        }
      }
    }
  }

  /**
   * For copying arrays.
   * 
   * @param thisObject face of the cube
   * @param newFace new face of the cube
   */
  private void copyArray(int[][] thisObject, int[][] newFace) {
    for (int x = 0; x < thisObject.length; x++) {
      for (int y = 0; y < thisObject[x].length; y++) {
        thisObject[x][y] = newFace[x][y];
      }
    }
  }

  /**
   * Prints out rubik's cube
   */
  public String toString() {
    String str = "";
    str += "Top\n";
    str += faceString(TOP);
    str += "Back\n";
    str += faceString(BACK);
    str += "Left\n";
    str += faceString(LEFT);
    str += "Right\n";
    str += faceString(RIGHT);
    str += "Front\n";
    str += faceString(FRONT);
    str += "Bottom\n";
    str += faceString(BOTTOM);
    return str;
  }

  /**
   * Get's a string of a specifed face
   * 
   * @param face to get
   * @return string of said face
   */
  private String faceString(int face) {
    String str = "";
    for (int x = 0; x < cube[face].length; x++) {
      for (int y = 0; y < cube[face][x].length; y++) {
        str += cube[face][x][y];
        if (y == cube[face][x].length - 1)
          str += "\n";
      }
    }
    return str + "\n";
  }
}
