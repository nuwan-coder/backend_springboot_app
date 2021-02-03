package com.icbt.weddingplanner.serviceuser;

import com.icbt.weddingplanner.registrationController.RegistrationServiceUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceUserService {

    private final ServiceUserRepository serviceUserRepository;

    public void registerServiceUser(RegistrationServiceUser registrationServiceUser){

        boolean exist = serviceUserRepository.findByEmail(registrationServiceUser.getEmail()).isPresent();
        if(exist){
            throw new IllegalStateException("Email already taken");
        }

        serviceUserRepository.save(
                new ServiceUser(
                        registrationServiceUser.getHotelName(),
                        registrationServiceUser.getAddress(),
                        registrationServiceUser.getContactNo(),
                        registrationServiceUser.getEmail(),
                        registrationServiceUser.getPricePerPlate(),
                        registrationServiceUser.getPassword()
                )
        );
    }

}
