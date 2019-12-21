package cn.zhucongqi.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ：Jobsz
 * @project ：learning-mybatis-common-mapper
 * @date ：Created in 2019/12/10 16:49
 * @description：
 * @modified By：
 * @version:
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
