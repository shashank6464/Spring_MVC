package org.example;

import org.springframework.stereotype.Component;

@Component
public class Player {
    private int id;
    private String name;
    private String nationality;
    private int age;

    public Player() {
    }

    public Player(int id, String name, String nationality, int age) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }


}
