package it.itresources.study.noterusbackend.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserDto {
    private Long id;
    private String email;
    private String name;
    private String surname;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public UserDto() {
    }

    public UserDto(Long id, String email, String name, String surname, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserDto id(Long id) {
        setId(id);
        return this;
    }

    public UserDto email(String email) {
        setEmail(email);
        return this;
    }

    public UserDto name(String name) {
        setName(name);
        return this;
    }

    public UserDto surname(String surname) {
        setSurname(surname);
        return this;
    }

    public UserDto createdAt(LocalDateTime createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    public UserDto updatedAt(LocalDateTime updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserDto)) {
            return false;
        }
        UserDto userDto = (UserDto) o;
        return Objects.equals(id, userDto.id) && Objects.equals(email, userDto.email) && Objects.equals(name, userDto.name) && Objects.equals(surname, userDto.surname) && Objects.equals(createdAt, userDto.createdAt) && Objects.equals(updatedAt, userDto.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, name, surname, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", createdAt='" + getCreatedAt() + "'" +
            ", updatedAt='" + getUpdatedAt() + "'" +
            "}";
    }

}
