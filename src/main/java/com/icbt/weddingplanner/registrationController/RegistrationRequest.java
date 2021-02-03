package com.icbt.weddingplanner.registrationController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String username;
    private final String email;
    private final String nic;
    private final String contactNo;
    private final String password;
}
