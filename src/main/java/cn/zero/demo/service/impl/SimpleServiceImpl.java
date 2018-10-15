package cn.zero.demo.service.impl;

import cn.zero.demo.dao.SimpleDao;
import cn.zero.demo.entity.Simple;
import cn.zero.demo.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package cn.zero.demo.service.impl
 * @date 2018 10-15 下午 2:17
 */
@Service
public class SimpleServiceImpl implements SimpleService {

    @Autowired
    private SimpleDao simpleDao;

    @Override
    public List<Simple> simpleList(Simple simple) {
        if (simple == null) {
            throw new RuntimeException("参数不能为空！");
        }
        return simpleDao.simpleList(simple);
    }
}
