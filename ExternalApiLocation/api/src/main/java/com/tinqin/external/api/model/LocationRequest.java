package com.tinqin.external.api.model;

import com.tinqin.external.api.base.OperationInput;
import lombok.*;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor

public class LocationRequest implements OperationInput {
    private Double latitude;
    private Double longitude;
}
