package br.com.nogsantos.persistencia;

import br.com.nogsantos.modelo.Estante;
import br.com.nogsantos.modelo.Livro;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Dec 16, 2014
 */
public class UmaEstanteQualquer implements Estante {

    @Override
    public void guarda(Livro livro) {
    }

    @Override
    public List<Livro> todosOsLivros() {
        Livro vraptor = new Livro();
        vraptor.setIsbn("123-45");
        vraptor.setTitulo("VRaptor 3");
        vraptor.setDescricao("Um livro sobre VRaptor 3");

        Livro arquitetura = new Livro();
        arquitetura.setIsbn("5678-90");
        arquitetura.setTitulo("Arquitetura");
        arquitetura.setDescricao("Um livro sobre arquitetura");

        return Arrays.asList(vraptor, arquitetura);
    }

}
