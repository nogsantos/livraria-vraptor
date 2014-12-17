package br.com.nogsantos.modelo;

import java.util.List;

/**
 *
 * @author nogsantos
 * @since Dec 16, 2014
 */
public interface Estante {

    void guarda(Livro livro);
    List<Livro> todosOsLivros();
	Livro buscaPorIsbn(String isbn);
}
