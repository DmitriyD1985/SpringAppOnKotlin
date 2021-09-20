package com.example.SpringAppOnKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringAppOnKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringAppOnKotlinApplication>(*args)
}
