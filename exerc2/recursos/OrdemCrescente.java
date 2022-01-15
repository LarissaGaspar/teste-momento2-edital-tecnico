package recursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdemCrescente {
    
    private int a = 14;
    private int b = 75;
    private int c = 36;
    ArrayList<Integer> inteiros2 = new ArrayList<>();
    
    public void executar(){

        inteiros2.add(a);
        inteiros2.add(b);
        inteiros2.add(c);

    Collections.sort(inteiros2, new Comparator<Integer>() {

        @Override
        public int compare(Integer n1, Integer n2) {

            if(n1<n2){
                return -1;
            }else if(n1>n2){
                return 1;
            }
            return 0;
        }
    });

    System.out.println(inteiros2);

    }
}
