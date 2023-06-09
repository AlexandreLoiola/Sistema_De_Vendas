package com.alexandreloiola.salesmanagement.model;

import javax.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@DiscriminatorValue("Seller")
public class SellerModel{

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 256, nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "birthDate", nullable = false)
    private LocalDate birthDate;

    @Column(name = "cpf", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive;

}
