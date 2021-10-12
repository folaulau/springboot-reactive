package com.lovemesomecoding.user;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private Long              id;

    @Column(name = "uuid", unique = true, nullable = false, updatable = false)
    private String            uuid;

    /**
     * national provider id
     */
    @Column(name = "npi")
    private String            npi;

    @Column(name = "first_name")
    private String            firstName;

    @Column(name = "middle_name")
    private String            middleName;

    @Column(name = "last_name")
    private String            lastName;

    @Column(name = "email", unique = true)
    private String            email;

    @Column(name = "password", length = 255, nullable = false)
    private String            password;

    @Column(name = "email_verified")
    private Boolean           emailVerified;

    @Column(name = "phone_number")
    private String            phoneNumber;

    @Column(name = "phone_verified")
    private Boolean           phoneVerified;

    @Column(name = "date_of_birth")
    private LocalDate         dateOfBirth;

}
