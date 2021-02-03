package com.icbt.weddingplanner.appuser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class AppUser {

    @Id
    @SequenceGenerator(
            name = "appUser_sequence",
            sequenceName = "appUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appUser_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String nic;
    private String contactNo;
    private String password;

    public AppUser(String firstName,
                   String lastName,
                   String username,
                   String email,
                   String nic,
                   String contactNo,
                   String password
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.nic = nic;
        this.contactNo = contactNo;
        this.password = password;
    }
}
