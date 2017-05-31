package com.gaussic.controller;

import com.gaussic.model.UserEntity;
import com.gaussic.repository.UserRepository;
import com.gaussic.util.ApiResult;
import com.google.gson.Gson;
import com.google.gson.JsonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/5/31.
 */
@Controller
@RequestMapping(value = "/api",produces = "application/json")
public class ApiController {
    @Autowired
    UserRepository userRepository;
    private static Gson gson=new Gson();

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    @ResponseBody
    public ApiResult json() {
        // 查询user表中所有记录
        List<UserEntity> userList = userRepository.findAll();
        return ApiResult.list("asd",userList);
    }

}
