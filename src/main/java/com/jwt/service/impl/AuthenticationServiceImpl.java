package com.jwt.service.impl;

import com.jwt.entity.dto.LoginDTO;
import com.jwt.security.util.JwtTokenProvider;
import com.jwt.service.AuthenticationService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Getter
public class AuthenticationServiceImpl implements AuthenticationService
{
    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;

    @Override
    public String login(LoginDTO loginDTO)
    {
        Authentication authentication = getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDTO.getUsernameOrEmail(),
                        loginDTO.getPassword()
                ));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        return getJwtTokenProvider().generateToken(authentication);
    }
}
