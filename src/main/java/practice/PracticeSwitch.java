package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] jobs = { 1, 2, 4, 1, 5, 5, 2, 1, 3, 1 };

		for (int i = 0; i < jobs.length; i++) {
			int job = jobs[i];

			switch (job) {
			case 1:
				System.out.println("1:勇者");
				break;

			case 2:
				System.out.println("2:バトルマスター");
				break;

			case 3:
				System.out.println("3:パラディン");
				break;

			case 4:
				System.out.println("4:海賊");
				break;

			case 5:
				System.out.println("5:魔法剣士");
				break;

			}

		}

	}
}
