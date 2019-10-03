package io.mbo.microstation.msconfigurationservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
class MsConfigurationServiceApplication

fun main(args: Array<String>) {
	runApplication<MsConfigurationServiceApplication>(*args)
}
