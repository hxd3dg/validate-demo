package com.example.validatedemo.vo;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @version:1.0.0
 * @author: lironghong
 * @date: 2019/4/18 16:36
 * @description:
 */
@Data
public class TestVo {
    @NotBlank(message = "信息不能为空")
    private String msg;
    @NotNull(message = "必须有值")
    private Integer id;
    @NotEmpty(message = "集合不能为空")
    private List<String> str;
}

