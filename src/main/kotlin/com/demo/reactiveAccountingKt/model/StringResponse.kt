package com.demo.reactiveAccountingKt.model

import org.jetbrains.annotations.NotNull
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document
data class StringResponse(
        @Field
        @field:NotNull
        var output: LinkedHashMap<String, Int>
) : AbstractBaseModel() {  }