package ru_itis.calculator.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserForm {
    private String firstname;
    private String lastname;
    private String username;
    private String password;

}
