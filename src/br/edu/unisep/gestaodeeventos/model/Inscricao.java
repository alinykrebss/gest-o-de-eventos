package br.edu.unisep.gestaodeeventos.model;

public class Inscricao {
    private String nome;
    private String local;
    private String email;
    private String telefone;
    private String endereco;
    public Inscricao() {
        this.nome = nome;
        this.local = local;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }
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
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void add(Inscricao inscricao) {
    }
}