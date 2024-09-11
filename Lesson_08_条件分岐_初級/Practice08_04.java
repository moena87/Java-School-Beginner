import java.util.Random;

public class Practice08_04 {
    public static void main(String[] args) {
        Random num = new Random();
        int color = num.nextInt(5) + 1;

        switch (color) {
            case 1:
                System.out.println("今日のラッキーカラーはピンクです");
                break;
            case 2, 3, 4:
                System.out.println("今日のラッキーカラーはレッドです");
                break;

            case 5:
                System.out.println("今日のラッキーカラーはゴールドです");
                break;
        }
        // System.out.println(color);
    }
}
