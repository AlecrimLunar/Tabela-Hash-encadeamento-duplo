package Estrutura;

public class Objeto {
    private String nome;
    private int chave;

    public Objeto() {}

    public Objeto(String nome, int chave) {
        this.nome = nome;
        this.chave = chave;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChave() {
        return this.chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
    
    public String toString(){
        return nome + "-" + chave + " ";
    }
    
}