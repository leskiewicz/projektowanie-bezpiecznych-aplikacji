package zut.pba.api;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import zut.pba.models.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-06T22:28:45.244316+01:00[Europe/Warsaw]")
@Controller
@RequestMapping("${openapi.projektowanieBezpiecznychAplikacjiLab03.base-path:}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;
    private final Map<String, User> userDatabase = new HashMap<>(); // Prosta baza danych w pamięci

    @Autowired
    public UserApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<User> createUser(String xRequestID, OffsetDateTime xDate, User user) {
        if (user == null || user.getFirstName() == null) {
            return ResponseEntity.badRequest().build(); // 400 Bad Request
        }
        userDatabase.put(user.getFirstName(), user);
        return ResponseEntity.status(201).body(user); // 201 Created
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username, String xRequestID, OffsetDateTime xDate) {
        if (!userDatabase.containsKey(username)) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        userDatabase.remove(username);
        return ResponseEntity.noContent().build(); // 204 No Content
    }

    @Override
    public ResponseEntity<User> getUserByName(String username, String xRequestID, OffsetDateTime xDate) {
        User user = userDatabase.get(username);
        if (user == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        return ResponseEntity.ok(user); // 200 OK
    }

    @Override
    public ResponseEntity<User> updateUser(String username, String xRequestID, OffsetDateTime xDate, User user) {
        if (!userDatabase.containsKey(username)) {
            return ResponseEntity.notFound().build(); // 404 Not Found
        }
        if (user == null) {
            return ResponseEntity.badRequest().build(); // 400 Bad Request
        }
        user.setFirstName(username); // Upewniamy się, że użytkownik ma poprawne username
        userDatabase.put(username, user);
        return ResponseEntity.ok(user); // 200 OK
    }
}
