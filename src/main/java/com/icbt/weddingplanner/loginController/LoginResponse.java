package com.icbt.weddingplanner.loginController;

import com.icbt.weddingplanner.appuser.AppUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
public class LoginResponse {
    private boolean isSuccessful = false;
    private String message;
    private Optional<AppUser> appUser;
}
