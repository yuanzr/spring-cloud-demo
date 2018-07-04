package com.scarllet.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer//表示是配置文件中心
@SpringBootApplication
public class ConfigServerApplication {
	/**
	 *
	 *
	 * 访问:http://localhost:9900/foo/dev 看到下面信息则成功
	 * {"name":"foo","profiles":["dev"],"label":null,"version":null,"state":null,"propertySources":[]}
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
