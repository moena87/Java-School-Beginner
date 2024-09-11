import java.util.Random;

class Practice08_01 {
    public static void main(String[] args) {
        Random num = new Random();
        int gender = num.nextInt(2);

        if (gender == 0) {
            System.out.println("あなたは男です");
        } else if (gender == 1) {
            System.out.println("あなたは女です");
        }
    }
}
