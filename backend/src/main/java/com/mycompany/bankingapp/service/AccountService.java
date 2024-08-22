package com.mycompany.bankingapp.service;

import com.yourcompany.bankingapp.dto.AccountDTO;
import com.yourcompany.bankingapp.model.Account;
import com.yourcompany.bankingapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<AccountDTO> getAllAccounts() {
        return accountRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public AccountDTO getAccountById(Long id) {
        return accountRepository.findById(id)
                .map(this::convertToDTO)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }

    public AccountDTO createAccount(AccountDTO accountDTO) {
        Account account = convertToEntity(accountDTO);
        Account savedAccount = accountRepository.save(account);
        return convertToDTO(savedAccount);
    }

    private AccountDTO convertToDTO(Account account) {
        return new AccountDTO(account.getId(), account.getAccountNumber(), account.getBalance());
    }

    private Account convertToEntity(AccountDTO accountDTO) {
        return new Account(accountDTO.getId(), accountDTO.getAccountNumber(), accountDTO.getBalance());
    }
}