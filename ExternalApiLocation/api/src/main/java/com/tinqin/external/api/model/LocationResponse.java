package com.tinqin.external.api.model;


import com.tinqin.external.api.base.OperationOutput;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
public class LocationResponse implements OperationOutput {
    private String continent;
    private String country;
    private String city;

}
