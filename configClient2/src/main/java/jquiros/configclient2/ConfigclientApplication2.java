package jquiros.configclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigclientApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication2.class, args);
    }
}
