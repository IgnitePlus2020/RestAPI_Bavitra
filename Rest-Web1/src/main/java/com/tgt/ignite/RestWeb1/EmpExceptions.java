package com.tgt.ignite.RestWeb1;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody()
public class EmpExceptions extends RuntimeException {
    public EmpExceptions (String message) {
        super(message);
    }
}
