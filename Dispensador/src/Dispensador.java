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

		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++ 1-Conectar com a client      ++");
		System.out.println("++ 2-Conectar com administrador ++");
		System.out.println("++ 3-Surtir                     ++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");

	}
	
	public static void Frame2(){	

		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++ 1-Buscar producte          ++");
		System.out.println("++ 2-Veure cesta de la compra ++");
		System.out.println("++ 3-Pagar                    ++");
		System.out.println("++ 4-Surtir                   ++");	
		System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++");

	}
			
	public static void Frame3(){

		System.out.println("++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("++ 1-Actualitzar albarà ++");
		System.out.println("++ 2-Surtir             ++");
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++");

	}
	
	public static void Frame2_1(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++ Introdueixi maca / model del producte ++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		textBusqueda=scanner.nextLine();
	}
	
	public static void Frame2_1_1(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++ S'e 'han trobat els seguents productes basats en "+ textBusqueda + " ++" );
		System.out.println("++ CN. Medicament | Marca | Nom | Preu                                 ++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		boolean comprovacion = false;
		for (int i = 0; i < productes.length; i++) {
		if (textBusqueda.equals(productes[i].nom) || textBusqueda.equals(productes[i].marca)) {
               System.out.println(productes[i].CN+" | " +productes[i].marca+ " | " + productes[i].nom+ " | "+productes[i].preu);
                comprovacion = true;

	}
}
		if (comprovacion == false){

		System.out.println("- NO DISPOSEM DEL SEGUENT PRODUCTE -");

	}
		else {
			
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
	
	public static void Frame2_2(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("Productes a la cesta:  " +ProductesCesta);
		
		for (int i = 0; i < NUM_PRODUCTES; i++) 
		{
		if(cesta[i] !=null) 
		{
		System.out.println(cesta[i].CN + " | " + cesta[i].marca+ " | " + cesta[i].nom+ " | " + cesta[i].preu+ " | ");
		System.out.println("TOTAL: "+cesta[i].preu);
		
		}

		}
	}
	
	public static void Frame3_1(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++ Introdueixi maca / model del producte ++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		textBusqueda=scanner.nextLine();
		Dispensador.Frame3_1_1();

	}
	
	public static void Frame3_1_1(){

		Scanner scanner = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("++ S'e 'han trobat els seguents productes basats en "+ textBusqueda + " ++" );
		System.out.println("++ CN. Medicament | Marca | Nom | Preu                                 ++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		boolean comprovacion = false;
		for (int i = 0; i < productes.length; i++) {
		if (textBusqueda2.equals(productes[i].nom) || textBusqueda2.equals(productes[i].marca)) {
        System.out.println(productes[i].CN+" | " +productes[i].marca+ " | " + productes[i].nom+ " | "+productes[i].preu+ " | "+productes[i].stock);
        comprovacion = true;

	}
}
		if (comprovacion == false){

		System.out.println("- NO DISPOSEM DEL SEGUENT PRODUCTE -");

	}
		else {
		System.out.println("Indiqui el CN del producte desitjat");
		int CN = scanner.nextInt();
		System.out.println("Indique la cantidad ");
		int cantidad = scanner.nextInt();

	}
}
	
	public static void CargarProductos() {
		for (int i = 0; i < productes.length; i++) {
			productes[i] = new Medicament();
			productes[i].nom = "Medicament"+i;
			productes[i].CN = +i;
			productes[i].marca = "Marca"+ (int) Math.floor(Math.random() * (4 - 1 +1) +1);
			productes[i].preu = Math.floor(Math.random() * (50 - 5 +1) +1);
			productes[i].cant = (int) Math.floor(Math.random() * (20 - 2 +1) +1);
			productes[i].stock = (int) Math.floor(Math.random() * (99 - 1 +1) +1);
			
		}
		 
	}
		
}
	
	
	









	
	
	
	
	