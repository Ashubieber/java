class Sector {
    void sec(int r, int ti)

    {

        double result = 0.5 * r * ti;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Sector c1 = new Sector();
        c1.sec(5, 45);
      
    }
}
