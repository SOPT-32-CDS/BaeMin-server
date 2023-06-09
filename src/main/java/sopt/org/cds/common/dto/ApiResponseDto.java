package sopt.org.cds.common.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import sopt.org.cds.exception.ErrorStatus;
import sopt.org.cds.exception.SuccessStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiResponseDto<T> {
    private final int status;
    private final String message;
    private T data;

    public static ApiResponseDto success(SuccessStatus successStatus) {
        return new ApiResponseDto<>(successStatus.getHttpStatus().value(), successStatus.getMessage());
    }

    public static <T> ApiResponseDto<T> success(SuccessStatus successStatus, T data) { //enum type과 data를 가지고 새롭게 객체 생성
        return new ApiResponseDto<T>(successStatus.getHttpStatus().value(), successStatus.getMessage(), data); //code, message, data
    }

    public static ApiResponseDto error(ErrorStatus errorStatus) {
        return new ApiResponseDto<>(errorStatus.getHttpStatus().value(), errorStatus.getMessage()); //code, message
    }

    public static ApiResponseDto error(HttpStatus errorStatus, String message) {
        return new ApiResponseDto<>(errorStatus.value(), message); //code, message
    }


}
