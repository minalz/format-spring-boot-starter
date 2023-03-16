package cn.minalz.format;

import java.util.Objects;

/**
 * @author zhouwei
 * @date 2023/3/16 16:35
 */
public class StringFormatProcessor implements FormatProcessor{

    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor: " + Objects.toString(obj);
    }
}
