package Estrutura;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TabelaHash {
    private int tamanho;
    private List<List<LinkedList<Objeto>>> T =  new ArrayList<>();

    public TabelaHash(int tamanho) {
        this.tamanho = encontraPrimo((int)(tamanho/10));
        for(int i=0; i<10; i++){
            T.add(new ArrayList<>());
            for(int j=0; j<this.tamanho; j++){
                T.get(i).add(new LinkedList<Objeto>());
            }
        }
    }
    
    private boolean verificaPrimo(int x){
        if(x==1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i == 0)
                return false;
        }
        return true;

    }

    private int encontraPrimo(int tamanho){
        int primo = (int) (tamanho*1.25);
        if(verificaPrimo(primo)){
            return primo;
        }
        primo++;
        while(true){
            if(verificaPrimo(primo))
                return primo;
            primo++;
        }

    }

    private int firstHash(int key){
        return key % 10;
    }
    private int secondHash(int key) {
        return key % this.tamanho;
    }

    public void insere(int key, Objeto objeto) {
        int posF = firstHash(key);
        int posS = secondHash(key);
        T.get(posF).get(posS).add(objeto);
    }

    public Objeto get(int key) {
        int posF = firstHash(key);
        int posS = secondHash(key);
        LinkedList<Objeto> L = this.T.get(posF).get(posS);
        for (Objeto value : L) {
            if (value.getChave() == key) {
                return value;
            }
        }
        return null;
    }

    public void print() {
        System.out.println("{");
        for (int i = 0; i < 10; i++) {
            System.out.println("---------");
            List<LinkedList<Objeto>> l1 = this.T.get(i);
            for(LinkedList<Objeto> l2 : l1){
                String str = "/";
                for (Objeto Objeto : l2) {
                    str += " " + Objeto.toString() + "/";
                }
            System.out.println("[" + str + "]");
            }
        }
        System.out.println("}");
    }

}
