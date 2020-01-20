package fun.liutong.blog.service;

import fun.liutong.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
