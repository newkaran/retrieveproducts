package com.hexa.retrieveproducts.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * This class is a customized Exception Class.
 * @author Prabhakaran V
 *
 */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityHandler extends ResponseEntityExceptionHandler {

  /**
   * To Handle  ServiceUnavailableExceptionClass exception from the application.
   * @param ex  exception
   * @param request request
   * @return
   */
  @ExceptionHandler(ServiceUnavailableExceptionClass.class)
  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(
      ServiceUnavailableExceptionClass ex, WebRequest request) {
    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
        request.getDescription(false));
    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
  }
}