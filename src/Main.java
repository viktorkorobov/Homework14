import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<User> user = List.of(new User("Skyla ","Sal", 25, "qe.qw"),
                new User("Skyla ","Cisneros", 21, "2qewer3.qw"),
                new User("Alexandra","Alexander", 31, "2qewe.qw"),
                new User("Kamal","Rasmussen", 41, "2qe.qw"),
                new User("Freyja","Cummings", 26, "2q123123e.qw"),
                new User("Teresa","Carter", 22, "2asdadqe.qw"),
                new User("Brooklyn","Cohen", 19, "22qe.qw"));

        user.stream()
                .sorted()
                .map(User::getSurname)
                .forEach(System.out::println);

        System.out.println("------------------------");

        List<User> user2 = user;
        user2.stream()
                .filter(surname -> surname.getSurname().length()>8)
                .map(User::getName)
                .limit(1).collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("------------------------");

        List<User> user3 = user;
        user3.stream()
                .skip(3)
                .filter(email -> email.getEmail().length()>8)
                .map(User::getAge)
                .forEach(System.out::println);
    }
}