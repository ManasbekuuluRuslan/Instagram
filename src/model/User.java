package model;

import enums.Gender;
import enums.Photo;

public class User {
    private Long id;
    private String nickName;
    private String password;
    private int age;
    private Photo photo;
    private Gender gender;

    public User(Long id,String nickName, String password, int age, Photo photo, Gender gender) {
        this.id= id;
        this.nickName = nickName;
        this.password = password;
        this.age = age;
        this.photo = photo;
        this.gender = gender;
    }
public User(){

}

    public String getNickName() {
        return nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", photo=" + photo +
                ", gender=" + gender +
                "id ="+id+
                '}';
    }
}
