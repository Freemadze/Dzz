import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\n числа для формул ниже будут 2 4 6 7");
            System.out.println("1: минимум двух чисел");
            System.out.println("2: макс двух чисел");
            System.out.println("3: минимум трех чисел");
            System.out.println("4: минимум четырех чисел ");
            System.out.println("5: дубль строки ");
            System.out.println("6: вывод текста на экран");
            System.out.println("7 exit");
            int a = 2, b = 4, e = 6, t = 7;
            int c = a, d = b, f = e, w = t;
            int m2;
            command = scanner.nextLine();
            switch (command) {
                case "1":
                    if (c < d)
                        m2 = c;
                    else
                        m2 = d;
                    System.out.println(m2);
                    min2();
                    break;


                case "2":
                    if (c > d)
                        m2 = c;
                    else
                        m2 = d;
                    System.out.println(m2);
                    max2();
                    break;
                case "3":
                    if (c < d && c < f) {
                        m2 = c;
                    } else if (d < c && d < f) {
                        m2 = d;
                    } else {
                        m2 = f;
                    }
                    System.out.println(m2);

                    min3();
                    break;
                case "4":


                    System.out.println(" лежит на git в папке test");
                    min4();
                    break;
                case "5":
                    for (int i = 0; i < 3; i++) {
                        System.out.println("новая строка!\n" +
                                "");
                    }
                    strok();
                    break;
                case "6":
                    for (int i = 0; i < 3; i++) {
                        System.out.print(" новая строка" + "");
                    }
                    strok2();
                    break;
                case"7":
                    break;

            }
        }
        while (!command.equals("7"));
    }

    private static void strok2() {
    }


    private static void strok() {

    }


    private static void min4() {
    }

    private static void min3() {
    }

    private static void max2() {
    }

    private static void min2() {

    }
}


