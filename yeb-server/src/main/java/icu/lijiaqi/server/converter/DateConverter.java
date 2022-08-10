package icu.lijiaqi.server.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author:LeeGaki
 * @date:2022/5/6
 */
@Component
public class DateConverter implements Converter<String, LocalDate> {

    /**
     * 日期的格式转换
     * @param source
     * @return
     */
    @Override
    public LocalDate convert(String source) {
        try {
            return LocalDate.parse(source, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}