package br.com.autobot.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "atividades")
@Getter
@Setter
public class Activity extends ID {

	@Basic(optional = false)
	@Column(name = "idplano")
	private Long idplano;
	@Basic(optional = false)
	@Column(name = "idscript")
	private Long idscript;
	@Basic(optional = false)
	@Column(name = "idusuario")
	private Long idusuario;
	@Basic(optional = false)
	@Column(name = "atividade")
	private String atividade;

	public Activity() {
	}

	public Activity(Long id) {
		this.setId(id);
		this.setDtcreate(new Date());
		this.setEnabled(true);
	}

	public Activity(Long idplano, Long idscript, Long idusuario, String atividade) {

		this.idplano = idplano;
		this.idscript = idscript;
		this.idusuario = idusuario;
		this.atividade = atividade;
		this.setDtcreate(new Date());
		this.setEnabled(true);
	}

}
