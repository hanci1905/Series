public class Average {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i != 0)
                sum += 1 / i;

        }
        System.out.println("harmonic average is " + numbers.length / sum);


    }
}
