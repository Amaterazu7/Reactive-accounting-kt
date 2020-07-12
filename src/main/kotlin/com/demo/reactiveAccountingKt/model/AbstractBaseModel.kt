package com.demo.reactiveAccountingKt.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.format.annotation.DateTimeFormat
import java.io.Serializable
import java.time.LocalDateTime
import java.util.*

abstract class AbstractBaseModel : Serializable {
    @Id
    @JsonProperty("id")
    private var id: String = UUID.randomUUID().toString()

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    protected var created: LocalDateTime = LocalDateTime.now()

    protected fun onCreate() {
        created = LocalDateTime.now()
    }
}

