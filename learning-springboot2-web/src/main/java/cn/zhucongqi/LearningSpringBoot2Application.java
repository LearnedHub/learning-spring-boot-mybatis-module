package cn.zhucongqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "cn.zhucongqi.mapper")
public class LearningSpringBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBoot2Application.class, args);
    }

}
