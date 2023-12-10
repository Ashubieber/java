class Trapezoid {
    void tra(int a, int h, int b)

    {

        double result = 0.5 * (a + b) * h;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Trapezoid c1 = new Trapezoid();
        c1.tra(3, 5, 6);
        

    }
}