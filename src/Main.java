
public class Main {

	public static void main(String[] args) {

		//criando obj com construtor vazio:
		Pessoa pessoa1 = new Pessoa(1, "Maria", 26);
		endereco endereco1 = new endereco (2, "Rua bela","palhoca","sp");
		
		//criando obj com parâmetros:
		//cntrl + espaço completa rapido o código
		Pessoa pessoa2 = new Pessoa(1, "julia", 12);
		endereco endereco2 = new endereco (3, "Rua grande","são josé","ST");

		System.out.println("seu nome é " + pessoa1.getNome());
		System.out.println("ela esta indo para " + endereco1.getrua() + "\n");
		
		System.out.println("seu nome é " + pessoa2.getNome());
		System.out.println("ela esta indo para " + endereco2.getrua());
		
		
		
	}

}
