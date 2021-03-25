package com.accenture;

import java.util.StringJoiner;

public class Usuario {
    private int id;
    private String dataCadastro;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;
    private String perfil; // administrador - "A" / operador - "O"
    private String status; // ativo - "A" / cancelado - "C"

    public Usuario(int id, String dataCadastro, String nome, String login, String senha, String telefone, String email, String perfil, String status) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.perfil = perfil;
        this.status = status;
    }

    public Usuario(int id, String dataCadastro, String nome, String login, String senha, String perfil, String status) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.status = status;
        this.email = "Sem Email informado";
        this.telefone = "Sem telefone informado";
    }

    public int getId() {
        return id;
    }

    public Usuario setId(int id) {
        this.id = id;
        return this;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public Usuario setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Usuario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Usuario setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getTelefone() {
        return telefone;
    }

    public Usuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPerfil() {
        return perfil;
    }

    public Usuario setPerfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Usuario setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Usuario.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("dataCadastro='" + dataCadastro + "'")
                .add("nome='" + nome + "'")
                .add("login='" + login + "'")
                .add("senha='" + senha + "'")
                .add("telefone='" + telefone + "'")
                .add("email='" + email + "'")
                .add("perfil='" + perfil + "'")
                .add("status='" + status + "'")
                .toString();
    }
}