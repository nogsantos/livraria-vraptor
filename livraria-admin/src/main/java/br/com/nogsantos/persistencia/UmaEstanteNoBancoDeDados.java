package br.com.nogsantos.persistencia;

import br.com.nogsantos.dao.LivroDao;
import br.com.nogsantos.modelo.Estante;
import br.com.nogsantos.modelo.Livro;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Dec 16, 2014
 */
public class UmaEstanteNoBancoDeDados implements Estante {
	
	private final LivroDao dao;
	/**
	 * @deprecated
	 */
	public UmaEstanteNoBancoDeDados() {
		this(null);
	}	
	@Inject
	public UmaEstanteNoBancoDeDados(LivroDao dao) {
		this.dao = dao;
	}

    @Override
    public void guarda(Livro livro) {
    	this.dao.adiciona(livro);
    }

    @Override
    public List<Livro> todosOsLivros() {
    	return this.dao.todos();
    }

	@Override
	public Livro buscaPorIsbn(String isbn) {
		return this.dao.buscaPorIsbn(isbn);
	}

}
