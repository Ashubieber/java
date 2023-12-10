class Sector1 {
    double sec() {
        int r = 3;
        int ti = 45;

        double result = 0.5 * r * r * ti;
        return result;
    }

    public static void main(String[] args) {
        double x = new Sector1().sec();
        System.out.println(x);

    }
}