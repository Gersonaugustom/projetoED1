package grafo;

	public final class Aresta {
	    private final int origem;
	    private final int destino;

	    public Aresta(int origem, int destino) {
	        this.origem = origem;
	        this.destino = destino;
	    }

	    public static Aresta parse(String s) {
	        String[] array = s.split(" ");
	        return new Aresta(
	            Integer.parseInt(array[0].trim()),
	            Integer.parseInt(array[1].trim()));
	    }

	    public int getOrigem() {
	        return origem;
	    }

	    public int getDestino() {
	        return destino;
	    }

	    @Override
	    public String toString() {
	        return origem + "->" + destino;
	    }
	    
	}
	
	
