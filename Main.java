import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("=================================");
        System.out.println("      Welcome to AI ChatBot");
        System.out.println("=================================");
        System.out.println("Type 'bye' to exit.");

        while (true) {

            System.out.print("\nYou: ");
            String userMessage = sc.nextLine();

            String response = bot.getResponse(userMessage);

            System.out.println("Bot: " + response);

            if (userMessage.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
        System.out.println("ChatBot Closed.");
    }
}