package cn.zhucongqi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/21 13:41
 * @description：
 * @modified By：
 * @version:
 */
@RunWith(SpringRunner.class)
@SpringBootTest//(classes = LearningSpringBoot2Application.class)
public class RedisDemo {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void testRedis() {

        String key = "as1d";
        redisUtils.set(key, "嚯嚯啊按时 ");
        Object value = redisUtils.get(key);
        System.out.println(value);

        key = "hello";
        redisUtils.set(key, "嚯嚯啊ooo ");
        value = redisUtils.get(key);
        System.out.println(value);
    }
}
