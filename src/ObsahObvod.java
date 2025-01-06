public class ObsahObvod {

    public static void main(String[] args) {

        double a=11.8;
        double b=24.9;
        double r=4.1;

        obsah(a,b);
        obvod(a,b);
        obsah(r);
        obvod(r);

    }

    public static void obsah(double a, double b) {
        double vysledokpo = a * b;
        System.out.print("Plocha obdlznika: ");
        System.out.println(vysledokpo);
    }

    public static void obvod(double a, double b) {
        double vysledokoo = 2*(a+b);
        System.out.print("Obvod obdlznika: ");
        System.out.println(vysledokoo);
    }

    public static void obsah(double r) {
        double vysledokpk = r * r * Math.PI;
        System.out.print("Plocha kruhu: ");
        System.out.println(vysledokpk);
    }

    public static void obvod(double r) {
        double vysledokok = 2*r*Math.PI;
        System.out.print("Obvod kruhu: ");
        System.out.println(vysledokok);
    }

}
