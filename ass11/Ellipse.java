class Ellipse {
    double elli()

    {
        int a = 3;
        final double pi = 3.142;
        int b = 3;

        double result = pi * a * b;
        return (result);
    }

    public static void main(String[] args) {
        Ellipse c1 = new Ellipse();
        double x = c1.elli();
        System.out.println(x);

    }
}