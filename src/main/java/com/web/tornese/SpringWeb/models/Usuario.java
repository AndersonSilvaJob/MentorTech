package com.web.tornese.SpringWeb.models;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id;
    @Column(name = "nome_usuario", length = 150, nullable = false)
    private String nomeUsuario;

    @Column(name = "cpf_usuario", length = 25, nullable = false)
    private String cpfUsuario;

    @Column(name = "email_usuario", length = 100, nullable = false)
    private String emailUsuario;

    @Column(name = "senha_usuario", length = 100, nullable = false)
    private String senhaUsuario;

    @Column(name = "celular_usuario")
    private String celularUsuario;

    @Column(name = "linkedin_usuario")
    private String linkedinUsuario;

    @Column(name = "github_usuario")
    private String githubUsuario;

    @Column(name = "genero_usuario")
    private String generoUsuario;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getCpfUsuario() {
        return cpfUsuario;
    }
    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }
    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    public String getSenhaUsuario() {
        return senhaUsuario;
    }
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    public String getCelularUsuario() {
        return celularUsuario;
    }
    public void setCelularUsuario(String celularUsuario) {
        this.celularUsuario = celularUsuario;
    }
    public String getLinkedinUsuario() {
        return linkedinUsuario;
    }
    public void setLinkedinUsuario(String linkedinUsuario) {
        this.linkedinUsuario = linkedinUsuario;
    }
    public String getGithubUsuario() {
        return githubUsuario;
    }
    public void setGithubUsuario(String githubUsuario) {
        this.githubUsuario = githubUsuario;
    }
    public String getGeneroUsuario() {
        return generoUsuario;
    }
    public void setGeneroUsuario(String generoUsuario) {
        this.generoUsuario = generoUsuario;
    }
    
    
}
