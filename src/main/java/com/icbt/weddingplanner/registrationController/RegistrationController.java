package com.icbt.weddingplanner.registrationController;

import com.icbt.weddingplanner.appuser.AppUser;
import com.icbt.weddingplanner.appuser.AppUserService;
import com.icbt.weddingplanner.serviceuser.ServiceUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final AppUserService appUserService;
    private final ServiceUserService serviceUserService;

    @PostMapping("/user")
    public void register(@RequestBody RegistrationRequest registrationRequest){
        appUserService.register(registrationRequest);
    }

    @PostMapping("/service_user")
    public void serviceUserRegister(@RequestBody RegistrationServiceUser registrationServiceUser){
        serviceUserService.registerServiceUser(registrationServiceUser);
    }
}
