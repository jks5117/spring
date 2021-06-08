
public class Array {

	public static void main(String[] args) {
		int[] score;
		score = new int[] { 91, 85, 76, 88, 60, 65 };

		int[] score1 = new int[6];
		score[0] = 91;
		score[1] = 85;
		score[2] = 76;
		score[3] = 88;
		score[4] = 60;
		score[5] = 65;

		double tot = 0;
		double avg = 0.0;

		for (int i = 0; i < score.length; i++) {
			tot += score[i];
			avg = tot / score.length;
		}
		System.out.println(tot);
		System.out.println(avg);
		System.out.println(score[0]);

	}
}