package edu.gdut.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
         /*
            需求:把下面文本中的座机电话，邮箱，手机号，热线都爬取出来。
            来黑马程序员学习Java，
            手机号:18512516758，18512508907或者联系邮箱:boniu@itcast.cn，
            座机电话:01036517895，010-98951256邮箱:bozai@itcast.cn，
            热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090

            手机号的正则表达式:1[3-9]\d{9}
            邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
            热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}

        */

        String s = "来黑马程序员学习Java，" +
                "电话:18512516758，18512508907" + "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" + "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";

        // 手机号的正则表达式:1[3-9]\d{9}
        String regex1 = "1[3-9]\\d{9}";
        // 邮箱的正则表达式:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}
        String regex2 = "\\w+@[[\\w&&[^_]]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        // 座机电话的正则表达式:θ\d{2,3}-?[1-9]\d{4,9}
        String regex3 = "θ\\d{2,3}-?[1-9]\\d{4,9}";
        // 热线电话的正则表达式:400-?[1-9]\\d{2}-?[1-9]\\d{3}
        String regex4 = "400-?[1-9]\\d{2}-?[1-9]\\d{3}";
        //pattern（图标范例）对象：正则表达式
        Pattern p1 = Pattern.compile(regex1+"|"+regex2+"|"+regex3+"|"+regex4);
        Matcher m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }

    }
}
