package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= "com.nt.repo.prod",entityManagerFactoryRef = "oraEntity", transactionManagerRef = "oraTManagment")
public class OracleConfig {
	//Create Datasource object
		@Bean(name = "oraDS")
		@ConfigurationProperties(prefix = "oracle.dss")
		@Primary
		public DataSource getOracleDSObject() {
			System.out.println("<------------------Get O DS------------------------>");
			return DataSourceBuilder.create().build();
		}
	//Create Entity class object 
		@Bean(name= "oraEntity")
		@Primary
		public LocalContainerEntityManagerFactoryBean getOracleEntity(EntityManagerFactoryBuilder builder) {
			System.out.println("<------------------Get O EM------------------------>");
			Map<String,Object> prop = new HashMap();
			prop.put("hibernate.dialect","org.hibernate.dialect.OracleDialect");
			prop.put("hibernate.hbm2ddl.auto","update");
			prop.put("hibernate.show-sql","true");
			return builder.dataSource(getOracleDSObject())
						.packages("com.nt.entity.prod")
						.properties(prop)
						.build();
		}
	//Create Transation managment object
		@Bean(name = "oraTManagment")
		@Primary
		public PlatformTransactionManager createOracleTManagment(@Qualifier("oraEntity") EntityManagerFactory factory) {
			System.out.println("<------------------Get O TM------------------------>");
				return new JpaTransactionManager(factory);
		}
		public OracleConfig() {
			System.out.println("-------------------OracleConfig()---------------");
		}
}
