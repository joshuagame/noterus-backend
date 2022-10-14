package it.itresources.study.noterusbackend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.itresources.study.noterusbackend.domain.entity.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long> {
    
}
