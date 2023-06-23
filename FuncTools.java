
public class FuncTools{

	// Atributos Com os refrões que serão cantados.
	String ref_loop	=	"\t%d patinhos\n\tForam passear\n\tAlém das montanhas\n\tPara brincar\n\tA mamãe gritou\n\tQuá, quá, quá, quá\n\tMas só %d patinhos\n\tVoltaram de lá.\n\n";
	String ref_final = "\tA mamãe patinha foi procurar\n\tAlém das montanhas\n\tNa beira do mar\n\tA mamãe gritou\n\tQuá, quá, quá, quá\n\tE os %d patinhos\n\tVoltaram de lá.\n";


	// Método que canta a música toda. Recebe um valor inteiro.
	public void cantar_ref(int patinhos){
		
		// Varia de patinhos até 2.
		for (int i = patinhos ; i!= 1 ; i--){
			System.out.printf(ref_loop,i,i-1);
		}
		
		// Chama a função replace_ref.
		System.out.println(replace_ref());
		
		// Canta o refrão final com o número inicial de patinhos.
		System.out.printf(ref_final,patinhos);
	
	}

	// Método que substitui as palvras no plural para o singular.
	// É chamado quando sobra apenas 1 pintinho.

	public String replace_ref(){
		String musica = "";

		musica = ref_loop.replace("patinhos", "patinho");
		musica = musica.replace("Foram","Foi");
		musica = musica.replace("só","nenhum");
		musica = musica.replace("Voltaram","Voltou");

		musica = String.format(musica, 1,0);
		musica = musica.replace("0", "");

		return musica;
	}

}