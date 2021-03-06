package com.demo.reactiveAccountingKt.repository

import com.demo.reactiveAccountingKt.model.Account
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository: ReactiveCrudRepository<Account, String> {  }