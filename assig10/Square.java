class Square {
    void sqr(int a) {

        double result = a * a;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Square().sqr(8);
    }
}