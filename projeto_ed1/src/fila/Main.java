package fila;

import java.util.Scanner;

import fila.FilaCircular;

public class Main {

    public static void main(String[] args) {
        //idoso passa a frente, mas nao na frente de outro idoso
        FilaCircular fila = new FilaCircular(5);
        FilaDupla filaDuplaIdoso = new FilaDupla(5);
        Scanner scanner = new Scanner(System.in);
        int escolha=1, item;

        do {

            System.out.println("--------------------------");
            System.out.println("Selecione a opcao:");
            System.out.println("1. Inserir adulto na fila.");
            System.out.println("2. Remove quem está no início da fila.");
            System.out.println("3. Inserir idoso na fila (tem prioridade sobre os adultos).");
            System.out.println("4. Imprime fila a partir do início.");
            System.out.println("0. Fim.");
            System.out.println("Opcao: ");
            escolha = scanner.nextInt();

            if(escolha == 0) {
                //Não faz nada
                break;
            }
            if(escolha == 1){
                System.out.println("Entre com o item para adicionar no fim da fila: ");
                item = scanner.nextInt();
                if ( ! fila.insereFim(item) )
                    System.out.println("Fila cheia.");

            }
            if(escolha == 2){
                System.out.println("Entre com o item para remover no inicio da fila: ");
                item = fila.remove();
                if (item != Integer.MIN_VALUE)
                    System.out.println("Item " + item + " removido.");
                else
                    System.out.println("Fila vazia.");
            }
            if(escolha == 3){
                System.out.println("Entre com o item para adicionar no início da fila: ");
                item = scanner.nextInt();
                //criar outra lista e ir adicionando ao final dela, depois, juntar com as outras ja existentes
                if ( ! filaDuplaIdoso.insere(item) ) //adc ao ultimo, no final, todos dessa lista passa pra frente da fila principal (com os adultos)
                    System.out.println("Fila cheia.");
            }
            if(escolha == 4){
                System.out.println("Conteúdo da fila:");
                while(!filaDuplaIdoso.vazia()){
                    fila.insereInicio(filaDuplaIdoso.removeFim());
                }
                fila.imprime();
            }

        }while(escolha != 0);
        scanner.close();
    }

}

