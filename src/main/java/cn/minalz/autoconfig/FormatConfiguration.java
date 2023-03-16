package cn.minalz.autoconfig;

import cn.minalz.format.FormatProcessor;
import cn.minalz.format.JsonFormatProcessor;
import cn.minalz.format.StringFormatProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhouwei
 * @date 2023/3/16 16:40
 */
@Configuration
public class FormatConfiguration {

    @Bean
    public FormatProcessor stringFormatProcess() {
        return new StringFormatProcessor();
    }

    @Bean
    public FormatProcessor jsonFormatProcess() {
        return new JsonFormatProcessor();
    }
}
