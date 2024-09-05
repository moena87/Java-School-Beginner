import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Random man_ = new Random();
        Random woman_ = new Random();
        Random child_ = new Random();
        int man = man_.nextInt(3) + 1;
        int woman = woman_.nextInt(3) + 1;
        int child = child_.nextInt(3) + 1;

        if ((man + woman + child) % 3 == 0) {
            System.out.println("あいこです");
        } else if ((man + woman + child) % 3 == 1) {
            if (man == woman) {
                System.out.println("childが勝ちました");
            } else if (man == child) {
                System.out.println("womanが勝ちました");
            } else if (woman == child) {
                System.out.println("manが勝ちました");
            }
        } else if ((man + woman + child) % 3 == 2) {
            if (man == woman) {
                System.out.println("manとwomanが勝ちました");
            } else if (man == child) {
                System.out.println("manとchildが勝ちました");
            } else if (woman == child) {
                System.out.println("womanとchildが勝ちました");
            }
        }

        System.out.println("man: " + man);
        System.out.println("woman: " + woman);
        System.out.println("child: " + child);
    }
}
