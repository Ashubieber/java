class Rectangle {
    void rec(int w, int h) {

        double result = w * h;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Rectangle().rec(5, 12);
    }
}