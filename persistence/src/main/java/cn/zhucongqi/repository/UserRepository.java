package cn.zhucongqi.repository;

import cn.zhucongqi.domain.MallUser;
import cn.zhucongqi.mapper.x.MallUserMapperX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ：Jobsz
 * @project ：learning-spring-boot-mybatis
 * @date ：Created in 2019/12/16 16:09
 * @description：
 * @modified By：
 * @version:
 */
@Repository
public class UserRepository {

    private final MallUserMapperX mallUserMapper;

    @Autowired//可以不写
    public UserRepository(MallUserMapperX mallUserMapper) {
        this.mallUserMapper = mallUserMapper;
    }

    public MallUser getUserById(Integer id) {
        return this.mallUserMapper.selectByPrimaryKey(id);
    }

    public MallUser getUser(Integer id) {
        return this.mallUserMapper.getUser(id);
    }

    public List<MallUser> getAllUsers() {
        return this.mallUserMapper.selectAll();
    }
}
