package fila;

public class FilaCircular {

    /* Atributos protected para serem usados na subclasse. */
    protected int tamanho;	/* Tamanho do vetor */
    protected int[] vetor;	/* Vetor de elementos */
    protected int ini;	/* Posicao do proximo elemento a ser retirado */
    protected int n;		/* Numero de elementos na fila */

    public FilaCircular(int tam)	{
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

    public boolean insereInicio(int elemento)
    {
        int prec;

        if (!cheia())
        {
            /* Insere na posição precedente ao início */
            prec = (ini -1 + tamanho) % tamanho;
            vetor[prec] = elemento;
            ini = prec; /* Atualiza índice para início */
            n++;
            return true;
        }
        else
            return false;
    }

    public int removeFim()
    {
        int elemento = Integer.MIN_VALUE;
        int ult;

        if (!this.vazia())
        {
            /* Retira o último elemento */
            ult = (ini + n - 1) % tamanho;
            elemento = vetor[ult];
            n--;
        }

        return elemento;
    }

    public boolean insereFim(int elemento) {
        int fim;

        if (!cheia())
        {
            fim = (ini + n) % tamanho;
            vetor[fim] = elemento;
            n++;
            return true;
        }
        else
            return false;
    }


    public void imprime()
    {
        int i, j;

        if(vazia())
            System.out.println("Fila está vazia");
        else
            for (i = ini, j = 1; j <= n; j = j + 1, i = (i + 1) % tamanho)
                System.out.println(j + " " + vetor[i]);
    }

}
