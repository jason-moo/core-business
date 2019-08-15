package com.xzn.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    /**
     * timestamp : 2019-08-15T08:14:01.138+0000
     * status : 500
     * error : Internal Server Error
     * message : 系统错误[ErrorType = ERROR_MESSAGE_DEFINITION, ErrorCode=E_10031]
     * path : /buyGood
     */

    private String timestamp;
    private int status;
    private String error;
    private String message;
    private String path;

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
