package problems.OnlineDatingApp.Models;
import problems.OnlineDatingApp.constants.Gender;
public class User {

    private int userId;
    private String userName;
    private int x;
    private int y;
    private Gender gender;
    private int age;
    private Long phoneNumber;

    public User(int userId, String userName, int x, int y, Gender gender, int age, Long phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.x = x;
        this.y = y;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
