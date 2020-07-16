package POO3.loja;

import java.util.LinkedHashMap;
import java.util.Map;

public class TesteMapa {
    public static void main(String[] args) {
        Map<Integer, Integer> numberMap = new LinkedHashMap<>();
        numberMap.put(1, 100);
        numberMap.put(2, 200);
        numberMap.put(3, 300);

        numberMap.replace(1, numberMap.get(1) - 50);

        System.out.println(numberMap.get(1)); //150

        numberMap.replace(2, 200, 250);

        System.out.println(numberMap.get(2)); //250

        numberMap.replace(3, 301, 350);

        System.out.println(numberMap.get(3)); //300
    }
}
