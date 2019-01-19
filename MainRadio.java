import java.util.Scanner;

public class MainRadio{
	public static void main(String[] args){
		String menu;
		int opcion, boton;
		Scanner scan = new Scanner(System.in);
		
		MyRadio radio = new MyRadio();
		
		menu = ("1. Encender radio\n2. Cambiar frecuencia\n3. "
		+ "\n4. Guardar emisora\n5. Seleccionar emisora\n6. Apagar radio");
		
		System.out.println("BIENVENIDO");
		System.out.println("Elija una de las siguiente opciones");
		System.out.println(menu);
		opcion = scan.nextInt();
		
		while (opcion != 6){
			if (opcion == 1){
				if (radio.getState() == false){
					radio.toggle();
					System.out.println("La radio se ha encendido");
					if (radio.getFrequency() == true){
						System.out.println("Frecuencia: AM");
					} else {
						System.out.println("Frecuencia: FM");
					}
					System.out.println("Estacion: " + radio.getStation() + "\n");
				} else {
					radio.toggle();
					System.out.println("La Radio se ha apagado\n");
				}
				System.out.println(menu);
				opcion = scan.nextInt();
			
			} else if (opcion == 2){
				System.out.println("CAMBIO DE FRECUENCIA");
				if (radio.getFrequency() == false){
					radio.changeFrequency();
					System.out.println("La radio se ha cambiado a FM");
					if (radio.getFrequency() == true){
						System.out.println("Frecuencia: AM");
					} else {
						System.out.println("Frecuencia: FM");
					}
					System.out.println("Estacion " + radio.getStation() + "\n");
				} else {
					radio.changeFrequency();
					System.out.println("La radio se ha cambiado a AM");
					if (radio.getFrequency() == true){
						System.out.println("Frecuencia: AM");
					} else {
						System.out.println("Frecuencia: FM");
					}
					System.out.println("Estacion: " + radio.getStation() + "\n");
				}
				System.out.println(menu);
				opcion = scan.nextInt();
				
				
			} else if (opcion == 3){
				System.out.println("CAMBIAR DE EMISORA");
				System.out.println("1. Subir\n2. Bajar");
				boton = scan.nextInt();
				if (boton == 1){
					radio.changeStation(true);
				} else {
					radio.changeStation(false);
				}
				if (radio.getFrequency() == true){
					System.out.println("Frecuencia: AM");
				} else {
					System.out.println("Frecuencia: FM");
				}
				System.out.println("Estacion: " + radio.getStation() + "\n");
				
				System.out.println(menu);
				opcion = scan.nextInt();
				
				
			} else if (opcion == 4){
				System.out.println("GUARDAR EMISORA");
				System.out.println("Ingrese el boton donde desee guardar la emisora (1-12)");
				boton = scan.nextInt();
				radio.saveStation(boton);
				System.out.println("La estacion " + radio.getStation() + " se ha guardado en el boton " + boton + "\n");
				System.out.println(menu);
				opcion = scan.nextInt();
				
				
			} else if (opcion == 5){
				System.out.println("SELECCIONAR EMISORA");
				System.out.println("Ingrese el boton");
				boton = scan.nextInt();
				radio.changeStationButton(boton);
				if (radio.getFrequency() == true){
					System.out.println("Frecuencia: AM");
				} else {
					System.out.println("Frecuencia: FM");
				}
				System.out.println("Estacion: " + radio.getStation() + "\n");
				
				System.out.println(menu);
				opcion = scan.nextInt();
				
				
			} else if (opcion == 6){
				if (radio.getState() == true){
					radio.toggle();
					System.out.println("El radio se ha apagado");
				} else {
					System.out.println("EL RADIO YA ESTABA APAGADO");
				}
			}
		}
	}
}