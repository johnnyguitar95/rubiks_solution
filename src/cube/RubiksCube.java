package cube;

public class RubiksCube {
    private int top[][];
    private int back[][];
    private int left[][];
    private int right[][];
    private int front[][];
    private int bottom[][];

    public final int WHITE = 1;
    public final int ORANGE = 2;
    public final int GREEN = 3;
    public final int BLUE = 4;
    public final int RED = 5;
    public final int YELLOW = 6;

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
    public RubiksCube(int top[][], int back[][], int left[][], int right[][],
            int front[][], int bottom[][]) {
        this.top = new int[3][3];
        this.back = new int[3][3];
        this.left = new int[3][3];
        this.right = new int[3][3];
        this.front = new int[3][3];
        this.bottom = new int[3][3];

        copyArray(this.top, top);
        copyArray(this.back, back);
        copyArray(this.left, left);
        copyArray(this.right, right);
        copyArray(this.front, front);
        copyArray(this.bottom, bottom);
    }

    /**
     * For copying arrays.
     * 
     * @param thisObject
     *            face of the cube
     * @param newFace
     *            new face of the cube
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
        str += faceString(top);
        str += "Back\n";
        str += faceString(back);
        str += "Left\n";
        str += faceString(left);
        str += "Right\n";
        str += faceString(right);
        str += "Front\n";
        str += faceString(front);
        str += "Bottom\n";
        str += faceString(bottom);
        return str;
    }

    /**
     * Get's a string of a specifed face
     * 
     * @param face
     *            to get
     * @return string of said face
     */
    private String faceString(int[][] face) {
        String str = "";
        for (int x = 0; x < top.length; x++) {
            for (int y = 0; y < top[x].length; y++) {
                str += top[x][y];
                if (y == top[x].length - 1)
                    str += "\n";
            }
        }
        return str + "\n";
    }
}
