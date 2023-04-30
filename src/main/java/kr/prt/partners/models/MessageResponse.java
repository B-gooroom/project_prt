package kr.prt.partners.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MessageResponse {

    private String requestId;
    private LocalDateTime requestTime;
    private String statusCode;
    private String statusName;

//    public MessageResponse(String requestId, LocalDateTime requestTime, String statusCode, String statusName) {
//        this.requestId = requestId;
//        this.requestTime = requestTime;
//        this.statusCode = statusCode;
//        this.statusName = statusName;
//    }

//    public String getRequestId() {
//        return requestId;
//    }
//
//    public LocalDateTime getRequestTime() {
//        return requestTime;
//    }
//
//    public String getStatusCode() {
//        return statusCode;
//    }
//
//    public String getStatusName() {
//        return statusName;
//    }
}
