import java.util.Random;

class Practice08_02 {
    public static void main(String[] args) {
        Random num = new Random();
        int age = num.nextInt(21);

        if (age <= 3) {
            System.out.println("あなたはbabyです");
        } else if (3 < age && age < 18) {
            System.out.println("あなたはkidです");
        } else {
            System.out.println("あなたはadultです");
        }

        // System.out.println(age);
    }
}
