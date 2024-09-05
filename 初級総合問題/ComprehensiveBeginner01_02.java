import java.util.Random;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        int sum = 0;
        int array[] = new int[10];

        for (int i = 0; i < 10; i++) {
            Random number = new Random();
            int num = number.nextInt(100) + 1;
            array[i] = num;
            sum = sum + num;
            if (100 <= sum) {
                System.out.println("合計値: " + sum);
                for (int j = 0; j < array.length; j++){
                    if (array[j] != 0) {
                        System.out.println((j + 1) + "回目: " + array[j]);
                    }
                }
                break;
            }
        }
    }
}
