import Estrutura.Objeto;
import Estrutura.TabelaHash;

import java.util.Scanner;

public class App {

    static void preTeste(TabelaHash h){ //Função de teste

        Objeto a1 = new Objeto("Nicolas", 1);
        Objeto a2 = new Objeto("Caio", 3);
        Objeto a3 = new Objeto("Amanda", 67);
        Objeto a4 = new Objeto("Pedro", 43);
        Objeto a5 = new Objeto("Julia", 12);
        Objeto a6 = new Objeto("Paulo", 24);
        Objeto a7 = new Objeto("Marcos", 17);
        Objeto a8 = new Objeto("Gilberto", 99);
        Objeto a9 = new Objeto("Jonas", 5);
        Objeto a10 = new Objeto("Vinny", 7);
        Objeto a11 = new Objeto("Salvino", 64);
        Objeto a12 = new Objeto("Agatha", 57);
        Objeto a13 = new Objeto("Isabela", 14);
        Objeto a14 = new Objeto("Evelly", 93);
        Objeto a15 = new Objeto("Alana", 78);
        Objeto a16 = new Objeto("Maria", 50);
        Objeto a17 = new Objeto("João", 48);
        Objeto a18 = new Objeto("Akaline", 66);
        Objeto a19 = new Objeto("Edgar", 4);
        Objeto a20 = new Objeto("Fernando", 73);
        Objeto a21 = new Objeto("Euro", 95);
        Objeto a22 = new Objeto("Renan", 8);
        Objeto a23 = new Objeto("Herick", 81);
        Objeto a24 = new Objeto("Marcos", 55);
        Objeto a25 = new Objeto("Guilherme", 62);
        Objeto a26 = new Objeto("Leandra", 33);
        Objeto a27 = new Objeto("Cleyton", 36);
        Objeto a28 = new Objeto("George", 42);
        Objeto a29 = new Objeto("Matheus", 59);
        Objeto a30 = new Objeto("Clara", 47);

        h.insere(a1.getChave(), a1);
        h.insere(a2.getChave(), a2);
        h.insere(a3.getChave(), a3);
        h.insere(a4.getChave(), a4);
        h.insere(a5.getChave(), a5);
        h.insere(a6.getChave(), a6);
        h.insere(a7.getChave(), a7);
        h.insere(a8.getChave(), a8);
        h.insere(a9.getChave(), a9);
        h.insere(a10.getChave(), a10);
        h.insere(a11.getChave(), a11);
        h.insere(a12.getChave(), a12);
        h.insere(a13.getChave(), a13);
        h.insere(a14.getChave(), a14);
        h.insere(a15.getChave(), a15);
        h.insere(a16.getChave(), a16);
        h.insere(a17.getChave(), a17);
        h.insere(a18.getChave(), a18);
        h.insere(a19.getChave(), a19);
        h.insere(a20.getChave(), a20);
        h.insere(a21.getChave(), a21);
        h.insere(a22.getChave(), a22);
        h.insere(a23.getChave(), a23);
        h.insere(a24.getChave(), a24);
        h.insere(a25.getChave(), a25);
        h.insere(a26.getChave(), a26);
        h.insere(a27.getChave(), a27);
        h.insere(a28.getChave(), a28);
        h.insere(a29.getChave(), a29);
        h.insere(a30.getChave(), a30);

        h.print();

        Objeto teste = h.get(a1.getChave());
        System.out.println("\n" + teste.toString());
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        int tamanho = 0;

        while(c){
            try {

                System.out.print("Tamanho da tabela: ");
                tamanho = sc.nextInt();
                c = false;

            }
            catch (Exception e) {

                c = true;
                System.out.println("Digite um inteiro");
                sc.nextLine();

            }
        }

        TabelaHash h = new TabelaHash(tamanho);
        preTeste(h);
        sc.close();

    }
}