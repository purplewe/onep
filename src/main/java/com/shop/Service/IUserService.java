package com.shop.Service;

import com.shop.common.ServerResponse;
import com.shop.pojo.User;

public interface IUserService {
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str, String type);
    ServerResponse checkAdminRole(User user);
    ServerResponse selectQuestion(String username);
    ServerResponse<String> checkAnswer(String username, String question, String answer);
    ServerResponse<String> forgetRestPassword(String username, String passwordNew, String forgetToken);
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew,User user);
    ServerResponse<User> updateInfo(User user);
    ServerResponse<User> getInfo(Integer userId);
}

