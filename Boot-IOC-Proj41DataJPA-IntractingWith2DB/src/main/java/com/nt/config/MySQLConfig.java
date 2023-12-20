package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= "com.nt.repo.offr",entityManagerFactoryRef = "mySqlEntity", transactionManagerRef = "mySqlTManagment")
public class MySQLConfig {
	//Create Datasource object
		@Bean(name = "mySqlDS")
		@ConfigurationProperties(prefix = "mysql.dss")
//		@Primary
		public DataSource getMySQLDSObject() {
				System.out.println("<-----------Get M DS--------------------->");
			return DataSourceBuilder.create().build();
		}
	//Create Entity class object 
		@Bean(name= "mySqlEntity")
//		@Primary
		public LocalContainerEntityManagerFactoryBean getMySqlEntity(EntityManagerFactoryBuilder builder) {
			System.out.println("<-----------Get M EF--------------------->");
			Map<String,Object> prop = new HashMap();
			prop.put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
			prop.put("hibernate.hbm2ddl.auto","update");
			prop.put("hibernate.show-sql","true");
			return builder.dataSource(getMySQLDSObject())
						.packages("com.nt.entity.offr")
						.properties(prop)
						.build();
		}
	//Create Transation managment object
		@Bean(name = "mySqlTManagment")
		@Primary
		public PlatformTransactionManager createMySqlTManagment(@Qualifier("mySqlEntity") EntityManagerFactory factory) {
			System.out.println("<-----------Get M TM--------------------->");
				return new JpaTransactionManager(factory);
		}
	public MySQLConfig() {
		System.out.println("--------------------MySQLConfig()--------------");
	}
}
