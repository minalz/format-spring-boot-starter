package cn.minalz.autoconfigure;

import cn.minalz.format.FormatProcessor;
import cn.minalz.template.HelloFormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author minalz
 * @since 2023/03/17 00:08:05
 */
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
@Configuration
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties, FormatProcessor formatProcessor) {
        return new HelloFormatTemplate(helloProperties, formatProcessor);
    }
}
