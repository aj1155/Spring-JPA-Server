package com.skhu.Ian.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.skhu.Ian.model"})
@EnableJpaRepositories(basePackages = {"com.skhu.Ian.repository"})
@EnableTransactionManagement
public class RepositoryConfig {

}
