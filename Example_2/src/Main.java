public class Main {
    public static void main(String[] args)
    {
        int[] in = {5, 6, 2, -4, 116, 25, -88};
        int[] out = new int[in.length - 1]; // always one element less

        for (int n = 0; n <= in.length - 2; n = n + 1)
            out [n] = in [n + 1] - in [n];

        for (int o : out) //takes every value of out and puts it into "o"
            System.out.print(o + " ");
    }
}