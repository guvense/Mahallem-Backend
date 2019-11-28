package com.mahallem.Controller;

import com.mahallem.DTO.Request.AuthRequest;
import com.mahallem.DTO.Request.UserDetailRequest;
import com.mahallem.DTO.Response.AuthResponse;
import com.mahallem.DTO.Response.UserResponse;
import com.mahallem.Exception.UserNotFoundException;
import com.mahallem.Service.Impl.UserServiceImpl;
import com.mahallem.Util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userService;

    @PostMapping("add-user-detail")
    public ResponseEntity<UserResponse> addUserDetail(@Valid UserDetailRequest userDetailRequest, HttpServletRequest httpServletRequest) {
        String userId = JwtUtil.getObjectIdFromRequest(httpServletRequest);
        return new ResponseEntity<>(userService.setUserDetailInformation(userId, userDetailRequest), HttpStatus.OK);

    }

}
