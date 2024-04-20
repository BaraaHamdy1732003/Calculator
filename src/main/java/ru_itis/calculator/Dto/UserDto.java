package ru_itis.calculator.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru_itis.calculator.Models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String username;

    public static  UserDto from(User user) {
        return UserDto.builder()
                .id(user.getUserId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .username(user.getUsername())
                .build();
    }

    public static List<UserDto> userDtoList(List<User> users) {
        return users.stream()
                .map(UserDto::from)
                .collect(Collectors.toList());
    }

}
