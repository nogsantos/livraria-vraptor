package br.com.nogsantos.factory;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 * Especialização para o EntityManager para o JPA 
 */

public class FabricaDaJPA {
	/**
	 * //@PersistenceContext:
	 * 		Faz com que a dependencia seja gerenciada pelo servidor de aplicação.
	 */
	@PersistenceContext
	private EntityManager manager;
	/**
	 * Usar a injeção por construtor. 
	 */
	@Produces
	public EntityManager getManager() {
		return manager;
	}
	/**
	 * Cria as conexões da factory
	 * 
	 * //@Produces:
	 * 		Instrui o CDI a invocar esse método.
	 * //@ApplicationScoped: 
	 * 		Escopo de aplicação. 
	 * 		Singleton method, apenas uma instancia do componente 
	 * 		será criada na aplicação. 
	 */
//	@Produces
//	@ApplicationScoped
//	public EntityManager criaEntityManagerFactory() {
//		return (EntityManager) Persistence.createEntityManagerFactory("default");
//	}
	/**
	 * Crias as conexões manager 
	 */
//	@Produces
//	public EntityManager criaEntityManager(EntityManagerFactory factory) {
//		return factory.createEntityManager();
//	}
	/**
	 * Fecha as conexões criadas pela factory
	 * 	//@Disposes: 
	 * 		Callback do CDI que faz com que o método seja chamado quando 
	 * 		acabado de usar, ou seja, quando a instância do manager puder
	 * 		ser jogada fora.
	 */
//	public void fechaFactory(@Disposes EntityManagerFactory factory) {
//		factory.close();
//	}
	/**
	 * Fecha as conexões criadas pela manager
	 */
//	public void fechaManager(@Disposes EntityManager manager) {
//		manager.close();
//	}

}