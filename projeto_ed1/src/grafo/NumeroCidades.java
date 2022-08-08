package grafo;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumeroCidades {

	    private int numeroCidades = 0;

	    private List<Aresta> arestas;

	    public void NumeroCidades(int numeroCidades, List<Aresta> arestas) {
	        this.numeroCidades = numeroCidades;
	        this.arestas = arestas;
	    }

	    public static NumeroCidades parse(Scanner s) {
	        String primeiraLinha = s.nextLine();
	        String[] partes = primeiraLinha.split(" ");
	        int c = Integer.parseInt(partes[0].trim());
	        List<Aresta> arestas = LerLinhas.arestas(s).collect(Collectors.toList());
	        return new NumeroCidades();
	    }

	    public int getNumeroCidades() {
	        return numeroCidades;
	    }

	    public List<Aresta> getArestas() {
	        return arestas;
	    }

	    @Override
	    public String toString() {
	        return "{c=" + numeroCidades + ", p=" + arestas.size() + ", arestas=" + arestas + "}";
	    }
	}
