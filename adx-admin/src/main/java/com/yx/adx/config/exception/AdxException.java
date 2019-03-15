package com.yx.adx.config.exception;

import com.yx.adx.util.constants.ErrorEnum;
import lombok.Getter;

/**
 * 自定义异常类，通过枚举方式返回错误码及错误信息
 */
@Getter
public class AdxException extends RuntimeException {

    private ErrorEnum errorEnum;

    public AdxException(ErrorEnum errorEnum){
        this.errorEnum = errorEnum;
    }

}
