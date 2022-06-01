package com.web.tornese.SpringWeb.models;

import javax.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento")
  private int id;

  @Column(name = "data")
  private String data;

  @Column(name = "horario")
  private String horario;

  @Column(name = "categoria")
  private String categoria;

  @Column(name = "valor")
  private String valor;
 
  @ManyToOne
  private Mentor mentor;

  @ManyToOne
  private Usuario usuario;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public Mentor getMentor() {
    return mentor;
  }

  public void setMentor(Mentor mentor) {
    this.mentor = mentor;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
  }

  
}
