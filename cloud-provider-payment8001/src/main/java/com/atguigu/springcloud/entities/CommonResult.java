package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChenMo
 * @date 2021/5/12 - 20:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
