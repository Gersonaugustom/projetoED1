package grafo;

import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LerLinhas {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);
	        NumeroCidades p = NumeroCidades.parse(s);
	        System.out.println(p);
	    }

	    public static Stream<Aresta> arestas(Scanner s) {
	        return linhas(s).map(Aresta::parse);
	    }

	    public static Stream<String> linhas(Scanner s) {
	        Supplier<Optional<String>> sup = () -> {
	            try {
	                return Optional.of(s.nextLine());
	            } catch (NoSuchElementException e) {
	                return Optional.empty();
	            }
	        };
	        return Stream.generate(sup).takeWhile(Optional::isPresent).map(Optional::get);
	    }
	    
	    
	}
