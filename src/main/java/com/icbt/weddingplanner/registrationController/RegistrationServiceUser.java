package com.icbt.weddingplanner.registrationController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrationServiceUser {
    private final String hotelName;
    private final String address;
    private final String contactNo;
    private final String email;
    private final String pricePerPlate;
    private final String password;
}
