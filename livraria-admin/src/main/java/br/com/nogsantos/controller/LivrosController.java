package br.com.nogsantos.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.nogsantos.modelo.Estante;
import br.com.nogsantos.modelo.Livro;
import br.com.nogsantos.persistencia.UmaEstanteQualquer;
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

    private final Result result;
    /**
     * @deprecated CDI eyes only
     */
    public LivrosController() {
        this(null);
    }
    @Inject
    public LivrosController(Result result) {
        this.result = result;
    }
    
    public void formulario() {

    }

    public void salva(Livro livro) {
        Estante estante = new UmaEstanteQualquer();
        estante.guarda(livro);
    }
    @Path("lista")
    public List<Livro> lista() {
        Estante estante = new UmaEstanteQualquer();
        return estante.todosOsLivros();
    }
    
    public void edita(String isbn){
        
    }

}
