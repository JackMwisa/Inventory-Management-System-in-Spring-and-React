package com.jackmwisadev.InventoryMgtSystem.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jackmwisadev.InventoryMgtSystem.enums.UserRole;
import com.jackmwisadev.InventoryMgtSystem.models.Product;
import com.jackmwisadev.InventoryMgtSystem.models.Supplier;
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
    private  UserDTO user;
    private List<UserDTO> users;

    private SupplierDTO supplier;
    private List<SupplierDTO> suppliers;

    private  CategoryDTO category;
    private List<CategoryDTO> Categorys;

    private ProductDTO product;
    private List<ProductDTO> products;

    private  TransactionDTO transaction;
    private List<TransactionDTO> transactions;


    

}
