import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		Dispensador.CargarProductos();
		Scanner scanner = new Scanner(System.in);
		
		do {
			Dispensador.Frame1();
			
			int Frame1 = scanner.nextInt();
			if (Frame1 == 1) {
			do {
			Dispensador.Frame2();
			
			int Frame2 = scanner.nextInt();
			if (Frame2 == 1) {
			Dispensador.Frame2_1();
			
			Dispensador.Frame2_1_1();
			
		} else if (Frame2 == 2) {
			Dispensador.Frame2_2();
			
		} else if (Frame2 == 3) {
			System.out.println("Surtint");
		} else if (Frame2 == 4) {
			System.out.println("Tornar");
			Dispensador.Frame1();
			
				break;
		} else {
			System.out.println("-");
				break;
	}
		} while (true);
		} else if (Frame1 == 2) {
		do {
			Dispensador.Frame3();
			
		int Frame3 = scanner.nextInt();
		if (Frame3 == 1) {
			Dispensador.Frame3_1();
			
		} else if (Frame3 == 2) {
			System.out.println("Surtint");
				break;
	}
		} while (true);
		} else if (Frame1 == 3) {
			System.out.println("Surtint");
				break;
		} else {
			System.out.println("-");
}
		} while (true);
}

}

