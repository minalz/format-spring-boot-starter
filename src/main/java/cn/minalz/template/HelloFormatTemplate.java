package cn.minalz.template;

import cn.minalz.autoconfigure.HelloProperties;
import cn.minalz.format.FormatProcessor;

/**
 * @author zhouwei
 * @date 2023/3/16 16:39
 */
public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties, FormatProcessor formatProcessor) {
        this.helloProperties = helloProperties;
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("begin: Execute format: ").append("<br/>");
        stringBuilder.append("HelloProperties: ").append(formatProcessor.format(helloProperties.getInfo())).append("<br/>");
        stringBuilder.append("Obj format result: ").append(formatProcessor.format(obj)).append("<br/>");
        return stringBuilder.toString();


    }

}
