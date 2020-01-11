package com.mahallem.dto.Response;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthResponse {

    private String userName;

    private String firstName;

    private String lastName;

    private String id;

    private String token;
}
