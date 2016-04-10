/**
 * 
 */
package entidades;

/**
 * @author Elima
 *
 */
public class Contato {
	private int id_contato;
	private String telefone;
	private String email;

	/**
	 * @return the id_contato
	 */
	public int getId_contato() {
		return id_contato;
	}

	/**
	 * @param id_contato
	 *            the id_contato to set
	 */
	public void setId_contato(int id_contato) {
		this.id_contato = id_contato;
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id_contato;
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
		Contato other = (Contato) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id_contato != other.id_contato)
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
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
		builder.append("Contato [id_contato=");
		builder.append(id_contato);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
