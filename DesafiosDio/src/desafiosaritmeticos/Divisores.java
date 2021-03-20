package desafiosaritmeticos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisores {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		br.close();

		// declare suas variaveis com o valor correto
		int menorNumero = -1;

//continue o codigo
		if (c % a == 0) {

			for (int i = 1; i <= (1000000000); i++) {
				if (i >= a && i % a == 0 && i % b != 0 && d % i != 0 && c % i == 0) {
					menorNumero = i;
					break;
				}
			}
		}
		System.out.println(menorNumero);
	}
}
