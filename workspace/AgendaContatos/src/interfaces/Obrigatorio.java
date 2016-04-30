/**
 * 
 */
package interfaces;

import java.util.List;

import entidades.Pessoa;

/**
 * @author Elima
 * @interface: Obriga a todos trabalharem com esses nomes de metodos
 */
public interface Obrigatorio<QualquerEntidade> {
	
	public boolean create(QualquerEntidade ent);
	public boolean delete(Object key);
	public boolean update(QualquerEntidade ent);
	public QualquerEntidade select(Object key);
	public List<QualquerEntidade> selectAll();
	public Pessoa delete(String nome);

}
