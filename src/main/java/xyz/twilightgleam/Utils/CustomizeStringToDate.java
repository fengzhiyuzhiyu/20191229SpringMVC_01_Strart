package xyz.twilightgleam.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 注意导包为核心类的包
 */
public class CustomizeStringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source == null){
            throw new RuntimeException("请输入数据...");
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型不匹配...");
        }
    }
}
