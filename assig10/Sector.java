class Sector {
    void sec(int r, int ti) {

        double result = r * r * ti;
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Sector().sec(5, 45);
    }
}