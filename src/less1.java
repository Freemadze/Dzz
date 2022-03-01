import java.util.Scanner;

public class less1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command;
            do {
                System.out.println("1: переменные типа Sring");
                System.out.println("2: вывод х10");
                System.out.println("3: Happy new Year");
                System.out.println("4: изменение переменных ");
                System.out.println("5: Рашид )");
                System.out.println("6: Переставьте строки так, чтобы получился текст Nothing personal, it's just business.");
                System.out.println("7: Напиши программу, которая выводит на экран надпись Слава Роботам Убить всех человеков 16 раз.");
                System.out.println("8: выход");

                command = scanner.nextLine();
                switch (command) {
                    case "1":
                        String s = "нет ";
                        String b = "войне ";
                        String c = "на ";
                        String d = "земле\n" +
                                "";
                        System.out.print(s + b + c + d);

                        openDz1();
                        break;
                    case "2":
                        for (int i = 0; i < 10; i++) {
                            System.out.println("Don't war!\n" +
                                    "");
                        }
                        openDz2();

                        break;
                    case "3":
                        System.out.println("Happy new Year\n" +
                                "");

                        openDz3();
                        break;
                    case "4":
                        int ss = 5;
                        int tt = 6;
                        int xx = 7;
                        System.out.println( ss + tt + xx);
                        openDz4();
                        break;
                    case "5":
                        System.out.println("Я согласен на зарплату $800/месяц в первый год.\n" +
                                "Я согласен на зарплату $1500/месяц во второй год.\n" +
                                "Я согласен на зарплату $2200/месяц в третий год.\n" +
                                "Я согласен на зарплату $2700/месяц в четвертый год.\n" +
                                "Я согласен на зарплату $3200/месяц в пятый год.\n");
                        openDz5();
                        break;
                    case "6":
                        System.out.println("Nothing personal, it's just business");
                        openDz6();
                        break;
                    case "7":
                        for (int i = 0; i < 16; i++) {
                            System.out.println("Слава Роботам! Убить всех человеков!");

                        }
                        openDz7();
                        break;
                    case "8":

                        break;
                    default:
                        System.out.println("Упс, ты что то не то ввел");

                }
            }
            while(!command.equals("8"));
        }

        private static void openDz1() {
        }

        private static void openDz2() {
        }

        private static void openDz3() {
        }

        private static void openDz4() {
        }

        private static void openDz5() {
        }

        private static void openDz6() {
        }

        private static void openDz7() {
        }

    }


