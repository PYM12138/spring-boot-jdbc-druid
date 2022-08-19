package com.atguigu.springbootjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String, Object> index(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from bookmanagement");
        Map<String, Object> stringObjectMap =null;
        for (Map<String, Object> map : maps) {
            stringObjectMap = map;
        }
        return stringObjectMap;
    }

}
