import java.util.Random;

class Practice09_03 {
    public static void main(String[] args) {
        Random number = new Random();

        for (int i = 0; i < 10; i++) {
            int num = number.nextInt(6) + 1;
            if (num % 2 == 0) {
                continue;
            } else {
                System.out.println((i + 1) + "回目、" + num + "が出ました");
            }
        }
    }
}
