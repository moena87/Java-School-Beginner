import java.util.Random;

class Practice08_03 {
    public static void main(String[] args) {
        Random num1 = new Random();
        int age = num1.nextInt(21);

        Random num2 = new Random();
        int gender = num2.nextInt(2);

        String gen = "";

        if (gender == 0) {
            gen = "男";
        } else if (gender == 1) {
            gen = "女";
        }

        if (age <= 3) {
            System.out.println("あなたはbabyな" + gen + "です");
        } else if (3 < age && age < 6){
            System.out.println("あなたはchildな" + gen + "です");
        } else if (6 <= age && age < 18) {
            System.out.println("あなたはkidな" + gen + "です");
        } else {
            System.out.println("あなたはadultな" + gen + "です");
        }

        System.out.println("gender: " + gender);
        System.out.println("age: " + age);
    }
}
