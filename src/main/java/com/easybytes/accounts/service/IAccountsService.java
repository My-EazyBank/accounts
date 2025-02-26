package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDTO;

public interface IAccountsService {

    /**
     * Creates a new account for the given customer
     * @param customerDTO the customer information
     */
    void createAccount(CustomerDTO customerDTO);

    CustomerDTO getAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);

    boolean deleteAccount(String mobileNumber);
}
