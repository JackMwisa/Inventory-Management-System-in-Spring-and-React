package com.jackmwisadev.InventoryMgtSystem.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jackmwisadev.InventoryMgtSystem.enums.UserRole;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    //Generic
    private int status;
    private String message;
    //For Login
    private String token;
    private UserRole role;
    private String expirationTime;


    //For pagination
    private Integer totalPages;
    private  Long totalElement;

    //data output optionals
    private  UserDTO userDTO;
    private List<UserDTO> users;


}
