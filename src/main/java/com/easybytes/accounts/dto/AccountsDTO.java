package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(name = "Accounts", description = "Schema to hold Account information of a Customer in EasyBank")
public class AccountsDTO {

    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "^$|[0-9]{10}", message = "Account number must be 10 digits")
    @Schema(description = "Account number of EasyBank account")
    private Long accountNumber;

    @Schema(description = "Account type of EasyBank account", example = "Savings")
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(description = "EasyBank Branch address")
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
