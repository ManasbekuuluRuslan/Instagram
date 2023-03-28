package service;

import enums.Photo;
import exception.MyException;
import model.User;

public interface UserService{
    String addNewUser(User user);
    User userUpdateById(Long id, String nickName, String password, Photo photo) throws MyException; //изменить name, password, и photo
    User searchByName(String nickName);
    List<User> sortByAge(String asc);//сортировка по возрасту (по возрастанию и убыванию)
    List<User> filter(String asc,int age); //фильтрация по age(например старше >20 лет или младше <20 лет)

}
