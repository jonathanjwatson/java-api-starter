package abyss.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

  @RequestMapping("print")
  public String printThis() {
    System.out.println("Hello world");
    return "hello";
  }

  @RequestMapping(value = "return-json", method = RequestMethod.POST)
  public ResponseEntity<?> returnJSON() {
      ResponseEntity<?> responseEntity = new ResponseEntity("Hello", HttpStatus.OK);
      return responseEntity;
  }
}
