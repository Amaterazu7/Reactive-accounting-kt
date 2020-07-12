package com.demo.reactiveAccountingKt.service

interface WordService {
    /**
     * Given a list of strings, list the most common letters in desc order:
     *     Example ::>> ["apple", "chicken", "cow", "cockroach", "ant", "beaver"] -> {c, a, b}
     */
    fun findMostCommonStartLetters(input: ArrayList<String>) : LinkedHashMap<String, Int>
}