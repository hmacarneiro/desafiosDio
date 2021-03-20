package desafiosaritmeticos;
import java.io.IOException;
import java.util.Scanner;

public class DesafioNumeros {

	public static void main(String[] args) throws IOException {
//declare suas variaveis corretamente
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;
		int dado;

//continue a solução
		for (int i = 0; i < 5; i++) {
			Scanner leitor = new Scanner(System.in);
			dado = leitor.nextInt();
			if (dado % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

			if (dado > 0) {
				positivos++;
			} else if (dado < 0) {
				negativos++;
			}

		}
//insira suas variaveis corretamente
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
	}

}