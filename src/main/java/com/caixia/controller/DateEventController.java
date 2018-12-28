package com.caixia.controller;

import com.caixia.dao.DateEventMapper;
import com.caixia.entity.DateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @auther: LiChaoChao
 * @date: 2018-12-28
 */
@Controller
@RequestMapping("/dateEvent")
public class DateEventController {

    @Autowired
    private DateEventMapper dateEventMapper;

    @GetMapping("/list")
    @ResponseBody
    public List<DateEvent> listDateEvent(DateEvent dateEvent) {
        return dateEventMapper.listSelective(dateEvent);
    }

    @PostMapping("/save")
    @ResponseBody
    public List<DateEvent> saveDateEvent(DateEvent dateEvent) {
        Date now = new Date();
        dateEvent.setCreateTime(now);
        dateEvent.setUpdateTime(now);
        dateEventMapper.insertSelective(dateEvent);
        return this.listDateEvent(null);
    }

}
