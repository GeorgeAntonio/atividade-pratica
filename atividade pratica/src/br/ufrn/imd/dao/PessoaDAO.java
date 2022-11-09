package br.ufrn.imd.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufrn.imd.modelo.Pessoa;

public class PessoaDAO {
private List<Pessoa> pessoas;
	
	public void cadastraPessoa(Pessoa p) {
		if(pessoas == null) {
			pessoas = new ArrayList<Pessoa>();
		}
		pessoas.add(p);
	}
	public List<Pessoa> listarPessoasCadastradas(){
		return pessoas;
	}
	public void removePessoa(Pessoa p) {
		if(pessoas == null) {
			System.out.println("Pessoa não encontrada.");
		}else {
			Iterator<Pessoa> itr = pessoas.iterator();
			while (itr.hasNext()) {
				Pessoa pessoa = itr.next();
	            if (pessoa.equals(p)) {
	            	pessoas.remove(p);
	            }
	        }
		}
	}
	public void calcularTributosPessoas(Pessoa p) {
		
	}
	public void imprimeImpostoTotal() {
		
	}
}
