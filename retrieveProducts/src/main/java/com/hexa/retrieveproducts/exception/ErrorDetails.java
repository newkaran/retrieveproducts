package com.hexa.retrieveproducts.exception;

import java.util.Date;

/**
 * To Form Error Details handled in Exception.
 * @author Prabhakaran V
 *
 */
public class ErrorDetails {
  private Date timestamp;
  private String message;
  private String details;
  
  /**
   * To Form Error Details.
   * @param timestamp time
   * @param message message
   * @param details details
   */
  public ErrorDetails(Date timestamp, String message, String details) {
    super();
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public Date getTimestamp() {
    return timestamp;
  }
  
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }
  
  public String getMessage() {
    return message;
  }
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public String getDetails() {
    return details;
  }
  
  public void setDetails(String details) {
    this.details = details;
  }
  
  
  
}