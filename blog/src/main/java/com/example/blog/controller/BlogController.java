package com.example.blog.controller;

import com.example.blog.vo.member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {

    @RequestMapping(value="/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "hello, jeonghye.";

    }

    @RequestMapping(value="/getInfo", method = RequestMethod.GET)
    public member getInfo(){
        member member = new member(1, "jeonghye.im","jeonghye@naver.com");

        return member;

    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public List<member> list(){

        List<member> memberList = Arrays.asList(
                new member[]{
                        new member(1, "jeonghye", "j@naver.com"),
                        new member(2, "jeonghye", "j@naver.com"),
                        new member(3, "jeonghye", "j@naver.com")
                }
        );

//        long startTime = System.currentTimeMillis();
//        for(member member : memberList){
//            System.out.println(member);
//        }
//
//        System.out.println("for-each"+(System.currentTimeMillis()-startTime)+"ms");


        memberList.forEach(System.out::println);
        return memberList;

    }

}