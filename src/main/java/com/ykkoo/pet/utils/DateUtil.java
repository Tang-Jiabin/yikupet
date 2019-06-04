package com.ykkoo.pet.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具
 *
 * @author : J.Tang
 * @version : v1.0
 * @email : seven_tjb@163.com
 * @date : 2018-10-29
 **/

public class DateUtil {

    private static SimpleDateFormat dateFormat;


    public static Date getSpecifiedDate(Date date, int days) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //增加天数，负数则为减少天数
        calendar.add(Calendar.DATE, days);
        date = calendar.getTime();
        return date;

    }

    public static Date getSpecifiedMinute(Date date, int minute) {

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //增加分钟数，负数则为减少分钟数
        calendar.add(Calendar.MINUTE, minute);
        date = calendar.getTime();
        return date;

    }


    public static int longOfTwoDate(Date first, Date second) {

        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(first);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(second);
        int day1 = cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        //同一年
        if (year1 != year2) {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) {
                //闰年
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    timeDistance += 366;
                } else {
                    //不是闰年
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2 - day1);
        } else    //不同年
        {
            return day2 - day1;
        }
    }

    public static int difference(Date startDate, Date endDate) {
        LocalDateTime ldtStartDate = LocalDateTime.ofInstant(endDate.toInstant(), ZoneId.systemDefault());
        LocalDateTime ldtEndDate = LocalDateTime.ofInstant(startDate.toInstant(), ZoneId.systemDefault());
        long daysDiff = ChronoUnit.DAYS.between(ldtStartDate, ldtEndDate);
        return (int) daysDiff;
    }

    public static String format(Date date, String format) {
        if (StringUtils.isEmpty(format)) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static String format(Date date){
        return format(date,null);
    }

    public static Date ofDay(Integer year, Integer month, Integer day) {
        return of(year, month, day, null, null, null);
    }

    public static Date ofHour(Integer hour, Integer minute, Integer second) {
        return of(null, null, null, hour, minute, second);
    }

    public static Date of(Integer year, Integer month, Integer day, Integer hour, Integer minute, Integer second) {
        LocalDateTime dateTime = LocalDateTime.now();
        if (year != null) {
            dateTime = dateTime.withYear(year);
        }
        if (month != null) {
            dateTime = dateTime.withMonth(month);
        }
        if (day != null) {
            dateTime = dateTime.withDayOfMonth(day);
        }
        if (hour != null) {
            dateTime = dateTime.withHour(hour);
        }
        if (minute != null) {
            dateTime = dateTime.withMinute(minute);
        }
        if (second != null) {
            dateTime = dateTime.withSecond(second);
        }
        return Date.from(dateTime.atZone(ZoneId.of("Asia/Shanghai")).toInstant());
    }

    public static boolean isSection(Date startDate, Date endDate, Date nowDate) {
        if (nowDate.after(startDate) && nowDate.before(endDate)) {
            return true;
        }
        return false;
    }

}
