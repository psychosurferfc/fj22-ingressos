package br.com.caelum.ingresso.model;

import java.time.LocalTime;

public class Sessao {
	
	private Integer id;
	private Filme filme;
	private Sala sala;
	private LocalTime horaSessao;
	
	/** @deprecated - Para uso do Hibernate */
	public Sessao() {	}

	public Sessao(Sala sala, Filme filme, LocalTime horaSessao) {
		this.horaSessao = horaSessao;
		this.filme = filme;
		this.sala = sala;
	}
	
	public LocalTime getHorarioTermino() {
		return this.horaSessao.plusMinutes(this.filme.getDuracao().toMinutes());
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalTime getHoraSessao() {
		return horaSessao;
	}
	public void setHoraSessao(LocalTime horaSessao) {
		this.horaSessao = horaSessao;
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
