package com.mahallem.service;


import com.mahallem.dto.Request.PermissionAnswerRequest;
import com.mahallem.dto.Request.PermissionRequest;
import com.mahallem.dto.Response.PermissionResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PermissionService {

    PermissionResponse createUserToHouseRequest(String userId, PermissionRequest permissionRequest);

    Page<PermissionResponse> getAllPendingPermissionRequest(String userId, Pageable pageable);

    PermissionResponse approvePermissionRequest(String userId, PermissionAnswerRequest permissionAnswerRequest);
}
