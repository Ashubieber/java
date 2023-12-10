class Ellipse {
    void elli(int a, int b) {
        final double pi = 3.142;
        double result = pi * a * b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Ellipse().elli(3, 8);
    }
}