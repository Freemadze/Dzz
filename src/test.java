public class test {
    public static int min(int a, int b, int c, int d) {
        int m1, m2, m3;
        m1 = min(a, b);
        m2 = min(m1, c);
        m3 = min(m2, d);
        return m3;


    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;

    }
}
