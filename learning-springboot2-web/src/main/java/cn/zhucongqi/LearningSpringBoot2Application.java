package cn.zhucongqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.zhucongqi.mapper")
public class LearningSpringBoot2Application {

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringBoot2Application.class, args);
    }

}
