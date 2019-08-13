
public class Ex05 {

	public static void main(String[] args) {
		int m [] [] = new int [5] [5];
		int ml = m.length;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i+j) == (ml-1)) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
				System.out.println("\t" + m[i][j]);
			}
			System.out.println(" ");
		}
	}
}