package zut.pba.models;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import zut.pba.models.Nationality;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-06T22:28:45.244316+01:00[Europe/Warsaw]")
public class User {

  private String firstName;

  private String lastName;

  private Integer age;

  private Long pesel;

  private Nationality nationality;

  private String email;

  /**
   * Default constructor
   * @deprecated Use {@link User#User(String, String, Integer, Integer, Nationality, String)}
   */
  @Deprecated
  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(String firstName, String lastName, Integer age, Long pesel, Nationality nationality, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.pesel = pesel;
    this.nationality = nationality;
    this.email = email;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull @Size(min = 2, max = 50) 
  @Schema(name = "firstName", example = "John", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @NotNull @Size(min = 2, max = 50) 
  @Schema(name = "lastName", example = "James", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * minimum: 0
   * maximum: 120
   * @return age
  */
  @NotNull @Min(0) @Max(120) 
  @Schema(name = "age", example = "26", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("age")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public User pesel(Long pesel) {
    this.pesel = pesel;
    return this;
  }

  /**
   * Get pesel
   * @return pesel
  */
  @NotNull 
  @Schema(name = "pesel", example = "99020541663", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pesel")
  public Long getPesel() {
    return pesel;
  }

  public void setPesel(Long pesel) {
    this.pesel = pesel;
  }

  public User nationality(Nationality nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @NotNull @Valid 
  @Schema(name = "nationality", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nationality")
  public Nationality getNationality() {
    return nationality;
  }

  public void setNationality(Nationality nationality) {
    this.nationality = nationality;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @javax.validation.constraints.Email
  @Schema(name = "email", example = "john@email.com", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.age, user.age) &&
        Objects.equals(this.pesel, user.pesel) &&
        Objects.equals(this.nationality, user.nationality) &&
        Objects.equals(this.email, user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age, pesel, nationality, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    pesel: ").append(toIndentedString(pesel)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

