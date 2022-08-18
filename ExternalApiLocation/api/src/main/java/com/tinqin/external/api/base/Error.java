package com.tinqin.external.api.base;

import org.springframework.http.HttpStatus;

public interface Error {
    HttpStatus getCode();
    String getMessage();
}
