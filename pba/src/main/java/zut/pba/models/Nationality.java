package zut.pba.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets Nationality
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-06T22:28:45.244316+01:00[Europe/Warsaw]")
public enum Nationality {
  
  PL("PL"),
  
  DE("DE"),
  
  UK("UK");

  private String value;

  Nationality(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Nationality fromValue(String value) {
    for (Nationality b : Nationality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

