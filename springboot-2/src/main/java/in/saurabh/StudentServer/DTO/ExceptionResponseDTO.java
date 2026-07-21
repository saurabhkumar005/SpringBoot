package in.saurabh.StudentServer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime timestamp;
    private int statuscode;
    private String message;
    private String error;
    private String path;
}
