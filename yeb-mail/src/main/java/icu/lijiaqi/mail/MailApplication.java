package icu.lijiaqi.mail;

import icu.lijiaqi.server.pojo.MailConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author:LeeGaki
 * @date:2022/4/30
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MailApplication {
    public static void main(String[] args) {
        SpringApplication.run(MailApplication.class,args);
    }
    @Bean
    public Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }
    /**
     * 简单模式
     * @return
     */
//	@Bean
//	public Queue queue(){
//		return new Queue("lijiaqi");
//	}

}

