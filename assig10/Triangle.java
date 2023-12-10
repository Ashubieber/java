class Triangle {
    void tri(int w, int h) {

        double result = w * h;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Triangle().tri(15, 2);
    }
}