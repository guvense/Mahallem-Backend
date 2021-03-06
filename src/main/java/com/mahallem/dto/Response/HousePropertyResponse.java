package com.mahallem.dto.Response;

import com.mahallem.constants.HousePropertyType;
import com.mahallem.service.HousePropertyService;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HousePropertyResponse {

    private HousePropertyType propertyType;

}
