package entidades;

public class Pessoa {

	private int id_pes;
	private String nome;
	private String sobrenome;
	private SexoType sexo;
	private String telefone;
	private String email;
	private String rua;
	private int numero;
	private String complemento;
	private String cep;
	private String cidade;
	private EstadoType estado;
	private String pais;
	private String foto;

	public Pessoa() {

	}


	/**
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 * @param telefone
	 * @param email
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param cep
	 * @param cidade
	 * @param estado
	 * @param pais
	 */
	public Pessoa(String nome, String sobrenome, SexoType sexo, String telefone, String email, String rua,
			int numero, String complemento, String cep, String cidade, EstadoType estado, String pais) {
		super();
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}



	/**
	 * @param id_pes
	 * @param nome
	 * @param sobrenome
	 * @param sexo
	 * @param telefone
	 * @param email
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param cep
	 * @param cidade
	 * @param estado
	 * @param pais
	 */
	public Pessoa(int id_pes, String nome, String sobrenome, SexoType sexo, String telefone, String email, String rua,
			int numero, String complemento, String cep, String cidade, EstadoType estado, String pais) {
		super();
		this.id_pes = id_pes;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
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
	public SexoType getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}

	/**
	 * @param id_pes
	 * @param nome
	 * @param sobrenome
	 * @param telefone
	 * @param email
	 * @param rua
	 * @param numero
	 * @param complemento
	 * @param cep
	 * @param cidade
	 * @param pais
	 */
	public Pessoa(int id_pes, String nome, String sobrenome, String telefone, String email, String rua, int numero,
			String complemento, String cep, String cidade, String pais) {
		super();
		this.id_pes = id_pes;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.email = email;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.pais = pais;
	}


	/**
	 * @return the rua
	 */
	public String getRua() {
		return rua;
	}

	/**
	 * @param rua
	 *            the rua to set
	 */
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the estado
	 */
	public EstadoType getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(EstadoType estado) {
		this.estado = estado;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", rua=");
		builder.append(rua);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append(", cep=");
		builder.append(cep);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", pais=");
		builder.append(pais);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
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
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + id_pes;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id_pes != other.id_pes)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
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
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}

}
