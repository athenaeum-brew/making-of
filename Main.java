import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> italianPopFemaleVocalists = Stream.of("Pausini", "Giorgia", "Elisa", "Annalisa")
                .collect(Collectors.toList());

        italianPopFemaleVocalists.forEach(name -> System.out.print(name + " "));
        System.out.println();
        italianPopFemaleVocalists.parallelStream().forEach(name -> System.out.print(name + " "));
        System.out.println();

    }
}
