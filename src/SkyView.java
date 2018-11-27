public class SkyView {

    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols]; int pos = 0;

        for (int r = 0; r < view.length; r ++) {
            if (r % 2 == 0) {
                for (int c = 0; c < view[r].length; c ++) {
                    view[r][c] = scanned[pos];
                    pos ++;
                }
            }
            else {
                for (int j = view[r].length - 1; j >= 0; j --) {
                    view[r][j] = scanned[pos];
                    pos ++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double total = 0.0; int numCounted = 0;

        for (int i = startRow; i <= endRow; i ++) {
            for (int j = startCol; j <= endCol; j ++) {
                total += this.view[i][j]; numCounted ++;
            }
        }
        return (double) (total / numCounted);
    }
}
