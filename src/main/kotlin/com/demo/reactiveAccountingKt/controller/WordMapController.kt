package com.demo.reactiveAccountingKt.controller

import com.demo.reactiveAccountingKt.model.StringRequest
import com.demo.reactiveAccountingKt.model.StringResponse
import com.demo.reactiveAccountingKt.service.WordService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
// import reactor.core.publisher.Flux

@RestController
@RequestMapping("/words")
class WordMapController(private val wordService: WordService) {

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun handleWordList(@RequestBody requestWordList: StringRequest): Mono<StringResponse> {
        val responseWordList = StringResponse( wordService.findMostCommonStartLetters(requestWordList.input) )
        return Mono.just(responseWordList)
    }
}
