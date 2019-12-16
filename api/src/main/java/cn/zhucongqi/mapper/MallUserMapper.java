package cn.zhucongqi.mapper;

import cn.zhucongqi.base.BaseMapper;
import cn.zhucongqi.domain.MallUser;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface MallUserMapper extends BaseMapper<MallUser> {
}