package cn.zero.demo.conteoller;

import cn.zero.demo.common.RequestCommon;
import cn.zero.demo.entity.Simple;
import cn.zero.demo.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZERO
 * @version V1.4
 * @description
 * @package cn.zero.demo.conteoller
 * @date 2018 10-15 下午 2:19
 */
@RestController
@RequestMapping(value = RequestCommon.S_SIPLEM_NAME)
public class SimpleController {

    @Autowired
    private SimpleService simpleService;

    @PostMapping(value = "/list/{version}")
    public List<Simple> simplesList(@RequestBody Simple simple, @PathVariable(value = "version") String version) {
        return simpleService.simpleList(simple);
    }
}
