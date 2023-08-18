package br.puc.poo.a1408;

public class Livro {
    private String titulo;
    private int ano;
    private double preco;

    public Livro(String titulo, int ano, double preco) {
        this.titulo = titulo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}
