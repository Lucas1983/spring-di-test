package com.example.di.dictionary;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum ConfigType {
  BASIC_XML("basic-xml"),
  COMPLEX_XML("complex-xml"),
  BASIC_JSON("basic-json"),
  COMPLEX_JSON("complex-json");

  private final String type;

  public static ConfigType from(String type) {

    return switch (type) {
      case "basic-xml" -> BASIC_XML;
      case "complex-xml" -> COMPLEX_XML;
      case "basic-json" -> BASIC_JSON;
      case "complex-json" -> COMPLEX_JSON;
      default -> throw new IllegalStateException("Unexpected value: " + type);
    };
  }
}
