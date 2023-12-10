class Triangle {
    double tri() {
        int w = 3;
        int h = 16;

        double result = w * h;
        return result;
    }

    public static void main(String[] args) {
        double x = new Triangle().tri();
        System.out.println(x);

    }
}