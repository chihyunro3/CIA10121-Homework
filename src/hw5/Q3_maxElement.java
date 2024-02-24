package hw5;

public class Q3_maxElement {

	public static void main(String[] args) {
		int[][] intArray = { 
				{ 1, 6, 3 }, 
				{ 9, 5, 2 } 
				};

		double[][] doubleArray = { 
				{ 1.2, 3.5, 2.2 },
				{ 7.4, 2.1, 8.2 } 
				};

		Q3_maxElement w = new Q3_maxElement();

		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

	}

	public int maxElement(int x[][]) {
		int max = x[0][0];
		for (int a = 0; a < x.length; a++) {
			for (int b = 0; b < x[a].length; b++) {
				if (x[a][b] > max) {
					max = x[a][b];
				}
			}

		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = x[0][0];
		for (int a = 0; a < x.length; a++) {
			for (int b = 0; b < x[a].length; b++) {
				if (x[a][b] > max) {
					max = x[a][b];
				}
			}

		}
		return max;
	}

}
