package br.edu.unisep.gestaodeeventos.model;

public class Sessao {
    private String local;
    private String nomepalestrante;
    private String tipopalestra;
    private String objetivo;

    public Sessao() {
        String local, nomepalestrante, tipopalestra, objetivo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void getNomepalestrante() {
        this.nomepalestrante = nomepalestrante;
    }

    public void setNomepalestrante(String nomepalestrante) {
        this.nomepalestrante = nomepalestrante;
    }

    public String getTipopalestra() {
        return tipopalestra;
    }

    public void setTipopalestra(String tipopalestra) {
        this.tipopalestra = tipopalestra;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}