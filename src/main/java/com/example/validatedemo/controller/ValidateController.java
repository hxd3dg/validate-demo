package com.example.validatedemo.controller;

import com.example.validatedemo.util.BeanValidator;
import com.example.validatedemo.vo.TestVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author YZ
 * @Date 2020/3/24 17:23
 * @ClassName v
 */
@RestController
public class ValidateController {
    @PostMapping("/validator/json")
    @ResponseBody
    public String validator(@RequestBody TestVo vo){
        String s="";
        try {
            Map<String, String> validateobject = BeanValidator.validateobject(vo);
            if (validateobject != null && validateobject.entrySet().size() > 0){
                for (Map.Entry<String,String> entry:validateobject.entrySet()){
                    s+=entry.getValue()+",";
                }
                return s;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
