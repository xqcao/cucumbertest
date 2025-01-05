package com.example01.democomponent.models;

public class Person {
    private String name;
    private String email;
    private String cellPhone;

    public Person() {
    }

    public Person(String name, String email, String cellPhone) {
        this.name = name;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

}
