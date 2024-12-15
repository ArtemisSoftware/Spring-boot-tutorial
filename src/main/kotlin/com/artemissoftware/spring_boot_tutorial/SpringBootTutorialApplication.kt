package com.artemissoftware.spring_boot_tutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootTutorialApplication

fun main(args: Array<String>) {
	runApplication<SpringBootTutorialApplication>(*args)
}
