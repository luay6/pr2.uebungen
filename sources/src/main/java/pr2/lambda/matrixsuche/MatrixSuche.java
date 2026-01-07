package pr2.lambda.matrixsuche;

public class MatrixSuche {
    
    public static Position findEntry(int [][] matrix, int eintrag) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if( eintrag == matrix[i][j]) {
                    return new MatrixSuche.Position(i, j);
                }
            }
        }
        return null;
    }
    
    static class Position{
        int x;
        int y;
        public Position(int i, int y) {
            this.x = i;
            this.y = y;
        }
        
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    
    public static void main(String args[]) {
       
        int[][] matrix = {
                {3, 5, 6, 7, 8},
                {10, 12, 14, 16, 18},
                {23, 25, 26, 27, 28}
        };
        System.out.println(MatrixSuche.findEntry(matrix, 5));
        
    }

}
