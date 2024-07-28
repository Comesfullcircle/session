package com.example.session.model;


import lombok.*;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String password;
}
