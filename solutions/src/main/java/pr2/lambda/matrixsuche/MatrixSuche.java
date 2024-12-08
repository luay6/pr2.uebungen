package pr2.lambda.matrixsuche;

public class MatrixSuche {

    public static class Position {
        private final int xPos;
        private final int yPos;

        public Position(int xPos, int yPos) {
            this.xPos = xPos;
            this.yPos = yPos;
        }

        public int getxPos() {
            return xPos;
        }

        public int getyPos() {
            return yPos;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", xPos, yPos);
        }
    }

    public static Position findEntry(int[][] matrix, int wert) {
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                if (matrix[i][k] == wert) {
                    return new Position(i, k);
                }
            }
        }

        return null;
    }
}
