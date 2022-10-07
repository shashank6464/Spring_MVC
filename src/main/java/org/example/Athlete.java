package org.example;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Arrays;

public class Athlete {

    @NotNull(message = "This is a required field")
    @Size(min = 1, message="required field must be greater than 1")
    private String name;

    private String country;

    private String rank;

    private String[] tournaments;
    public Athlete() {
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
                ", rank='" + rank + '\'' +
                ", tournament=" + Arrays.toString(tournaments) +
                '}';
    }
}
