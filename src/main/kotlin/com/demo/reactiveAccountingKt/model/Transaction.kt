package com.demo.reactiveAccountingKt.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal

@Document
data class Transaction(
        @Field
        @Indexed
        var amount: BigDecimal = BigDecimal(0),
        @Field
        var type: Type,
        @Field
        val status: Status,
        @Field
        val description: String,
        @JsonIgnore
        @Field
        val account: Account
) : AbstractBaseModel() {  }