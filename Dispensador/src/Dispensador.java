import java.util.Scanner;

public class Dispensador {
	
	private static final int NUM_PRODUCTES = 20;
	public static Medicament[] productes = new Medicament [NUM_PRODUCTES];
	public static Medicament[] cesta = new Medicament [NUM_PRODUCTES];
	static Scanner scanner = new Scanner(System.in);
	public static String textBusqueda;
	public static String textBusqueda2;
	public static int ProductesCesta;


	public static void Frame1(){
		System.out.println("++++++++++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++++++++++\n"
						   + "++ 1-Conectar com a client      ++\n"
						   + "++ 2-Conectar com administrador ++\n"
						   + "++ 3-Surtir                     ++\n"
						   + "++++++++++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++++++++++");
	}
	
	public static void Frame2(){	
		System.out.println("++++++++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++++++++\n"
						   + "++ 1-Buscar producte          ++\n"
						   + "++ 2-Veure cesta de la compra ++\n"
						   + "++ 3-Pagar                    ++\n"
						   + "++ 4-Surtir                   ++\n"	
						   + "++++++++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++++++++");

	}
			
	public static void Frame3(){
		System.out.println("++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++\n"
						   + "++ 1-Actualitzar albarà ++\n"
						   + "++ 2-Surtir             ++\n"
						   + "++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++");
	}
	
	public static void Frame2_1(){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++\n"
						   + "+++++++++++++++++++++++++++++++++++++++++++\n"
						   + "++ Introdueixi maca / model del producte ++\n"
						   + "+++++++++++++++++++++++++++++++++++++++++++\n"
						   + "+++++++++++++++++++++++++++++++++++++++++++");
		textBusqueda=scanner.nextLine();
	}
	
	public static void Frame2_1_1(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
						   + "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
						   + "++ S'e 'han trobat els seguents productes basats en "+ textBusqueda + " ++\n" 
						   + "++ CN. Medicament | Marca | Nom | Preu                                 ++\n"
						   + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
						   + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		boolean comprovacion = false;
		for (int i = 0; i < productes.length; i++) {
			if (textBusqueda.equals(productes[i].nom) || textBusqueda.equals(productes[i].marca)) {
				System.out.println(productes[i].CN+" | " +productes[i].marca+ " | " + productes[i].nom+ " | "+productes[i].preu);
				comprovacion = true;
			}
		}
		if (comprovacion == false){
			System.out.println("- NO DISPOSEM DEL SEGUENT PRODUCTE -");
		} else {
			System.out.println("Indiqui el CN del producte desitjat");
			int CN = scanner.nextInt();
			System.out.println("Indiqui cantitat");
			int cantidad = scanner.nextInt();	
			for (int i = 0; i < NUM_PRODUCTES; i++) {
				if (CN == productes[i].CN) {
					cesta[ProductesCesta] = new Medicament ();
					cesta[ProductesCesta].CN = productes[i].CN;
					cesta[ProductesCesta].marca = productes[i].marca;
					cesta[ProductesCesta].nom = productes[i].nom;
					cesta[ProductesCesta].preu = productes[i].preu;
					cesta[ProductesCesta].cant = cantidad;
					ProductesCesta++;
				}
				
			}
		}
		
	}
}	





	
	
	
	
	