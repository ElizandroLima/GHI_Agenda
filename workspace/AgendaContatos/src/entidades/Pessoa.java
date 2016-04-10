package entidades;

public class Pessoa {

	private int id_pes;
	private String nome;
	private String sobrenome;
	private String sexo;

	private Endereco endereco;
	private Contato contato;

	public Pessoa() {

	}

	/**
	 * @param id_pes
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 * @param endereco
	 * @param contato
	 */
	public Pessoa(int id_pes, String nome, String sobrenome, String sexo, Endereco endereco, Contato contato) {
		super();
		this.id_pes = id_pes;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.contato = contato;
	}

	/**
	 * @param id_pes
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 */
	public Pessoa(int id_pes, String nome, String sobrenome, String sexo) {
		super();
		this.id_pes = id_pes;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}

	/**
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 */
	public Pessoa(String nome, String sobrenome, String sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
	}

	/**
	 * @return the id_pes
	 */
	public int getId_pes() {
		return id_pes;
	}

	/**
	 * @param id_pes
	 *            the id_pes to set
	 */
	public void setId_pes(int id_pes) {
		this.id_pes = id_pes;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome
	 *            the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	/**
	 * @return the contato
	 */
	public Contato getContato() {
		return contato;
	}

	/**
	 * @param contato
	 *            the contato to set
	 */
	public void setContato(Contato contato) {
		this.contato = contato;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_pes;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (id_pes != other.id_pes)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [id_pes=");
		builder.append(id_pes);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append(", contato=");
		builder.append(contato);
		builder.append("]");
		return builder.toString();
	}

}