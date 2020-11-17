package test.javaAndGroovy;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Date dob;
    private List<User> friends;
    private List<User> family;
    private List<User> coWorkers;

    public User() {
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public User(String firstName, String lastName, String email, int age,
                Date dob, List<User> friends, List<User> family, List<User> coWorkers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.dob = dob;
        this.friends = friends;
        this.family = family;
        this.coWorkers = coWorkers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<User> getFamily() {
        return family;
    }

    public void setFamily(List<User> family) {
        this.family = family;
    }

    public List<User> getCoWorkers() {
        return coWorkers;
    }

    public void setCoWorkers(List<User> coWorkers) {
        this.coWorkers = coWorkers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(dob, user.dob) &&
                Objects.equals(friends, user.friends) &&
                Objects.equals(family, user.family) &&
                Objects.equals(coWorkers, user.coWorkers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, dob, friends, family, coWorkers);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", friends=" + friends +
                ", family=" + family +
                ", coWorkers=" + coWorkers +
                '}';
    }
}
