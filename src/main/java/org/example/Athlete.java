package org.example;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

import java.util.Arrays;
import java.util.Date;

@Component
public class Athlete {

//    @NotNull(message = "This is a required field")
    @Size(min = 1, message="required field must be greater than 1")
//      @NotEmpty(message="This is a required field ")
    private String name;

    private String country;

    @DateTimeFormat(pattern="dd-MM-yyyy")
    @Past(message="Date must be in Past")
    private Date dob;

    @NotNull(message = "This is a required field")
    private String rank;

    //pattern "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" , message = "Please enter a valid <b>Email Address.</b>")
    private String email;

    @NotNull(message = "This is a required field")
    @Min(value = 1, message="Value must be greater than or equal to 1")
    @Max(value = 10, message="Value must be less than or equal to 10")
    private int designation;

    private String[] tournaments;
    public Athlete() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public String[] getTournaments() {
        return tournaments;
    }

    public void setTournaments(String[] tournaments) {
        this.tournaments = tournaments;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", dob=" + dob +
                ", rank='" + rank + '\'' +
                ", tournaments=" + Arrays.toString(tournaments) +
                '}';
    }
}
