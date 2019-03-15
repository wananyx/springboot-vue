package com.yx.adx.util.vo;

import com.yx.adx.util.constants.ErrorEnum;
import lombok.Data;

/**
 * 自定义异常结果类
 */

@Data
public class ExceptionResult {

    private int status;

    private String message;

    private long timestamp;

    public ExceptionResult(ErrorEnum em) {
        this.status = em.getErrorCode();
        this.message = em.getErrorMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
