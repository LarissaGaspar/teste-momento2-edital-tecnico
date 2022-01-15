package recursos;

import java.util.ArrayList;
import java.util.Collections;

public class MaiorMenor {
    
    private int a = 1;
    private int b = 7;
    private int c = 3;
    private int d = 4;
    ArrayList<Integer> inteiros = new ArrayList<>();
    
    public void verificacao(){

        inteiros.add(a);
        inteiros.add(b);
        inteiros.add(c);
        inteiros.add(d);

        int posicaoDoMenor = inteiros.indexOf(Collections.min(inteiros));
        System.out.println("O menor numero é: ["+inteiros.get(posicaoDoMenor)+"]");

        int posicaoDoMaior = inteiros.indexOf(Collections.max(inteiros));
        System.out.println("O maior numero é: ["+inteiros.get(posicaoDoMaior)+"]");
    }
}
