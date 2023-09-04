public class Main {
    public static void main(String[] args)
    {
        int[] elem = {2, 5, -3, 11, 193, -2};
        int sum = 0;

        for (int n = 0; n < elem.length - 1; n = n + 1)
            sum = elem [n] + elem [n + 1];

        for (int n : elem)
            System.out.print(n + " ");

        System.out.println();
        System.out.println("sum: " + sum);
    }
}