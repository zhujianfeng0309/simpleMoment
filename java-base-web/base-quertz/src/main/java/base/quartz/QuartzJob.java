package base.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.time.LocalDateTime;

public class QuartzJob extends QuartzJobBean {
    public QuartzJob() {
        super();
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("    Hi! :" + jobExecutionContext.getJobDetail().getKey()+">time:"+ LocalDateTime.now());
    }
}
