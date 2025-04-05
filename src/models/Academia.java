package models;

import java.util.ArrayList;

// Composição e Polimorfismo
public class Academia {
    private String nomeAcademia;
    private ArrayList<Pessoa> pessoas;

    public Academia(String nome){
        this.nomeAcademia = nome;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void listarPessoas(){
        System.out.println("Lista de Pessoas na Academia");
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getDescricao());
        }
    }
}
