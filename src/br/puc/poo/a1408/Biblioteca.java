package br.puc.poo.a1408;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> estante = new ArrayList<>();

    public boolean CadastraLivro(String titulo, int ano, double preco){
        boolean criou = false;
        Livro aux = new Livro(titulo, ano, preco);
        estante.add(aux);
        if(estante.contains(aux.getTitulo())) return true;
        else return false;
    }

    public String consultaLivro(String titulo){
        for (Livro livro:estante
             ) {
            if(estante.contains(livro.getTitulo().equals(titulo))){
                return livro.toString();
            }
        }
        return "Não Encontrado";
    }

    public boolean atualizaLivro(Livro livro){
        estante.add(livro);
        if(estante.contains(livro.getTitulo())) return true;
        return false;
    }

    public boolean removeLivro(Livro livro){
        int aux = estante.indexOf(livro);
        estante.remove(aux);
        if(estante.contains(livro.getTitulo())) return false;
        return true;

    }
}
