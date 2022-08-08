package conjunto;

public class Teste {

    public static void main(String args[])
    {
        Conjunto modalidade1, modalidade2, resultado;

        modalidade1 = new Conjunto();
        modalidade2 = new Conjunto();

        modalidade1.insere(1);
        modalidade1.insere(2);
        modalidade1.insere(3);
        modalidade1.insere(7);
        modalidade1.insere(8);

        System.out.println("Imprimindo modalidade 1");
        modalidade1.imprime();

        modalidade2.insere(7);
        modalidade2.insere(8);
        modalidade2.insere(9);
        modalidade2.insere(10);
        modalidade2.insere(11);
        modalidade2.insere(12);

        System.out.println("Imprimindo modalidade 2");
        modalidade2.imprime();

        modalidade2.remove(10);
        modalidade2.remove(12);

        System.out.println("Imprimindo modalidade 2 apos remocao dos corredores 10 e 12");
        modalidade2.imprime();

        System.out.println("Imprimindo o total de corredores");
        resultado = modalidade1.uniao(modalidade2);
        resultado.imprime();

        System.out.println("Imprimindo apenas os corredores que correm as duas modalidades");
        resultado = modalidade1.intersecao(modalidade2);
        resultado.imprime();
    }
}
