package br.edu.unisep.gestaodeeventos.model;

public class participante {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String idinscricao;
    public participante() {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idinscricao = idinscricao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getIdinscricao() {
        return idinscricao;
    }
    public void setIdinscricao(String idinscricao) {
        this.idinscricao = idinscricao;
    }

    public void add(participante participante) {

    }
}
