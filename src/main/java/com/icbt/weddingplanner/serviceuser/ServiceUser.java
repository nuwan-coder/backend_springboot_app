package com.icbt.weddingplanner.serviceuser;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ServiceUser {
    @Id
    @SequenceGenerator(
            name = "serviceUser_sequence",
            sequenceName = "serviceUser_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "serviceUser_sequence"
    )
    private Long id;
    private String hotelName;
    private String address;
    private String contactNo;
    private String email;
    private String pricePerPlate;
    private String password;

    public ServiceUser(
            String hotelName,
            String address,
            String contactNo,
            String email,
            String pricePerPlate,
            String password) {
        this.hotelName = hotelName;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.pricePerPlate = pricePerPlate;
        this.password = password;
    }
}
