package Praticando_Java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ConjuntosBonsOuRuins {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int quantidade = Integer.valueOf(st.nextToken());

		// insira sua solução aqui
		
		while(quantidade != 0) {
			List<String> lista = new ArrayList<String>();

			
			while (quantidade-- > 0)
				lista.add(br.readLine());

			lista = lista.stream().sorted().collect(Collectors.toList());
			String tipoConjunto = "Conjunto Bom";
			
			for(int i=0; i<(lista.size() - 1); i++) {
				String valorAtual = lista.get(i);
				String proxValor = lista.get(i+1);
				
				if (proxValor.startsWith(valorAtual)) {
					tipoConjunto = "Conjunto Ruim";
					break;
				}
			}
			quantidade = Integer.valueOf(br.readLine());
			System.out.println(tipoConjunto);
		}


	}
}