import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("整数を入力");
        int inputNum = sc.nextInt();

        int num = inputNum % 3;

        System.out.println(inputNum + " を3で割った余りは" + num + "です");
    }
}
