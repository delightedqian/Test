package io.delightedqian.d9_exception_custom;

/**
 * Project Name: AgeIllegalException
 * Description:
 * USER: ChenXiaoqian
 * DATE:  2022/4/17
 * TIME:  21:00
 */
public class AgeIllegalRuntimeException extends RuntimeException{

    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
