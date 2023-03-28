import database.UserServiceImpl;
import enums.Gender;
import enums.Photo;
import model.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ruslan","rusirusi",20, Photo.VILLAGE_PHOTO, Gender.MALE);
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.addNewUser(user));

    }
}