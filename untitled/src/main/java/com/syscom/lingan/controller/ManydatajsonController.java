package com.syscom.lingan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.syscom.lingan.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class ManydatajsonController {
    @RequestMapping("students")
    public String student() throws ParseException, JsonProcessingException {
        //設置時間
        Date day=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //轉JSON
        ObjectMapper mapper=new ObjectMapper();
        //指定日期格式
        mapper.setDateFormat(format);
        Student student=new Student(1, "凌安1", 25, "100.@qq.com", format.format(day), format2.format(day));
        Student student2=new Student(2, "凌安2", 25, "100.@qq.com", format.format(day), format2.format(day));
        Student student3=new Student(3, "凌安3", 25, "100.@qq.com", format.format(day), format2.format(day));
        Student student4=new Student(4, "凌安4", 25, "100.@qq.com", format.format(day), format2.format(day));
        Student student5=new Student(5, "凌安5", 25, "100.@qq.com", format.format(day), format2.format(day));
        //將資料加入list
        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        //序列化
        String str=mapper.writeValueAsString(list);
        return str;
    }
}
