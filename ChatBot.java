import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class ChatBot {

    private HashMap<String, String> responses;

    public ChatBot() {

        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi! Nice to meet you.");
        responses.put("java", "Java is an object-oriented programming language.");
        responses.put("oop", "OOP stands for Object-Oriented Programming.");
        responses.put("arraylist", "ArrayList is a dynamic array in Java.");
        responses.put("codealpha", "CodeAlpha provides internship opportunities and projects.");
        responses.put("name", "I am CodeAlpha ChatBot.");
        responses.put("bye", "Goodbye! Have a great day.");
    }

    public String getResponse(String message) {

        message = message.toLowerCase();

        if (message.contains("time")) {
            return "Current Time: " + LocalTime.now().withNano(0);
        }

        if (message.contains("date")) {
            return "Today's Date: " + LocalDate.now();
        }

        for (String key : responses.keySet()) {
            if (message.contains(key)) {
                return responses.get(key);
            }
        }

        return "Sorry, I don't understand that. Try asking about Java, OOP, ArrayList, Date, or Time.";
    }
}