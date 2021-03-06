package com.mahallem.dto.Response;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationSettingsResponse {

    private Boolean isEmail;

    private Boolean isSms;

    private Boolean isPushNotification;

}
