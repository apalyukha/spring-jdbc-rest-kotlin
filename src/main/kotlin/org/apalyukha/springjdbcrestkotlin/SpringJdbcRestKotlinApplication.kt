package org.apalyukha.springjdbcrestkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringJdbcRestKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringJdbcRestKotlinApplication>(*args)
}
