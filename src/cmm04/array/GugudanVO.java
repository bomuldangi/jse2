package cmm04.array;

public class GugudanVO {
	
	
	public void calc() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	
}
