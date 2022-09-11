package br.com.lginfo.loucademia.domain.aluno;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EstadoRepository {

	@PersistenceContext
	private EntityManager em;
	
	public List<Estado> listEstado(){
//		TypedQuery<Estado> q = em.createQuery("SELECT e FROM Estado e ORDER BY e.nomeEstado", Estado.class);
//		return q.getResultList();
		
		return em.createQuery("SELECT e FROM Estado e ORDER BY e.nomeEstado", Estado.class).getResultList();
		
	}

}
