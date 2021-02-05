package com.icbt.weddingplanner.appuser;

import com.icbt.weddingplanner.loginController.LoginRequest;
import com.icbt.weddingplanner.loginController.LoginResponse;
import com.icbt.weddingplanner.registrationController.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AppUserService {

    private final AppUserRepository appUserRepository;
    private final static String EMAIL_ALREADY_TAKEN_MSG = "Your %s email already taken";

    public void register(RegistrationRequest registrationRequest){

        boolean existUser = appUserRepository.findByEmail(registrationRequest.getEmail()).isPresent();

        if(existUser){
            throw new IllegalStateException(String.format(EMAIL_ALREADY_TAKEN_MSG,registrationRequest.getEmail()));
        }

        appUserRepository.save(
            new AppUser(
                    registrationRequest.getFirstName(),
                    registrationRequest.getLastName(),
                    registrationRequest.getUsername(),
                    registrationRequest.getEmail(),
                    registrationRequest.getNic(),
                    registrationRequest.getContactNo(),
                    registrationRequest.getPassword()
            )
        );

    }

    public LoginResponse login(LoginRequest loginRequest){
        boolean userExist = appUserRepository.findByEmail(loginRequest.getEmail()).isPresent();
        Optional<AppUser> appUser = appUserRepository.findByEmail(loginRequest.getEmail());

        LoginResponse loginResponse;

        if(userExist){
            boolean equals = appUser.get().getPassword().equals(loginRequest.getPassword());
            if(equals){
                return  new LoginResponse(
                        true,
                        "Login Successful",
                        appUser
                );
            }else{
                return new LoginResponse(
                        false,
                        "Invalid Password",
                        null
                );
            }
        }else{
            return new LoginResponse(
                    false,
                    "Invalid email",
                    null
            );
        }
    }

    public List<AppUser> getAppUser(){
        List<AppUser> all = appUserRepository.findAll();
        return all;
    }

}
