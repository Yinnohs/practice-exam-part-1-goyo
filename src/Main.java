import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();
        boolean stopLooping =  false;
        Float total =0f;

        while(!stopLooping){
            showMenu();
            String userInput = scanner.nextLine().toUpperCase();


            if (userInput.equals("Q")){
                stopLooping = true;
            }else {
                Float number = Float.parseFloat(userInput);
                queue.enQueue(number);
            }
        }

        while (queue.getTop() != 0){
            Float numberToSum = queue.deQueue();
            total =  total + numberToSum;
        }

        System.out.println("the total amount is: " + total);


    }
    public static void showMenu(){
        System.out.println("--------------");
        System.out.println("press Q to go out");
        System.out.println("Or add a number (float number)");
        System.out.println("--------------");

    }
}


