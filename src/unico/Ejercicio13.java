package unico;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4)
		 * y suspensos.
		 */

		Scanner leer = new Scanner(System.in);

		final int TOPE = 6;
		final double SUS_CON = 5.0;
		final double SUSPENSO = 4.0;
		double nota;
		int n_con = 0;
		int n_sus = 0;
		int n_apro = 0;
		String mensaje;

		for (int i = 1; i <= TOPE; i++) {
			System.out.print("Introduzca la calificación: ");
			nota = Double.parseDouble(leer.nextLine());

			if (nota < SUSPENSO) {
				n_sus += 1;
			} else {
				if (nota < SUS_CON) {
					n_con += 1;
				} else {
					n_apro += 1;
				}
			}

		}

		mensaje = "Hay " + n_apro + " alumnos aprobados, " + n_con + " condicionados y " + n_sus + " suspensos";

		System.out.println(mensaje);
	}
}
