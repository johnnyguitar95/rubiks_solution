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
	public RubiksCube(){
		
	}
	
	public RubiksCube(char face1[][], char face2[][], char face3[][] ,char face4[][] ,char face5[][], char face6[][])
	{
	    copyArray(this.face1, face1);
	    copyArray(this.face2, face2);
	    copyArray(this.face3, face3);
	    copyArray(this.face4, face4);
	    copyArray(this.face5, face5);
	    copyArray(this.face6, face6);
	}

    private void copyArray(
            char[][] face62,
            char[][] face63) {
        // TODO Auto-generated method stub
        
    }

}
