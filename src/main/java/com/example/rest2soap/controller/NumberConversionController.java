package com.example.rest2soap.controller;

import com.dataaccess.webservicesserver.NumberConversionSoapType;
import java.math.BigInteger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConversionController {

  public NumberConversionController(NumberConversionSoapType client) {
    this.client = client;
  }

  private final NumberConversionSoapType client;

  @PostMapping("/NumberToWords")
  String numberToWordsString(@RequestBody BigInteger number) {
    return client.numberToWords(number);
  }

}
