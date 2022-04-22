package greenswap.auction.utils;

import java.time.LocalDateTime;


public class ApiResponse {

    // constructor based injection
    private final boolean success;
    private final String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    // getters
    public boolean isSuccess() {
        return success;
    }
    public String getMessage() {
        return message;
    }
    public String getTimestamp() {
        return LocalDateTime.now().toString();
    }

}
