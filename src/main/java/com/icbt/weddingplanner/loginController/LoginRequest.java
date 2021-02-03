package com.icbt.weddingplanner.loginController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LoginRequest {
    private final String email;
    private final String password;
}
