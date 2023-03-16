package cn.minalz.template;

import cn.minalz.format.FormatProcessor;

/**
 * @author zhouwei
 * @date 2023/3/16 16:39
 */
public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    public HelloFormatTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public <T> String doFormat(T obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execute format: ").append("\n");
        stringBuilder.append("Obj format result: ").append(formatProcessor.format(obj)).append("\n");
        return stringBuilder.toString();


    }

}
