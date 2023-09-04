public class Main {
    public static void main(String[] args)
    {
        int [] arr = {-1, 0, 3, 5, 7};
        boolean isArith = true;

        int v = arr [1] - arr [0];

        // while Arith -> check, find not Arith stop the loop (&& isArith)
        for (int i = 1; i < arr.length && isArith; i = i +1) // go through the elements and take the consecutive difference
        {
            int diff = arr [i] - arr [i - 1];
            if (diff != v)
                isArith = false;
        }
        System.out.println(isArith);
    }
}