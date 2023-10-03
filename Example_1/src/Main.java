public class Main {
    public static void main(String[] args)
    {
        double[] vals = {3.1, 2, 7.9, 11, -44}; // specify directly

        double smallest = vals [0]; //declare a variable
        for (double v : vals) // for each of the vals' - i'm doing the following
        {
            if (v < smallest)
                smallest = v; // smallest becomes v
        }
        System.out.println(smallest);
    }
}