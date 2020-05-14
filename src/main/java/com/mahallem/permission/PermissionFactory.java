package com.mahallem.permission;

import com.mahallem.constants.PermissionType;
import com.mahallem.entity.Permission;
import com.mahallem.service.TaskService;
import com.mahallem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PermissionFactory {

    private final UserService userService;
    private final TaskService taskService;

    public PermissionOperation getPermission(Permission permission) {
        if (permission.getPermissionType().equals(PermissionType.ADD_HOME)) {
            return new HouseInclusionPermissionOperation(userService, permission);
        } else if (permission.getPermissionType().equals(PermissionType.ASSIGN_TASK)) {
            return new TaskAssignPermissionOperation(userService, taskService, permission);
        }
        return new NonOfPermission();
    }
}
