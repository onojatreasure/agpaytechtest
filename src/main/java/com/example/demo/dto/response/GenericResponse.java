package com.example.demo.dto.response;

import com.example.demo.enums.StatusCodes;
import com.example.demo.enums.StatusDescription;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class GenericResponse<T> {
    int statusCode;
    StatusDescription statusDescription;
    String message;
    T body;

    public GenericResponse(int statusCode, StatusDescription statusDescription, String message) {
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
        this.message = message;
    }


}
