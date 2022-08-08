package fila;

public class Fila
{
    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;	/* Tamanho do vetor */
    protected int[] vetor;	/* Vetor de elementos */
    protected int ini;	/* Posicao do proximo elemento a ser retirado */
    protected int n;		/* Numero de elementos na fila */

    public Fila(int tam)
    {
        tamanho = tam;
        vetor = new int[tamanho];
        ini = 0;
        n = 0;
    }

    public boolean vazia()
    {
        return (n == 0);
    }

    public boolean cheia()
    {
        return (n == tamanho);
    }

    //Retiramos o elemento do início da fila
    public int remove()
    {
        int elemento = Integer.MIN_VALUE;

        if (!this.vazia())
        {
            elemento = vetor[ini];
            ini = (ini + 1) % tamanho;
            n--;
        }

        return elemento;
    }

    //Inserimos o elemento no final da fila
    public boolean insere(int elemento)
    {
        int fim;

        if ( !cheia() ) {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        }
        else
            return false;
    }

    public static FilaCircularDupla implementarCircular(FilaCircular fila){
        FilaCircularDupla filaCircularDupla = new FilaCircularDupla(fila.tamanho);

        for (int i = fila.ini, j = 1; j <= fila.n; j = j + 1, i = (i + 1) % fila.tamanho){
            filaCircularDupla.insere(fila.vetor[i]);
        }
        return filaCircularDupla;
    }
}
