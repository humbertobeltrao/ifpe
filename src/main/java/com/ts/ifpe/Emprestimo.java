package com.ts.ifpe;

import java.util.Date;

public class Emprestimo {
	private Usuario usuario;
	private Livro livro;
	private Date dataEmp;
	private Date dataDev;
	


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Date getDataEmp() {
		return dataEmp;
	}

	public void setDataEmp(Date dataEmp) {
		this.dataEmp = dataEmp;
	}

	public Date getDataDev() {
		return dataDev;
	}

	public void setDataDev(Date dataDev) {
		this.dataDev = dataDev;
	}
	
	
	
	
	
	
}
