# TDD
Test-Driven Development is a development technique that tells you to first write tests then write the code.  
It is a common and important technique that every developer must master.  
Tests can be unit tests and mock tests. Units (testable smallest element) meaning is a controversial ( is it a method or a class)
but you can think of the unit test as method testing and mocking as testing by creating mock (fake) objects. 
TDD development cycle: Write a test that fails-> Develop so that test passes-> Refactor the test->Repeat the process. 
You need to be careful when writing a test that fails, we need to test what we want our unit to do but not do.

### Example
There should be 2 different classes main and test. The main class should have your developement code and test file should have their tests.  
Let's say we want to create PhoneNumberValidator class. It is a util so we create "utils" file inside both main and test files.  
Now inside test/utils we create PhoneNumberValidatorTest and write following template.  

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneNumberValidatorTest{
  private PhoneNumberValidator UnderTest;
  
  @BeforeEach
  void setUp(){
    underTest = new PhoneNumberValidator();
  }
  
  @Test
  void itShouldValidatePhoneNumber(){
    //Given
    //When
    //Then
  } 
}
```
The code given above is going to fail because we do not have PhoneNumberValidator yet. So we create it.  
```java
//Inside main file
import java.util.function.Predicate;
public class PhoneNumberValidator implements Predicate<String>{
  @Override
  public boolean test(String string){
    return false;
  }
}
```
Now it passes. 
Now we refactor our test for a wanted case.
```java
//inside test file
@Test
  void itShouldValidatePhoneNumber(){
    //Given
    String phoneNumber="+447000000000";
    //When
    boolean isValid = underTest.test(phoneNumber);
    //Then
    assertThat(isValid).isTrue();
  } 
```
Now test fails because our developement code has no control mechanism for that case.  
Implementing validation for that case. 
```java
//Inside main file
import java.util.function.Predicate;
public class PhoneNumberValidator implements Predicate<String>{
  @Override
  public boolean test(String phoneNumber){
    return phoneNumber.startsWith("+44") &&
           phoneNumber.length() == 13;
  }
}
```
Now test passes. We want to add another test cases.
```java
//inside test file
@Test
  void itShouldValidatePhoneNumber(){
    //Given
    String phoneNumber="+447000000000";
    //When
    boolean isValid = underTest.test(phoneNumber);
    //Then
    assertThat(isValid).isTrue();
  }
  @Test
  @DisplayName("Should fail when length is bigger than 13")
  void itShouldValidatePhoneNumberWhenIncorrectAndHasLengthBiggerThan13(){
    //Given
    String phoneNumber="+447000000000888776";
    //When
    boolean isValid = underTest.test(phoneNumber);
    //Then
    assertThat(isValid).isFalse(); //It should fail so we check by isFalse()
  }
  
  @Test
  @DisplayName("Should fail when does not start with +")
  void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign(){
    //Given
    String phoneNumber="4470000000000";
    //When
    boolean isValid = underTest.test(phoneNumber);
    //Then
    assertThat(isValid).isFalse();
  }
```
We want to combine these tests to a single test (parameterized test) to make it look more neat and loosely coupled to parameters.  
By doing the following we do not have to create new methods for each different test case.  
```java
//inside test file
@ParameterizedTest
@CsvSource({"+447000000000,true",     //Input case and result are given by the CsvSource
            "+447000000000888776,false",
            "4470000000000,false"
}) 
  void itShouldValidatePhoneNumber(String phoneNumber, boolean expected){
    //No need for the "Given" line because input is already given by CsvSource
    //When
    boolean isValid = underTest.test(phoneNumber);
    //Then
    assertThat(isValid).isEqualTo(Boolean.valueOf(expected)); //Result is given by the CsvSource
  } 
```
At this stage, our tests are ready.  


Reference: Amigoscode,(1 June 2020), Test Driven Development (TDD) | Crash Course | 2020   
[https://www.youtube.com/watch?v=z6gOPonp2t0&t=928s]
