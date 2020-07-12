package com.demo.reactiveAccountingKt.configuration

import com.mongodb.reactivestreams.client.MongoClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.ReactiveMongoTemplate

@Configuration
class ReactiveMongoConfig {
    @Autowired
    var mongoClient: MongoClient? = null

    @Bean
    fun reactiveMongoTemplate(): ReactiveMongoTemplate {
        return ReactiveMongoTemplate(mongoClient!!, "accountDB")
    }
}