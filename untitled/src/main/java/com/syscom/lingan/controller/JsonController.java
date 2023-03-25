package com.syscom.lingan.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.syscom.lingan.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class JsonController {

    @RequestMapping("student")
    public String student() throws ParseException, JsonProcessingException {
//        現在時間
        Date day = new Date();
//        轉JSON
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper mapper2 = new ObjectMapper();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //指定日期格式
        mapper.setDateFormat(format);

        Student student = new Student(1, "Test", 25, "100.@qq.com", format.format(day), format2.format(day));

        System.out.println(format2.format(day));
        String str = mapper.writeValueAsString(student);

        System.out.println(str);
        return str;
    }
}
