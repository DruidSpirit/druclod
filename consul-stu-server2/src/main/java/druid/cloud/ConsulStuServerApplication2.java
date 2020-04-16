package druid.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulStuServerApplication2
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsulStuServerApplication2.class, args);
    }
}
