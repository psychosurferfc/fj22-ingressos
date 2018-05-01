package br.com.caelum.ingresso.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sessao {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Filme filme;
	@ManyToOne
	private Sala sala;
	private LocalTime horario;
	
	/** @deprecated - Para uso do Hibernate */
	public Sessao() {	}

	public Sessao(Sala sala, Filme filme, LocalTime horaSessao) {
		this.horario = horaSessao;
		this.filme = filme;
		this.sala = sala;
	}
	
	public LocalTime getHorarioTermino() {
		return this.horario.plusMinutes(this.filme.getDuracao().toMinutes());
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horaSessao) {
		this.horario = horaSessao;
	}
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
