package com.midas.servercore.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.midas.servercore.repository"])
@EntityScan(basePackages = ["com.midas.servercore.domain"])
class TestConfig {
}