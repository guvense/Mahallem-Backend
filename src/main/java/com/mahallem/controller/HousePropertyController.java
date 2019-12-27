package com.mahallem.controller;

import com.mahallem.dto.Request.HousePropertyRequest;
import com.mahallem.dto.Response.HouseResponse;
import com.mahallem.dto.Response.UserResponse;
import com.mahallem.service.HousePropertyService;
import com.mahallem.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("prop")
public class HousePropertyController {

    private final HousePropertyService housePropertyService;

    @PostMapping("add-property")
    public ResponseEntity<HouseResponse> addPropertyToHouse(@Valid HousePropertyRequest housePropertyRequest, HttpServletRequest httpServletRequest) {

        String userId = JwtUtil.getObjectIdFromRequest(httpServletRequest);

        return new ResponseEntity<>(housePropertyService.addPropertyToUserHouse(housePropertyRequest,userId), HttpStatus.OK);
    }

}
