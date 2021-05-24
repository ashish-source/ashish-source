package com.befit.authorization.authorization.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by prachi on 5/25/2021.
 */

@Getter
@Setter
public class User {
    @NotNull
    @NotEmpty
    private String userName;
    private String password;
    private String email;
    private short age;
    private String mobileNumber;
}
