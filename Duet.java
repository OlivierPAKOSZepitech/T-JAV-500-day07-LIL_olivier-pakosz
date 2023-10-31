public class Duet {
    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }

    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer intMin = Duet.min(5, 10);
        Integer intMax = Duet.max(5, 10);
        System.out.println("Minimum : " + intMin);
        System.out.println("Maximum : " + intMax);

        String strMin = Duet.min("clalalalaaaaa", "banane");
        String strMax = Duet.max("pomme", "banane");
        System.out.println("Minimum : " + strMin);
        System.out.println("Maximum : " + strMax);
    }
}
