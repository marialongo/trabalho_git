
public class Pessoa {
	
	private Integer id;
	private String nome;
	private Integer idade;
	
	
	
	
	
	//m�todo construtor vazio
	//os m�todos construtores tem o mesmo nome da classe
	//os m�todos construtores servem para iniciar atributos e executar a��o iniciais do obj
	
	
	public Pessoa() {
		super();
		
		
		
		//m�todo construtor de campo
	}
	public Pessoa(Integer id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

}
