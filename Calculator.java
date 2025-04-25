class MathOperations {
public int add(int a, int b) {
    return a+b;
    }
    public double add(double a, double b) {
    return a+b;
    }
    public  String add(String a, String b) {
    return a+b;
    }
}


    class Calculator extends MathOperations {
    @Override
        public int add(int a, int b) {
            System.out.println("Performing add operations: ");
            return super.add(a, b);
        }
@Override
        public double add(double a, double b) {
            System.out.println("Performing add operations return type double: ");
            return super.add(a, b);
        }
@Override
        public String add(String a, String b) {
            System.out.println("Performing add operations return type string: ");
            return super.add(a,b);
        }

        public static void  main(String[] args) {
            Calculator c = new Calculator();
            System.out.println(c.add(9, 8));
            System.out.println(c.add(9.88, 8.786));

        }
    }
