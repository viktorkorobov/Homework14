import java.util.Optional;

public class User implements Comparable<User> {
    private String Name;
    private String Surname;
    private int Age;
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public User(String name, String surname, int age, String email) {
        Name = name;
        Surname = surname;
        Age = age;
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Age=" + Age +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return Age - o.getAge();
    }

}
