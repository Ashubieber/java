class Triangle {
    double tri()

    {
        int w = 3;
        int h = 5;

        double result = w * h;
        return (result);
    }

    public static void main(String[] args) {
        Triangle c1 = new Triangle();
        double x = c1.tri();
        System.out.println(x);

    }
}
