import java.util.Arrays;
import java.util.Scanner;

public class Cripting {
	static int[][] findIndex(char[][] masiv, char bukva, char bukva1) {
		int[][] koordinati = new int[2][2];
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[0].length; j++) {
				if ((bukva == masiv[i][j])) {
					koordinati[0][0] = i;
					koordinati[0][1] = j;
				}
			}
		}
		for (int i = 0; i < masiv.length; i++) {
			for (int j = 0; j < masiv[0].length; j++) {
				if ((bukva1 == masiv[i][j])) {
					koordinati[1][0] = i;
					koordinati[1][1] = j;
				}
			}
		}

		return koordinati;
	}

	static int[][] razlRedRazlKol(int[][] koordinati) {
		int swap = koordinati[1][1];
		koordinati[1][1] = koordinati[0][1];
		koordinati[0][1] = swap;

		return koordinati;
	}

	static int[][] razlRedEdnKol(int[][] koordinati, char[][] key) {
		koordinati[0][0]++;
		koordinati[1][0]++;
		if (koordinati[0][0] > key.length - 1) {
			koordinati[0][0] = 0;
		}
		if (koordinati[1][0] > key.length - 1) {
			koordinati[1][0] = 0;
		}
		return koordinati;

	}

	static int[][] razlRedEdnKolDecrypt(int[][] koordinati, char[][] key) {
		koordinati[0][0]--;
		koordinati[1][0]--;
		if (koordinati[0][0] < 0) {
			koordinati[0][0] = key.length - 1;
		}
		if (koordinati[1][0] < 0) {
			koordinati[1][0] = key.length - 1;
		}
		return koordinati;

	}

	static int[][] ednRedRazlKol(int[][] koordinati, char[][] key) {
		koordinati[0][1]++;
		koordinati[1][1]++;
		if (koordinati[0][1] > key.length - 1) {
			koordinati[0][1] = 0;
		}
		if (koordinati[1][1] > key.length - 1) {
			koordinati[1][1] = 0;
		}
		return koordinati;

	}

	static int[][] ednRedRazlKolDecrypt(int[][] koordinati, char[][] key) {
		koordinati[0][1]--;
		koordinati[1][1]--;
		if (koordinati[0][1] < 0) {
			koordinati[0][1] = key.length - 1;
		}
		if (koordinati[1][1] < 0) {
			koordinati[1][1] = key.length - 1;
		}
		return koordinati;

	}

	static String encrypt(char[][] key, String text) {
		text = text.toUpperCase();
		String rezultat = "";
		if (text.length() % 2 == 1) {
			text += 'A';
		}
		int row = 0, col = 0;
		int row1 = 0, col1 = 0;
		int[][] koordinati = new int[2][2];
		for (int i = 0; i < text.length(); i += 2) {
			koordinati = findIndex(key, text.charAt(i), text.charAt(i + 1));
			row = koordinati[0][0];
			col = koordinati[0][1];
			row1 = koordinati[1][0];
			col1 = koordinati[1][1];

			if ((row != row1) && (col != col1)) {
				koordinati = razlRedRazlKol(koordinati);
			} else {
				if ((row != row1) && (col == col1)) {
					koordinati = razlRedEdnKol(koordinati, key);
				} else {
					koordinati = ednRedRazlKol(koordinati, key);
				}
			}
			row = koordinati[0][0];
			col = koordinati[0][1];
			row1 = koordinati[1][0];
			col1 = koordinati[1][1];
			rezultat += key[row][col];
			rezultat += key[row1][col1];
		}
		return rezultat;
	}

	static String decrypt(char[][] key, String text) {
		text = text.toUpperCase();
		String rezultat = "";
		if (text.length() % 2 == 1) {
			text += 'A';
		}
		int row = 0, col = 0;
		int row1 = 0, col1 = 0;
		int[][] koordinati = new int[2][2];
		for (int i = 0; i < text.length(); i += 2) {
			koordinati = findIndex(key, text.charAt(i), text.charAt(i + 1));
			row = koordinati[0][0];
			col = koordinati[0][1];
			row1 = koordinati[1][0];
			col1 = koordinati[1][1];

			if ((row != row1) && (col != col1)) {
				koordinati = razlRedRazlKol(koordinati);
			} else {
				if ((row != row1) && (col == col1)) {
					koordinati = razlRedEdnKolDecrypt(koordinati, key);
				} else {
					koordinati = ednRedRazlKolDecrypt(koordinati, key);
				}
			}
			row = koordinati[0][0];
			col = koordinati[0][1];
			row1 = koordinati[1][0];
			col1 = koordinati[1][1];
			rezultat += key[row][col];
			rezultat += key[row1][col1];
		}
		return rezultat;
	}

	public static void main(String[] args) {
		char[][] key = { { 'A', 'B', 'C', 'D', 'E' }, 
									{ 'F', 'G', 'H', 'I', 'J' }, 
									{ 'K', 'L', 'M', 'N', 'O' },
									{ 'P', 'Q', 'R', 'S', 'T' }, 
									{ 'U', 'V', 'X', 'W', 'Y' } };

	
		System.out.println(decrypt(key, "MXNWJDRIKCPOBB"));

	}
}
