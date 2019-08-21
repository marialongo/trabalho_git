
public class endereco {
	
	private Integer id;
	private String rua;
	private String bairro;
	private String cidade;
	
	
	
	
	
	//método construtor vazio
	//os métodos construtores tem o mesmo nome da classe
	//os métodos construtores servem para iniciar atributos e executar ação iniciais do obj
	
	public endereco() {
		super();
		
		
		
		//método construtor de campo
	}
	
	public endereco (Integer id, String  rua, String bairro , String  cidade) {
		super();
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		
	}
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getrua() {
		return rua;
	}
	public void setrua(String rua) {
		this.rua = rua;
	}
	public String getbairro() {
		return bairro;
	}
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}

