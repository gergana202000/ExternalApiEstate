package com.tinqin.external.api.error;

import com.tinqin.external.api.base.Error;
import org.springframework.http.HttpStatus;

public class LocationNotFound implements Error {
    @Override
    public HttpStatus getCode() {
        return HttpStatus.NOT_FOUND;
    }

    @Override
    public String getMessage() {
        return "Location not found!";
    }
}
