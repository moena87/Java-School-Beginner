import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("何段");
        int inputNum = sc.nextInt();
        String s = "";

        if (5 < inputNum || inputNum == 0) {
            System.out.println("1～5までの整数を入力してください");
        } else {
            for (int i = 1; i <= inputNum; i++) {
                s += "*";
                System.out.println(String.format("%1$5s", s));
            }
        }
    }
}
