class Sector {
    double sec()

    {
        int r = 3;
        int ti = 45;

        double result = 0.5 * r * r * ti;
        return (result);
    }

    public static void main(String[] args) {
        Sector c1 = new Sector();
        double x = c1.sec();
        System.out.println(x);

    }
}
