class Ellipse1 {
    double elli() {
        int a = 3;
        int b = 5;
        final double pi = 3.142;
        double result = pi * a * b;
        return result;
    }

    public static void main(String[] args) {
        double x = new Ellipse1().elli();
        System.out.println(x);

    }
}