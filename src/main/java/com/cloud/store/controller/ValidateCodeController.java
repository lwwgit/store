package com.cloud.store.controller;


import com.cloud.store.domain.entity.Msg;
import com.cloud.store.service.impl.SendMessageService;
import com.cloud.store.validate.ImageCode;
import com.cloud.store.validate.SmsCode;
import com.github.qcloudsms.httpclient.HTTPException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @Author: jitdc
 * @Date: 10:32 2018/6/29
 * @Description:  图片验证码接口
 */
@RestController
public class ValidateCodeController {
    @Autowired
    private SendMessageService sendMessageService;
    private Integer tmp;
    public static final String SESSION_KEY_IMAGE = "SESSION_KEY_IMAGE_CODE";
    public static final String SESSION_KEY_SMS = "SESSION_KEY_IMAGE_CODE";
    private String randString = "0123456789";//随机产生只有数字的字符串 private String
    //private String randString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//随机产生只有字母的字符串
    //private String randString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";//随机产生数字与字母组合的字符串
    private int width = 95;// 图片宽
    private int height = 30;// 图片高
    private int lineSize = 40;// 干扰线数量
    private int stringNum = 4;// 随机产生字符数量

    private static final Logger logger = LoggerFactory.getLogger(ValidateCodeController.class);

    private Random random = new Random();
    /**
     * @Author: jitdc
     * @Date: 16:42 2018/6/29
     * @Description: 图片验证码接口
     */
    @GetMapping("/code/image")
    public void createCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ImageCode imageCode = createImageCode(request);
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_KEY_IMAGE,imageCode);
        //获取session的Id
        String sessionId = session.getId();
        //判断session是不是新创建的
        if (session.isNew()) {
            System.out.println("生成验证码时session创建成功，session的id是："+sessionId);
        }else {
            System.out.println("生成验证码时服务器已经存在该session了，session的id是："+sessionId);
        }
        ImageIO.write(imageCode.getImage(),"JPEG",response.getOutputStream());
    }

//    @GetMapping("/code/sms")
//    public void createSmsCode(HttpServletRequest request, HttpServletResponse response, @RequestParam("mobile") String mobile) throws IOException, ServletRequestBindingException, HTTPException {
//        String smsCode1 = createSmsCode(request);
//        HttpSession session = request.getSession();
//        session.setAttribute(SESSION_KEY_SMS,smsCode1);
//       // String mobile = ServletRequestUtils.getRequiredStringParameter(request,"mobile");
//        //sendMessageService.sendMessage(mobile,smsCode1);
//        System.out.println("手机验证码是："+smsCode1);
//    }
    /**
     * @Author: jitdc
     * @Date: 16:42 2018/6/29
     * @Description: 手机验证码接口
     */
    @GetMapping("/code/sms/{mobile}")
    public String createSmsCode(HttpServletRequest request, @PathVariable("mobile") String mobile) throws IOException, ServletRequestBindingException, HTTPException {
        SmsCode smsCode1 = createSmsCode(request);
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_KEY_SMS,smsCode1);
        //sendMessageService.sendMessage(mobile,smsCode1);
        System.out.println("手机验证码是："+smsCode1.getCode());
        String res ="{\"code\":200,\"message\":\"发送成功\"}";
        return res;
    }
/**
 * @Author: jitdc
 * @Date: 16:36 2018/6/29
 * @Description: 验证验证码是否正确
 */
    @GetMapping("/code/{sms}")
    public Msg<?> checkSmsCode(HttpServletRequest request,@PathVariable("sms") String sms){
        HttpSession session = request.getSession();
        SmsCode smsCode = (SmsCode)session.getAttribute(SESSION_KEY_SMS);
        if (smsCode.getCode().equals(sms)){
            return new Msg<>(Msg.OK,"验证码正确",null);
        }
        else
            return new Msg<>(Msg.ERROR,"验证码错误",null);
    }
    /**
     * @Author: jitdc
     * @Date: 16:41 2018/6/29
     * @Description: 生成手机验证码
     */
    private SmsCode createSmsCode(HttpServletRequest request){
        String smsCode="";
        for (int i=0;i<4;i++) {
            tmp = new Random().nextInt(10);
            smsCode=smsCode+String.valueOf(tmp);
        }
        return  new SmsCode(smsCode,60);
    }
    /**
     * @Author: jitdc
     * @Date: 16:41 2018/6/29
     * @Description: 生成图形验证码
     */
    private ImageCode  createImageCode(HttpServletRequest request) {
        // BufferedImage类是具有缓冲区的Image类,Image类是用于描述图像信息的类
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        Graphics g = image.getGraphics();// 产生Image对象的Graphics对象,改对象可以在图像上进行各种绘制操作
        g.fillRect(0, 0, width, height);//图片大小
        g.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));//字体大小
        g.setColor(getRandColor(110, 133));//字体颜色
        // 绘制干扰线
        for (int i = 0; i <= lineSize; i++) {
            drowLine(g);
        }
        // 绘制随机字符
        String randomString = "";
        for (int i = 1; i <= stringNum; i++) {
            randomString = drowString(g, randomString, i);
        }
        logger.info("生成的验证码："+randomString);
        return new ImageCode(image,randomString,60);

    }
    /**
     * 获得字体
     */
    private Font getFont() {
        return new Font("Fixedsys", Font.CENTER_BASELINE, 18);
    }

    /**
     * 获得颜色
     */
    private Color getRandColor(int fc, int bc) {
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc - 16);
        int g = fc + random.nextInt(bc - fc - 14);
        int b = fc + random.nextInt(bc - fc - 18);
        return new Color(r, g, b);
    }
    /**
     * 绘制字符串
     */
    private String drowString(Graphics g, String randomString, int i) {
        g.setFont(getFont());
        g.setColor(new Color(random.nextInt(101), random.nextInt(111), random
                .nextInt(121)));
        String rand = String.valueOf(getRandomString(random.nextInt(randString
                .length())));
        randomString += rand;
        g.translate(random.nextInt(3), random.nextInt(3));
        g.drawString(rand, 13 * i, 16);
        return randomString;
    }
    /**
     * 绘制干扰线
     */
    private void drowLine(Graphics g) {
        int x = random.nextInt(width);
        int y = random.nextInt(height);
        int xl = random.nextInt(13);
        int yl = random.nextInt(15);
        g.drawLine(x, y, x + xl, y + yl);
    }

    /**
     * 获取随机的字符
     */

    public String getRandomString(int smsCode) {
        return String.valueOf(randString.charAt(smsCode));
    }
}
