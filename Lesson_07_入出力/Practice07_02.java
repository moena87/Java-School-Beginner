import java.util.Scanner;

class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Shift-JIS");

        System.out.println("名前を入力");
        String inputString = sc.nextLine();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は「" + inputString + "」です");
        }
    }
