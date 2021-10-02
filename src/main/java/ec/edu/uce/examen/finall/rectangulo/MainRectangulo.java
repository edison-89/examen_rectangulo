package ec.edu.uce.examen.finall.rectangulo;

import java.util.Scanner;

public class MainRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int opcion;
		do {
			System.out.println("Programa de Figuras, seleccione opción:");
			System.out.println("1. Imagen rectángulo");
			System.out.println("2. SALIR");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				boolean dimensionesIncorrectas = true;// Por defecto inicia en true
				int base = 0;
				int altura = 0;
				do {
					System.out.println("\nIngrese dimensiones del rectángulo");
					System.out.println("Ingrese BASE:");
					base = teclado.nextInt();
					if (base >= 5) {
						System.out.println("Ingrese ALTURA:");
						altura = teclado.nextInt();
						if (altura >= 2) {
							if (base > altura) {
								dimensionesIncorrectas = false;// Solo cuando todas las dimensiones son correctas en la
																// variable incorrectas le pongo falso, para que ya no
																// siga pidiendo
							} else {
								System.out.println("La BASE tiene que ser mayor que la ALTURA");
							}
						} else {
							System.out.println("La ALTURA tiene que ser >= a 2");
						}

					} else {
						System.out.println("La BASE tiene que ser >= a 5");
					}
				} while (dimensionesIncorrectas);// También se puede poner dimensionesCorrectas==false, pero es
													// exactamente lo mismo
				// Una vez que ya ingreso las dimensiones correctas, grafico el rectangulo
				for (int fila = 0; fila < altura; fila++) {
					for (int columna = 0; columna < base; columna++) {
						if (fila == 0 || fila == altura - 1 || columna == 0 || columna == base - 1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}

				break;
			case 2:
				System.out.println("Saliendo del sistema....");
				break;
			default:
				System.out.println("Seleccione una opción correcta");
				break;
			}

		} while (opcion != 2);
	}

}
