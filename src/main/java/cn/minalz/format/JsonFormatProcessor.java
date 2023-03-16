package cn.minalz.format;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhouwei
 * @date 2023/3/16 16:37
 */
public class JsonFormatProcessor implements FormatProcessor{

    @Override
    public String format(Object obj) {
        return "JsonFormatProcessor: " + JSONObject.toJSON(obj);
    }
}
