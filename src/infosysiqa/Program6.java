package infosysiqa;

public class Program6 {



        public static int sum(int... numbers) {
            int total = 0;

            for (int num : numbers) {
                total += num;
            }

            return total;
        }

        public static void main(String... args) {
            System.out.println(sum(10, 20));          // 30
            System.out.println(sum(1, 2, 3, 4));      // 10
            System.out.println(sum());                // 0
        }
    }

