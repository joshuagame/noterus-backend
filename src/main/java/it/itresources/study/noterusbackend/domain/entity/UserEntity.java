package it.itresources.study.noterusbackend.domain.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "users", indexes = {@Index(columnList = "email", unique = true)})
public class UserEntity extends Auditable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;
    private String surname;


    public UserEntity() {
    }

    public UserEntity(String email, String password, String name, String surname) {
        this(null, email, password, name, surname);
    }

    public UserEntity(Long id, String email, String password, String name, String surname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
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

    public UserEntity id(Long id) {
        setId(id);
        return this;
    }

    public UserEntity email(String email) {
        setEmail(email);
        return this;
    }

    public UserEntity password(String password) {
        setPassword(password);
        return this;
    }

    public UserEntity name(String name) {
        setName(name);
        return this;
    }

    public UserEntity surname(String surname) {
        setSurname(surname);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) && Objects.equals(email, userEntity.email) && Objects.equals(password, userEntity.password) && Objects.equals(name, userEntity.name) && Objects.equals(surname, userEntity.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, name, surname);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='** REDACTED **'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            "}";
    }

}