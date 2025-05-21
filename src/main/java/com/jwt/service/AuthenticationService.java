package com.jwt.service;

import com.jwt.entity.dto.LoginDTO;

public interface AuthenticationService
{
    String login(LoginDTO loginDTO);
}
