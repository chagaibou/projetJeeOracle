package com.projetOracleJee.restaurant.service;

import com.projetOracleJee.restaurant.entity.User;
import com.projetOracleJee.restaurant.entity.VerificationToken;
import com.projetOracleJee.restaurant.model.UserModel;

import java.util.Optional;

public interface UserService {

    public User registerUser(UserModel userModel);


    void saveVerificationTokenForUser(String token, User user);

    String validateVerificationToken(String token);


    VerificationToken generateNewVerificationToken(String oldToken);


    User findUserByEmail(String email);


    void createPasswordResetTokenForUser(User user, String token);

    String validatePasswordResetToken(String token);

    Optional<User> getUserByPasswordResetToken(String token);

    void changePassword(User user, String newPassword);

    boolean checkIfValidOldPassword(User user, String oldPassword);


    User getUserById(Long userId);
}
