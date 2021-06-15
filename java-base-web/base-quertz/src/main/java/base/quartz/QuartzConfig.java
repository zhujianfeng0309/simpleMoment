package base.quartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    /**
     * @description
     * @param: []
     * @return: org.quartz.JobDetail
     */
    @Bean
    public JobDetail jobDetail(){
        return JobBuilder.newJob(QuartzJob.class)
                .withIdentity("mac_job", "job_group")
                // Jobs added with no trigger must be durable
                .storeDurably()
                .build();
    }
    /**
     * @description 触发器
     * @param: []
     * @return: org.quartz.Trigger
     */
    @Bean
    public Trigger trigger(){
        // 每5秒执行一次
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ? ");
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail())
                .startNow()
                .withIdentity("mac_trigger", "trigger_group")
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}