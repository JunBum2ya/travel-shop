package com.midas.serverapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/travel")
class TravelController {

    @GetMapping
    fun allTravel(): String {
        return "test"
    }
}