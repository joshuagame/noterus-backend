package it.itresources.study.noterusbackend.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import it.itresources.study.noterusbackend.domain.entity.UserEntity;
import it.itresources.study.noterusbackend.domain.repository.UsersRepository;
import it.itresources.study.noterusbackend.model.CreateUserRequestDto;
import it.itresources.study.noterusbackend.model.UserDto;
import it.itresources.study.noterusbackend.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

    private static final Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);

    private final UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        Assert.notNull(usersRepository, "injected UsersRepository must be not null");
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDto create(CreateUserRequestDto userDto) {
        logger.debug("handling user creation - email: {}", userDto.getEmail());

        UserEntity user = new UserEntity();
        if (userDto.getEmail() != null) {
            user.setEmail(userDto.getEmail().toLowerCase());
        }
        user.setPassword(userDto.getPassword() + ":encrypted");
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());

        logger.debug("saving new user: {}", user);

        this.usersRepository.save(user);
        UserDto newUserDto = new UserDto(user.getId(), user.getEmail(), user.getName(), user.getSurname(),
                user.getCreatedAt(), user.getUpdatedAt());

        return newUserDto;
    }

}
