package com.midas.serverapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerApiApplication

fun main(args: Array<String>) {
    runApplication<ServerApiApplication>(*args)
}
