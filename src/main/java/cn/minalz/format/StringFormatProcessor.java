package cn.minalz.format;

/**
 * @author zhouwei
 * @date 2023/3/16 16:35
 */
public class StringFormatProcessor implements FormatProcessor{

    @Override
    public String format(Object obj) {
        return "StringFormatProcessor: " + obj.toString();
    }
}
