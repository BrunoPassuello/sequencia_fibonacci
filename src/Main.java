public class Main {
    public static void main(String[] args){
        try {
            System.out.println(fibonaccirecursiva(6));
            System.out.println(fibonaccilinear(6));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int fibonaccirecursiva(int n) throws Exception {
            if (n < 0) {
                throw new Exception("A entrada deve ser maior ou igual a 0");
            }
            if (n == 0 || n == 1) {
                return n;
            }

            return fibonaccirecursiva(n - 1) + fibonaccirecursiva(n - 2);

    }

    public static int fibonaccilinear(int n) throws Exception{
        if (n < 0) {
            throw new Exception("A entrada deve ser maior ou igual a 0");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

}