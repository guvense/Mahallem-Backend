package com.mahallem.controller;

import com.mahallem.dto.Request.AnimalRequest;
import com.mahallem.dto.Response.AnimalResponse;
import com.mahallem.service.AnimalService;
import com.mahallem.util.JwtUtil;
import com.mahallem.util.ResponseUtil;
import com.mahallem.viewmodel.MainResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/animal")
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping
    public ResponseEntity<MainResponse<AnimalResponse>> getAnimal(HttpServletRequest httpServletRequest) {

        String id = JwtUtil.getObjectIdFromRequest(httpServletRequest);
        return ResponseUtil.data(animalService.getAnimal(id));

    }

    @PostMapping
    public ResponseEntity<MainResponse<AnimalResponse>> setAnimalInformation(@Valid AnimalRequest animalRequest, HttpServletRequest httpServletRequest) {
        String id = JwtUtil.getObjectIdFromRequest(httpServletRequest);
        AnimalResponse animalResponse = animalService.saveAnimal(id, animalRequest);
        return ResponseUtil.data(animalResponse);
    }
    
    @DeleteMapping
    public ResponseEntity<MainResponse<AnimalResponse>> deleteAnimal(String animalId, HttpServletRequest httpServletRequest) {
        String id = JwtUtil.getObjectIdFromRequest(httpServletRequest);
        return ResponseUtil.data(animalService.deleteAnimal(animalId, id));
    }

}