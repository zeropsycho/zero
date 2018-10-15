package cn.zero.demo.dao;

import cn.zero.demo.entity.Simple;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package cn.zero.demo.dao
 * @date 2018 10-15 下午 2:14
 */
@Mapper
public interface SimpleDao {

    /**
     * 查询列表
     * @param simple
     * @return
     */
    List<Simple> simpleList(Simple simple);
}
