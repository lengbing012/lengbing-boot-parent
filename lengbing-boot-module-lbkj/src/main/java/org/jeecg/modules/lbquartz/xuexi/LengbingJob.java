package org.jeecg.modules.lbquartz.xuexi;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.util.DateUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author: lengbing
 * @CreateDate: 2022-05-31 17:55
 * @Description: org.jeecg.modules.lbquartz.xuexi
 * @Version: 1.0
 */
@Slf4j
public class LengbingJob implements Job {

    /**
     * 若参数变量名修改 QuartzJobController中也需对应修改
     */
    private String parameter;

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(" 冷冰："+jobExecutionContext.getJobDetail().getKey());
        log.info( String.format("LB %s! Jeecg-Boot 带参数定时任务 SampleParamJob !   时间:" + DateUtils.now(), this.parameter));
    }
}