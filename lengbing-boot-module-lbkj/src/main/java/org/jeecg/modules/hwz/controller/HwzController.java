package org.jeecg.modules.hwz.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.vo.LoginUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lengbing
 * @CreateDate: 2022-05-09 14:57
 * @Description: org.jeecg.modules.hwz.controller
 * @Version: 1.0
 */
@Slf4j
@RestController
@RequestMapping("/lbkj")
public class HwzController {
    @GetMapping(value = "/hwz")
    public Result<String> hwz(){
        LoginUser sysUser = (LoginUser)SecurityUtils.getSubject().getPrincipal();
        log.info("当前用户：" + sysUser);
        Result<String> result = new Result<String>();
        result.setResult("hwz,hello，欢迎您!!!");
        result.setSuccess(true);
        return result;
    }
}
