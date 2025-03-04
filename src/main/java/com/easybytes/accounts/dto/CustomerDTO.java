package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(name = "Customer", description = "Schema to hold Customer information in EasyBank")
public class CustomerDTO {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 20, message = "The length of the customer name should be between 5 and 20 characters")
    @Schema(description = "Name of the customer", example = "John Doe")
    private String name;

    @Schema(description = "Email of the customer", example = "tH5cS@example.com")
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Invalid email format")
    private String email;

    @Schema(description = "Mobile number of the customer")
    @NotEmpty(message = "Mobile number cannot be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer")
    private AccountsDTO accountsDTO;
}
