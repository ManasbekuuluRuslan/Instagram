package dao;

import model.User;
import service.List;
import service.UserService;

public class InstagramDao implements UserService {

    @Override
    public String addNewUser(User user) {
        return null;
    }

    @Override
    public User userUpdateById(Long id, String nickName, String password, String photo) {
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
