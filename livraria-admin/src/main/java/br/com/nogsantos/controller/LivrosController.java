package br.com.nogsantos.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.nogsantos.modelo.Estante;
import br.com.nogsantos.modelo.Livro;
import br.com.nogsantos.persistencia.UmaEstanteNoBancoDeDados;
import java.util.List;
import javax.inject.Inject;
/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Dec 16, 2014
 */
@Controller
@Path("livros")
public class LivrosController {

    private Result result;
    private Estante estante;
    /**
     * @deprecated CDI eyes only
     */
    LivrosController() {}
    /**
     * Constructor 
     */
    @Inject
    public LivrosController(Result result, Estante estante) {
        this.result  = result;
        this.estante = estante;
    }
    /**
     * Formulário 
     */
    @Path("formulario")
    public void formulario() {

    }
    /**
     * Método salvar
     */
    @Path("salva")
    public void salva(Livro livro) {        
        this.estante.guarda(livro);
        this.result.include("mensagem", "Livro salvo com sucesso!");        
        this.result.redirectTo(this).lista();
    }
    /**
     * Método listar 
     */
    @Path("lista")
    public List<Livro> lista() {        
        return this.estante.todosOsLivros();
    }
    /**
     * Método editar
     */
    @Path("edita/{isbn}")
    public void edita(String isbn){    	
    	Livro livroEncontrado = this.estante.buscaPorIsbn(isbn);
    	/*
    	 * Mesmo resultado do método formulário. 
    	 */
    	this.result.include(livroEncontrado);
    	this.result.of(this).formulario();
    }

}
