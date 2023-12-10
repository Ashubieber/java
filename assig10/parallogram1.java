class Parallogram1 {
    double para() {
        int b = 3;
        int h = 6;

        double result = b * h;
        return result;
    }

    public static void main(String[] args) {
        double x = new Parallogram1().para();
        System.out.println(x);

    }
}