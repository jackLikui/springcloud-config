package springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ProjectName: springcloud-config
 * @Package: PACKAGE_NAME
 * @ClassName: springcloudconfig.ConfigServerApplication
 * @Author: chinasoft.k.li
 * @Description:
 * @Date: 2019/5/17 9:18
 * @Version: 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
