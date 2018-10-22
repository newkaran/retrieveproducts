package com.hexa.retrieveproducts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * Special type of Exception Class.
 * @author Prabhakaran V
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ServiceUnavailableExceptionClass extends RuntimeException {

  /**
  * SerialVersionUID.
  */
  private static final long serialVersionUID = 1L;

  public ServiceUnavailableExceptionClass(String exception) {
    super(exception);
  }

}