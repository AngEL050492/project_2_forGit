import java.util.*;

public class SerchMin {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(i, generator.nextInt(15) + 5);
            System.out.print(numbers.get(i) + "\t");
        }
        System.out.println("\n" + serchMinNumber(numbers));
    }

    private static int serchMinNumber(List<Integer> numbers) {
        int min = Collections.min(numbers);
        return min;
    }
}

