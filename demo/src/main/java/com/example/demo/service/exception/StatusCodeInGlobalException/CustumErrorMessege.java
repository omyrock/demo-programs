package com.example.demo.service.exception.StatusCodeInGlobalException;

  record CustomErrorMessage(int status,
                            String message,
                            long timeStamp) {

}
