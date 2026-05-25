package StandardProgramIQ;

//Program to write Swapping numbers without using a third variable
public class SwapValues {

    public  static void swapWithoutThirdVariable(int a, int b)
    {
        System.out.println("Before Swapping Value of a : "+a +", b :"+b);

        a = a+b; //40 (10+30)
        b = a-b; // 10 (40-30)
        a = a-b; // 30 (40-10)

        System.out.println("After Swapping Without third variable Value of a : "+a +", b :"+b);
    }

    public static void swapWithTempVariable(int a,int b)
    {
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping using Temp variable Value of a : "+a +", b :"+b);
    }

    public static void main(String[] args) {
        int a = 10;int b = 30;

      swapWithoutThirdVariable(a,b);
      swapWithTempVariable(a,b);

    }
}

