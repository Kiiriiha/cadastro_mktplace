package br.com.senai.core.dao.postgres;

import br.com.senai.core.dao.DaoHorario;
import br.com.senai.core.domain.Horario;

public class DaoPostgresHorario implements DaoHorario {

	private final String INSERT = "INSERT INTO horarios_atendimento (dia_semana, hora_abertura, hora_fechamento, id_restaurante) VALUES (?, ?, ?, ?)";
	private final String UPDATE = "UPDATE horarios_atendimento SET dia_semana = ?, hora_abertura = ?, hora_fechamento = ?, id_restaurante = ? WHERE id = ?";
	private final String DELETE = "DELETE FROM horarios_atendimento WHERE id = ?";
	
	@Override
	public void inserir(Horario horario) {
		

	}

	@Override
	public void alterar(Horario horario) {
		

	}

	@Override
	public void excluirPor(int id) {
		

	}

}
