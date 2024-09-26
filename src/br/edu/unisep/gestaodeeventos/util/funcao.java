package br.edu.unisep.gestaodeeventos.util;

import br.edu.unisep.gestaodeeventos.model.participante;
import br.edu.unisep.gestaodeeventos.model.Inscricao;
import br.edu.unisep.gestaodeeventos.model.Palestrante;
import br.edu.unisep.gestaodeeventos.model.Sessao;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class funcao {
    private List<participante> participantes = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    private List<Sessao> sessaos = new ArrayList<>();
    private List<Inscricao> inscricaos = new ArrayList<>();

    public void novoparticipante() {
        String nome;
        String cpf;
        String email;
        String telefone;
        String idinscricao;
        nome = JOptionPane.showInputDialog("digite o nome do participante");
        idinscricao = JOptionPane.showInputDialog("digite o id da inscricao");
        telefone = JOptionPane.showInputDialog("digite o telefone do participante");
        cpf = JOptionPane.showInputDialog("digite o cpf do participante");
        email = JOptionPane.showInputDialog("digite o email do participante");

        participante participante = new participante();
        participante.setNome(nome);
        participante.setCpf(cpf);
        participante.setEmail(nome);
        participante.setTelefone(nome);
        participante.setIdinscricao(nome);

        participantes.add(participante);

        JOptionPane.showMessageDialog(null, participante);
    }
    public void novoPalestrante() {
        String nome;
        String cpf;
        String tipopalestra;
        String descricao;
        String telefone;
        String email;
        String local;

        nome = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("digite o nome do palestrante")));
        cpf = JOptionPane.showInputDialog("digite o seu CPF");
        tipopalestra = JOptionPane.showInputDialog("digite o tipo de sua palestra");
        descricao = JOptionPane.showInputDialog("digite um resumo sobre sua palestra");
        telefone = JOptionPane.showInputDialog("digite o seu telefone");
        email = JOptionPane.showInputDialog("digite o seu email");
        local = JOptionPane.showInputDialog("digite o local de sua palestra");

        Palestrante palestrante = new Palestrante();
        palestrante.setNome(nome);
        palestrante.setCpf(cpf);
        palestrante.setTipopalestra(tipopalestra);
        palestrante.setDescricao(descricao);
        palestrante.setTelefone(telefone);
        palestrante.setEmail(email);
        palestrante.setLocal(local);

        palestrantes.add(palestrante);

        JOptionPane.showMessageDialog(null, palestrante);
        }


        public void novoInscricao() {
        String nome;
        String local;
        String email;
        String telefone;
        String endereco;

        nome = JOptionPane.showInputDialog("digite o nome do participante");
        local = JOptionPane.showInputDialog("digite o local da palestra");
        email = JOptionPane.showInputDialog("digite seu email");
        telefone = JOptionPane.showInputDialog("digite seu telefone");
        endereco = JOptionPane.showInputDialog("digite o seu endereco");

        Inscricao Inscricao = new Inscricao();
        Inscricao.setNome(nome);
        Inscricao.setLocal(local);
        Inscricao.setEmail(email);
        Inscricao.setTelefone(telefone);
        Inscricao.setEndereco(endereco);
        Inscricao.add(Inscricao);
        JOptionPane.showMessageDialog(null, Inscricao);

        }
        public void novoSessao() {
        String local;
        String nomepalestrante;
        String tipopalestra;
        String objetivo;

        local = JOptionPane.showInputDialog("digite o local ");
        nomepalestrante = JOptionPane.showInputDialog("digite o nome do palestrante");
        tipopalestra = JOptionPane.showInputDialog("digite o tipo de sua palestra");
        objetivo = JOptionPane.showInputDialog("digite o objetivo ");

        Sessao Sessao = new Sessao();
        Sessao.setLocal(local);
        Sessao.setNomepalestrante(nomepalestrante);
        Sessao.setTipopalestra(tipopalestra);
        Sessao.setObjetivo(objetivo);

        JOptionPane.showMessageDialog(null, Sessao);

    }

    public boolean escolherOpcao() {
        String[] opcoes = {
                "realizar inscrição",
                "escolher sessão",
                "cadastrar palestrante",
                "cadastrar participante",
                "listar participantes",
                "listar sessões",
                "sair",


        };
        int opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "escolha uma opção",
                "Menu principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );

        switch (opcaoEscolhida) {
            case 0:
                novoInscricao();
                break;
            case 1:
                novoSessao();
                break;
            case 2:
                novoPalestrante();
                break;
            case 3:
                novoparticipante();
                break;
            case 4:
                listarparticipantes();
                break;
            case 5:
                listarSessoes();
                break;
            case 6:
                return false;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                break;
        }
        return true;
    }

    private void listarparticipantes() {
        String texto = "participantes\n";
        for (participante p : participantes) {
            texto += participantes + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }


    public void listarSessoes() {
        String texto = "sessoes\n";
        for(Sessao sessao : sessaos ){
            texto += sessao + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }


    public void novoLancamento() {

    }
    

}

