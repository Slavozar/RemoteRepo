
public class zad5 {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] sumByRows = new int[array.length];
		int[] sumByCols = new int[array[0].length];
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				sumByRows[row] += array[row][col];
			}
		}
		int maxSumByRows = Integer.MIN_VALUE;

		for (int i = 0; i < sumByRows.length; i++) {
			if (sumByRows[i] > maxSumByRows) {
				maxSumByRows = sumByRows[i];
			}
		}
		System.out.println("Максималната сума по редове е: " + maxSumByRows);
		for (int col = 0; col < array[0].length; col++) {
			for (int row = 0; row < array.length; row++) {
				sumByCols[col] += array[row][col];
			}
		}
		int maxSumByCols = Integer.MIN_VALUE;
		for (int i = 0; i < sumByCols.length; i++) {
			if (sumByCols[i] > maxSumByCols) {
				maxSumByCols = sumByCols[i];
			}
		}
		System.out.println("Максималната сума по колони е: " + maxSumByCols);
		if (maxSumByRows > maxSumByCols) {
			System.out.println("Максималната сума по редове> Максималната сума по колони");
		} else {
			if (maxSumByRows == maxSumByCols) {
				System.out.println("Максималната сума по редове=Максималната сума по колни");
			} else {
				System.out.println("Максималната сума по редове<Максималната сума по колони");

			}

		}

	}

}
