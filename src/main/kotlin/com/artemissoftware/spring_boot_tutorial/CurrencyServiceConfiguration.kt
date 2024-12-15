package com.artemissoftware.spring_boot_tutorial

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component


@ConfigurationProperties(prefix = "currency-service")
@Component
class CurrencyServiceConfiguration {
    var url: String = ""
    var username: String = ""
    var key: String = ""
}
