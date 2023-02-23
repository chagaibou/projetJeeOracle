package com.projetOracleJee.restaurant.model;

import lombok.Data;

@Data
public class PasswordModel {

    private String email;
    private String oldPassword;
    private String newPassword;
}
