package com.udemymasterspring.masterudemycourse.ConfigurationAndBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        /** Configuration classına ve bean metoduna ulaşmak için tanımladığımız bir obje */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationAndBean.class);

        /** Bean ismi ne ise onu metod içerisinde gönderiyoruz */
        System.out.println(context.getBean("name"));
    }

}
