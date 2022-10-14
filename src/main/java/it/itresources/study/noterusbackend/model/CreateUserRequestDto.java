package it.itresources.study.noterusbackend.model;

import java.util.Objects;

public class CreateUserRequestDto {
    private String email;
    private String password;
    private String name;
    private String surname;


    public CreateUserRequestDto() {
    }

    public CreateUserRequestDto(String email, String password, String name, String surname) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public CreateUserRequestDto email(String email) {
        setEmail(email);
        return this;
    }

    public CreateUserRequestDto password(String password) {
        setPassword(password);
        return this;
    }

    public CreateUserRequestDto name(String name) {
        setName(name);
        return this;
    }

    public CreateUserRequestDto surname(String surname) {
        setSurname(surname);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CreateUserRequestDto)) {
            return false;
        }
        CreateUserRequestDto createUserRequestDto = (CreateUserRequestDto) o;
        return Objects.equals(email, createUserRequestDto.email) && Objects.equals(password, createUserRequestDto.password) && Objects.equals(name, createUserRequestDto.name) && Objects.equals(surname, createUserRequestDto.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, name, surname);
    }

    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            "}";
    }
   

}
