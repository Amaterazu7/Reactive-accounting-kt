package com.demo.reactiveAccountingKt.controller

import com.demo.reactiveAccountingKt.model.Account
import com.demo.reactiveAccountingKt.repository.AccountRepository
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/accounts")
class AccountController(private val accountRepository: AccountRepository) {

    @GetMapping(produces = ["text/event-stream"])
    fun findAllAccounts(): Flux<Account> {
        return accountRepository.findAll()
    }

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findAccount(@PathVariable(value = "id") id: String): Mono<Account> {
        return accountRepository.findById(id)
    }

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun addAccount(@RequestBody account: Account): Mono<Account> {
        return accountRepository.save(account)
    }
}
