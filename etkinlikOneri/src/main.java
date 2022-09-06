import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int heat;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sýcaklýk giriniz:");
		heat = input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		else if(5<=heat && heat<15) {
			System.out.println("Sinemaya gidebilirsin.");
		}
		else if(15<=heat && heat<25) {
			System.out.println("Pikniðe gidebilirsin.");
		}
		else {
			System.out.println("Yüzmeye gidebilirsin.");
		}

	}

}
