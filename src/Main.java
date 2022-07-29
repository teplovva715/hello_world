import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Вибрати пункт");
            System.out.println("1.Додавання");
            System.out.println("2.Віднімання");
            System.out.println("3.Множення");
            System.out.println("4.Ділення");
            System.out.println("5.Вийти");
            int person = scanner.nextInt();
            int result;
            if (person == 5){
                break;
            } else if (person == 1){
                System.out.println("Ввести перше число");
                int a =scanner.nextInt();
                System.out.println(a + " перше число");
                System.out.println("Ввести дреге число");
                int b = scanner.nextInt();
                int c = a + b;
                System.out.println("Відповідь: " + c);
            } else if (person == 2){
                System.out.println("Ввести перше число");
                int a =scanner.nextInt();
                System.out.println(a + " перше число");
                System.out.println("Ввести дреге число");
                int b = scanner.nextInt();
                int c = a - b;
                System.out.println("Відповідь: " + c);
            } else if (person == 3){
                System.out.println("Ввести перше число");
                int a =scanner.nextInt();
                System.out.println(a + " перше число");
                System.out.println("Ввести дреге число");
                int b = scanner.nextInt();
                int c = a * b;
                System.out.println("Відповідь: " + c);
            } else if (person == 4){
                System.out.println("Ввести перше число");
                float a =scanner.nextInt();
                System.out.println(a + " перше число");
                System.out.println("Ввести дреге число");
                float b = scanner.nextInt();
                float c = a / b;
                System.out.println("Відповідь: " + c);
            } else  {
                System.out.println("EROR");
            }
        }
        System.out.println("Програма завешена");
    }
}