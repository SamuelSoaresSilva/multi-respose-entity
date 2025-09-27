package io.github.samuelsoaressilva.spring.mre

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiResponseEntityApplication

fun main(args: Array<String>) {
	runApplication<MultiResponseEntityApplication>(*args)
}
