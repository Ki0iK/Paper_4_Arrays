public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 5, 0, 11, 1};
        int count = 0;
        int sum = 0;

        for (int n = 0; n < 5; n = n +1)
            if (n == 0)
            {
                sum = sum + n;
                count = count + 1;
            }

        if (count == 0)
            System.out.println(0);
        else
            System.out.println(sum / count);
        // wrong !!
    }
}