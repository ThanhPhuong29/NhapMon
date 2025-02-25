import java.util.Scanner;

public class BaiTap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int S = 0;
		for (int i = 1; i <= x; i++) {
			String x2 = "" + i + i;
			S += Integer.parseInt(x2);// hàm chuyển xâu sang số nguyên
		}

		System.out.println("S=" + S);
	}
}
