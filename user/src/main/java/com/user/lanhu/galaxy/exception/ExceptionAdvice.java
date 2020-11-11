package com.user.lanhu.galaxy.exception;

import com.user.lanhu.galaxy.exception.definitions.SampleException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice {
    /**
     * This is an example to show how to use user-defined exception
     * @param sampleException
     * @return
     */
    @ExceptionHandler(value = SampleException.class)
    public ResponseEntity<Object> exception(SampleException sampleException) {
        return new ResponseEntity<>(String.format("error: %s", sampleException.getMessage()), HttpStatus.BAD_REQUEST);
    }

}
