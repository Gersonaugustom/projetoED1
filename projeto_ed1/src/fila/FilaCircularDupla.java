package fila;

import java.util.Scanner;

public class FilaCircularDupla extends Fila{



    public FilaCircularDupla(int tam) {
        super(tam);
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

    public void imprime() {
        int i, j;

        if(vazia())
            System.out.println("Fila está vazia");
        else
            for (i = ini, j = 1; j <= n; j = j + 1, i = (i + 1) % tamanho)
                System.out.println(vetor[i]);
    }

}

