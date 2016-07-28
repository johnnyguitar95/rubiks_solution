package cube;

public class RubiksCube {
    private char face1[][];
    private char face2[][];
    private char face3[][];
    private char face4[][];
    private char face5[][];
    private char face6[][];

    /**
     * Randomly generates a rubiks cube
     */
    public RubiksCube() {

    }

    public RubiksCube(char face1[][], char face2[][], char face3[][],
            char face4[][], char face5[][], char face6[][]) {
        this.face1 = new char[3][3];
        this.face2 = new char[3][3];
        this.face3 = new char[3][3];
        this.face4 = new char[3][3];
        this.face5 = new char[3][3];
        this.face6 = new char[3][3];

        copyArray(this.face1, face1);
        copyArray(this.face2, face2);
        copyArray(this.face3, face3);
        copyArray(this.face4, face4);
        copyArray(this.face5, face5);
        copyArray(this.face6, face6);
    }

    /**
     * For copying arrays.
     * 
     * @param thisObject
     *            face of the cube
     * @param newFace
     *            new face of the cube
     */
    private void copyArray(char[][] thisObject, char[][] newFace) {
        for (int x = 0; x < thisObject.length; x++) {
            for (int y = 0; y < thisObject[x].length; y++) {
                thisObject[x][y] = newFace[x][y];
            }
        }
    }
}
