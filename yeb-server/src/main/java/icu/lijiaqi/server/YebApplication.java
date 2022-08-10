package icu.lijiaqi.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author:LeeGaki
 * @date:2022/4/30
 */
@SpringBootApplication
@MapperScan("icu.lijiaqi.server.mapper")
@EnableScheduling  // 开启定时任务
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);
    }
}
