package Praticando_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class EntrevistaEmbaracosa {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String palavra;
		// insira sua solução aqui

		while ((palavra = br.readLine()) != null) { // complete seu código
			boolean finalPalavra = false;
			for (int i = 0; i < palavra.length(); i++) {

				if (palavra.substring(0, i).endsWith(palavra.substring(i))) {
					System.out.println(palavra.substring(0, i));
					finalPalavra = true;
				}
			}
			if (!finalPalavra)
				System.out.println(palavra);
		}
	}
}