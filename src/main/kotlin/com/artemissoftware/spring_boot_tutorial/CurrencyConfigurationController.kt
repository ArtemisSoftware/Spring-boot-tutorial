package com.artemissoftware.spring_boot_tutorial

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class CurrencyConfigurationController {
    @Autowired
    private lateinit var configuration: CurrencyServiceConfiguration

    @RequestMapping("/currency-configuration")
    fun retrieveConfiguration(): CurrencyServiceConfiguration {
        return configuration
    }
}
