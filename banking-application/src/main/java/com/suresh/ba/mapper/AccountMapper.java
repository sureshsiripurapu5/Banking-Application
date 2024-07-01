package com.suresh.ba.mapper;

import com.suresh.ba.dto.AccountDto;
import com.suresh.ba.entity.Account;

public class AccountMapper {
	//convert Accountdto in account jpa entity
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(
				accountDto.getId(),
				accountDto.getAccountHolderName(),
				accountDto.getBalance()
				);
		
		return account;
	}
	
	//convert account to accountdto
	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(
				account.getId(),
				account.getAccountHolderName(),
				account.getBalance()
				);
		return accountDto;
		
	}

}
