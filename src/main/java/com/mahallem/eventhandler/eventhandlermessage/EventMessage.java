package com.mahallem.eventhandler.eventhandlermessage;

import com.mahallem.eventmodel.EventMessageModel;
import com.mahallem.eventsender.ClientInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventMessage  {

    private ClientInfo client;

    private EventMessageModel content;

}
