package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ChenMo
 * @date 2021/5/12 - 20:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private Long id;
    private String serial;

}
