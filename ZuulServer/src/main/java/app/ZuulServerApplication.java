package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
