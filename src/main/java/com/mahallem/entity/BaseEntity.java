package com.mahallem.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
class BaseEntity {

    @Id
    private ObjectId id;

    private Date createDate;

    private Date updateDate;

    BaseEntity(){

        this.createDate=new Date();
        this.updateDate=new Date();

    }

}
