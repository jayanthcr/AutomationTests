package numeric.programs;

public class SquaresInChessBoard {
    public static void main(String[] args) {
        int N = 8; // Example for an 8x8 chessboard
        int totalSquares = calculateTotalSquares(N);
        System.out.println("Total number of squares in a " + N + "x" + N + " chessboard is: " + totalSquares);
    }

    public static int calculateTotalSquares(int N) {
        return (N * (N + 1) * (2 * N + 1)) / 6;
    }
}
//formula is n(n+1)(2n+1)/6

