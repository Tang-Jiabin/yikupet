package com.ykkoo.pet.utils;


import java.io.File;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 * 邮件工具
 *
 * @author J.Tang
 * @version V1.0
 * @email seven_tjb@163.com
 * @date 2018-11-09
 */

public class MailUtil {


    public static void sendMail(String toEmail,String subject, String content, File file) throws Exception
    {
        Properties pro = System.getProperties();
        pro.put("mail.smtp.host", "smtp.163.com");
        pro.put("mail.smtp.port", "25");
        pro.put("mail.smtp.auth", "true");
        pro.setProperty("mail.smtp.port", "465");
        pro.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        pro.setProperty("mail.smtp.socketFactory.fallback", "false");


        // 根据邮件会话属性和密码验证器构造一个发送邮件的session
        Session sendMailSession = Session.getDefaultInstance(pro,
                new Authenticator()
                {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication()
                    {
                        return new PasswordAuthentication("seven_tjb@163.com", "t928442988");
                    }
                });
        // 根据session创建一个邮件消息
        Message mailMessage = new MimeMessage(sendMailSession);
        // 设置邮件消息的发送者
        mailMessage.setFrom(new InternetAddress("seven_tjb@163.com"));
        // 创建邮件的接收者地址，并设置到邮件消息中
        mailMessage.setRecipient(Message.RecipientType.TO,
                new InternetAddress(toEmail));
        // 设置邮件消息的主题
        mailMessage.setSubject(subject);
        // 设置邮件消息发送的时间
        mailMessage.setSentDate(new Date());

        MimeMultipart multipart = new MimeMultipart("mixed");

        BodyPart messageBodyPart = new MimeBodyPart();

        messageBodyPart.setContent(content, "text/html; charset=utf-8");

        multipart.addBodyPart(messageBodyPart);

        if (file != null) {
            MimeBodyPart bodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(file);
            bodyPart.setDataHandler(new DataHandler(fds));
            bodyPart.setFileName(MimeUtility.encodeWord(file.getName()));
            multipart.addBodyPart(bodyPart);
        }


        mailMessage.setContent(multipart);
        // 发送邮件
        Transport.send(mailMessage);
    }
}
