package com.demo.reactiveAccountingKt.model

import org.jetbrains.annotations.NotNull
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal

@Document
data class Account(
        @Field
        var amount: BigDecimal = BigDecimal(0),
        @Field
        @Indexed
        @field:NotNull
        var name: String = "",
        @field:NotNull
        @Field
        var active: Boolean
) : AbstractBaseModel() {  }