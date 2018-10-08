import java.util.Scanner;

public class TotalMainDiagonal {
    public static void main(String[] args) {
        int[][] matrix;
        int size;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size square matrix: ");
        size = scanner.nextInt();
        matrix = new int[size][size];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    total += matrix[i][j];
            }
        }
        System.out.println("Total element of the main diagonal of this square matrix: " + total);
    }
}
