package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Evento implements Serializable{
		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long codigo;

		public long getCodigo() {
			return codigo;
		}
		public void setCodigo(long codigo) {
			this.codigo = codigo;
		}
		@NotNull
		@NotEmpty
		@NotBlank
		private String nome;
		
		@NotNull
		@NotEmpty
		@NotBlank
		private String local;
		
		@NotNull
		@NotEmpty
		@NotBlank
		private String data;
		
		@NotNull
		@NotEmpty
		@NotBlank
		private String horario;
		
		
		@OneToMany
		private List<Convidado> convidados;
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getLocal() {
			return local;
		}
		public void setLocal(String local) {
			this.local = local;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHorario() {
			return horario;
		}
		public void setHorario(String horario) {
			this.horario = horario;
		}
		
}
