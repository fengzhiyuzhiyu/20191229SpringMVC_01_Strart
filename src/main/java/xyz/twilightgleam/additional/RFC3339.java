package xyz.twilightgleam.additional;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Before using this class， please import the beacon of joda in maven.
 */
public class RFC3339 {

    /**
     * This method can transfer the String format RF3339 to long type date format basing on the time zone of your computer.
     * @param RFC3339String
     * @return
     */
    public Long RFC3339StringToDateStamp(String RFC3339String){
        DateTime dateTime = new DateTime(RFC3339String);
        long timeInMillis = dateTime.toCalendar(Locale.getDefault()).getTimeInMillis();
        return timeInMillis;
    }

    /**
     * Long type of timestamp transfer to RFC3339S data time date.
     * @param timestamp
     * @return
     */
    public DateTime LongToRFC3339(long timestamp){
        return new DateTime(timestamp, DateTimeZone.UTC);
    }

    /**
     * Long type of timestamp transfer to RFC3339S String.
     * @param timestamp
     * @return
     */
    public String LongToRFC3339String(long timestamp){
        return new DateTime(timestamp, DateTimeZone.UTC).toString();
    }


}


class TestRFC3339{
    public static void main(String[] args) {

        RFC3339 rfc3339 = new RFC3339();

        Date date = new Date(); // 获取时间

        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date); // 格式化当前时间
        System.out.println(format);

        long timestamp = date.getTime();// 转为时间戳
        System.out.println(timestamp);

        System.out.println(rfc3339.LongToRFC3339String(timestamp)); // 时间戳转为RFC3339时间数据

        System.out.println(rfc3339.LongToRFC3339String(timestamp)); // 时间戳转为RFC3339字符串数据
    }
}