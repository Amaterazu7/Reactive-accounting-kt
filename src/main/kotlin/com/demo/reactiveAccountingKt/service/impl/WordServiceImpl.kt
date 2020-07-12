package com.demo.reactiveAccountingKt.service.impl

import com.demo.reactiveAccountingKt.service.WordService
import org.springframework.stereotype.Service

@Service
class WordServiceImpl : WordService {

    override fun findMostCommonStartLetters(input: ArrayList<String>) : LinkedHashMap<String, Int> {
        val letterMap = HashMap<String, Int>()
        val sortedMap = LinkedHashMap<String, Int>()

        input.stream()
            .forEach {
                `in` ->
                    val lett = `in`.substring(0, 1)
                    letterMap[lett] = when (letterMap.containsKey(lett)) {
                        true -> letterMap[lett]!! + 1
                        else -> 1
                    }
            }
        letterMap.entries
                .stream()
                .sorted(java.util.Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered { x: Map.Entry<String, Int> ->
                    sortedMap[x.key] = x.value
                }

        println(":: StringMap ::  >> $sortedMap ")
        return sortedMap
    }
}