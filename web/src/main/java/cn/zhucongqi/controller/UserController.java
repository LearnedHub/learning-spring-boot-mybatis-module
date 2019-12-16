package cn.zhucongqi.controller;

import cn.zhucongqi.domain.MallUser;
import cn.zhucongqi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 13:29
 * @description：
 * @modified By：
 * @version:
 */
@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired//可以不写
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user/{userId}")
    public MallUser user(@PathVariable Integer userId) {
        MallUser user = this.userRepository.getUserById(userId);
        return user != null ? user : new MallUser();
    }

    @RequestMapping("/users")
    public List<MallUser> users() {
        return this.userRepository.getAllUsers();
    }

    @RequestMapping("/excp")
    public String excp() {
        throw new RuntimeException("测试失败");
    }

    /**
     * 测试过滤属性为null的数据，在mapper中只取出了一部分数据
     * @param userId
     * @return
     */
    @RequestMapping("/userx/{userId}")
    public MallUser userx(@PathVariable Integer userId) {
        MallUser user = this.userRepository.getUser(userId);
        return user != null ? user : new MallUser();
    }
}
