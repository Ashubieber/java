class Circle1 {
    double area() {
        int r = 3;
        final double pi = 3.142;
        double result = pi * r * r;
        return result;
    }

    public static void main(String[] args) {
        double x = new Circle1().area();
        System.out.println(x);

    }
}