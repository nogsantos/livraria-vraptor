package br.com.nogsantos.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import br.com.nogsantos.modelo.Livro;

/**
 *  //@Transactional:
 *  	Faz com que o código esteja em um contexto transacional. 
 *  	Todos os métodos da classe recebem o contexto transacional.
 */
@Transactional
public class JPALivroDao implements LivroDao {

	private EntityManager manager;
	/**
	 * @deprecated 
	 */
	JPALivroDao(){}
	/**
	 * Constructor dependence injector 
	 */
	@Inject
	public JPALivroDao(EntityManager manager) {
		this.manager = manager;
	}
	/**
	 * Método adicionar
	 */
	@Override
	public void adiciona(Livro livro) {
		if (livro.getId() == null) {
			this.manager.persist(livro);
		} else {
			this.manager.merge(livro);
		}
	}
	/**
	 * Método Listar
	 */
	@Override
	public List<Livro> todos() {
		return this.manager
				.createQuery("select l.* from livro l", Livro.class)
				.getResultList();
	}
	/**
	 * Buscar por código
	 * @param isbn 
	 */
	@Override
	public Livro buscaPorIsbn(String isbn) {
		try{
			return this.manager
					.createQuery("select l.* from livro l where l.isbn = :isbn", Livro.class)
					.setParameter("isbn", isbn)
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
