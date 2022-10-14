package it.itresources.study.noterusbackend.service;

import it.itresources.study.noterusbackend.model.CreateUserRequestDto;
import it.itresources.study.noterusbackend.model.UserDto;

public interface UsersService {
    UserDto create(CreateUserRequestDto userDto);
}
