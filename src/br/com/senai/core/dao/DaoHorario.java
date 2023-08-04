package br.com.senai.core.dao;

import br.com.senai.core.domain.Horario;

public interface DaoHorario {

	public void inserir(Horario horario);
	public void alterar(Horario horario);
	public void excluirPor(int id);
	
}
