package com.mahallem.eventBusses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class SubAbs implements Subscriber {
   public Channel channel;
}
