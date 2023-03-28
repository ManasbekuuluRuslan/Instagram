package database;

import enums.Gender;
import enums.Photo;
import exception.MyException;
import model.User;
import service.List;
import service.UserService;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    ArrayList<User> users = new ArrayList<>();
    @Override
    public String addNewUser(User user){
        try{

            User user1 = new User(12233L,"Ruslan","rusirusi",20, Photo.VILLAGE_PHOTO, Gender.MALE);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nickName: ");
        String name  = scanner.nextLine();
        user1.setNickName(name);
        System.out.print("Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        for(User u : users) {
            if (u.getNickName().equals(name) && u.getPassword().equals(password)) {
                if (password.length() <= 7) {
                    throw new MyException("Пароль 7 симболдон коп же барабар болуусу керек");
                } else {
                    user1.setPassword(password);
                }
                users.add(u);
                return u + ", Успешно добавлен!";
            } else {
                throw new MyException("Пароль 7 симболдон коп же барабар болуусу керек");
            }
        }

        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, Photo photo) {
        
        System.out.println("Enter your id: ");
        Long idd = new Scanner(System.in).nextLong();
        for (User p : users) {
            if (p.getId().equals(idd)) {
                users.add(p);
            }
            p.setId(id);
            p.setNickName(nickName);
            p.setPassword(password);
            p.setPhoto(photo);
            return p;
        }
    return null;
    }

    @Override
    public User searchByName(String nickName) {

        return null;
    }

    @Override
    public List<User> sortByAge(String asc) {
        return null;
    }

    @Override
    public List<User> filter(String asc, int age) {
        return null;
    }
}
