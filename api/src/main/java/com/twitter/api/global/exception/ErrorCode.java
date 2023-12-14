package com.twitter.api.global.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    // 400 Bad Request
    BAD_REQUEST(400, "Bad Request", "BR000"),
    INVALID_INPUT_VALUE(400, "Invalid input value", "BR001"),
    INVALID_VALUE_TYPES(400, "Invalid value types", "B002"),
    BODY_NOT_READABLE(400, "Request body is not readable", "BR003"),
    PARAMETER_REQUIRED(400, "Parameter is required", "BR004"),
    // 401 Unauthorized
    UNAUTHORIZED(401, "Unauthorized access", "UA000"),
    // 402 Payment Required
    PAYMENT_REQUIRED(402, "Payment required", "PR000"),
    // 403 Forbidden
    FORBIDDEN(403, "Forbidden", "F000"),
    // 404 Not Found
    NOT_FOUND(404, "Resource not found", "NF000"),
    // 405 Method Not Allowed
    METHOD_NOT_ALLOWED(405, "Invalid Method", "MNA000"),
    // 406 Not Acceptable
    NOT_ACCEPTABLE(406, "Not Acceptable", "NA000"),
    // 408 Request Timeout
    REQUEST_TIMEOUT(408, "Request Timeout", "RT000"),
    // 409 Conflict
    CONFLICT(409, "Conflict", "C000"),
    // 410 Gone
    GONE(410, "Gone", "G000"),
    // 411 Length Required
    LENGTH_REQUIRED(411, "Length Required", "LR000"),
    // 412 Precondition Failed
    PRECONDITION_FAILED(412, "Precondition Failed", "PF000"),
    // 413 Payload Too Large
    PAYLOAD_TOO_LARGE(413, "File size exceeds maximum limit", "P000"),
    // 415 Unsupported Media Type
    UNSUPPORTED_MEDIA_TYPE(415, "Media type not supported", "M000"),
    // 416 Requested Range Not Satisfiable
    MISDIRECTED_REQUEST(421, "Misdirected Request", "MR000"),
    // 422 Unprocessable Entity
    TOO_MANY_REQUESTS(429, "Too Many Requests", "TMR000"),
    // 500 Internal Server Error
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "ISE000"),
    // 502 Bad Gateway
    BAD_GATEWAY(502, "Bad Gateway", "BG000"),
    // 503 Service Unavailable
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "SU000"),
    // 504 Gateway Timeout
    GATEWAY_TIMEOUT(504, "Gateway Timeout", "GT000");

    private final int status;
    private final String message;
    private final String code;

    ErrorCode(final int status, final String message, final String code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}