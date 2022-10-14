package it.itresources.study.noterusbackend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.itresources.study.noterusbackend.model.CreateUserRequestDto;
import it.itresources.study.noterusbackend.model.UserDto;
import it.itresources.study.noterusbackend.service.UsersService;

@RestController()
@RequestMapping("/api/v1/auth")
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    private final UsersService usersService;

    @Autowired
    public AuthController(UsersService usersService) {
        Assert.notNull(usersService, "injected UsersService instance must be not null");
        this.usersService = usersService;
    }

    @GetMapping("/me")
    public ResponseEntity<String> me() {
        logger.info("Request to get user (me) information");
        return ResponseEntity.ok("me");
    }

    @GetMapping("/signin")
    public ResponseEntity<String> signin() {
        logger.info("Request to get user (me) information");
        return ResponseEntity.ok("me");
    }

    @PostMapping("/signup")
    public ResponseEntity<UserDto> signup(@RequestBody CreateUserRequestDto requestDto) {
        logger.info("request to register a new user - email: {}", requestDto.getEmail());
        UserDto newUserDto = this.usersService.create(requestDto);
        return ResponseEntity.ok(newUserDto);
    }
}
