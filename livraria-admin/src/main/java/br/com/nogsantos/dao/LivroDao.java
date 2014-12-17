package br.com.nogsantos.dao;

import java.util.List;

import br.com.nogsantos.modelo.Livro;

public interface LivroDao {
	void adiciona(Livro livro);
	List<Livro> todos();
	Livro buscaPorIsbn(String isbn);
}
