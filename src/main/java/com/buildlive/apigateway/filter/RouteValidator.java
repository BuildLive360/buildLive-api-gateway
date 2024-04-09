package com.buildlive.apigateway.filter;

import org.slf4j.Logger;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/api/v1/auth/register",
            "/api/v1/auth/admin-register",
            "/api/v1/auth/user-login",
            "/api/v1/auth/verify-otp",
            "/api/v1/user/save-user",
            "/api/v1/user/verify-user",
            "/api/v1/auth/admin-verifyotp",
//            "/api/v1/auth/users/get-company",
//            "/api/v1/auth/users/get-company",
            "/eureka"
    );

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri-> request.getURI().getPath().contains(uri));


}
