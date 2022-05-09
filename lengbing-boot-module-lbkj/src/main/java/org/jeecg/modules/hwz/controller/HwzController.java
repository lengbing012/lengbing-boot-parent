package org.jeecg.modules.hwz.controller;

import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lengbing
 * @CreateDate: 2022-05-09 14:57
 * @Description: org.jeecg.modules.hwz.controller
 * @Version: 1.0
 */
@RestController
@RequestMapping("/lbkj")
public class HwzController {
    @GetMapping(value = "/hwz")
    public Result<String> hwz(){
        Result<String> result = new Result<String>();
        result.setResult("hwz,hello");
        result.setSuccess(true);
        return result;
    }
}
