package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {

        long gmail = emails.stream()
                .filter(email -> email.contains("@gmail.com"))
                .count();
        long yandex = emails.stream()
                .filter(email -> email.contains("@yandex.ru"))
                .count();
        long hotmail = emails.stream()
                .filter(email -> email.contains("@hotmail.com"))
                .count();
        return (int) (gmail + yandex + hotmail);
    }
}
// END
