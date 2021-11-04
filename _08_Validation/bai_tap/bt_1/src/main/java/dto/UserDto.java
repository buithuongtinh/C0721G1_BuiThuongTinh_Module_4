package dto;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto implements Validator {
    private Integer id;
    @NotEmpty (message = "khong duoc de trong truong nay")
    @Length(min=5,max = 45,message = "Do dai ten: 5 <= lastName <=45 ky tu")
    private String firstName;
    @NotBlank (message = "khong duoc de trong truong nay")
    @Length(min=5,max = 45,message = "Do dai ten: 5 <= lastName <=45 ky tu")
    private String lastName;

    //PhoneNumber
    @Pattern(regexp = "0(\\d{9}|\\d{10})", message = "SDT phai bat dau bang  0, co 10 - 11 so, va KHONG chua chu")
    private String phoneNumber;
    //tuoi
//    @Min(value = 18, message = "Tuoi phai >=18")
    @Min(18)
    private Integer age;

    //email
    @Pattern(regexp = "^[a-zA-Z0-9_]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$", message = "email phai dung dinh dang: email@gmail.com")
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto =(UserDto)  target;
        String phoneNumber =userDto.getPhoneNumber();
        if (!phoneNumber.startsWith("0")){
            errors.rejectValue("number","number.length","phone number must be start with 0");
        }
        if (phoneNumber.length()>11||phoneNumber.length()<10){
            errors.rejectValue("number","number.length","phone number must have 10 or 11 digit");
        }
        if (phoneNumber.matches("^[a-zA-Z]+$")){
            errors.rejectValue("number","number.containLetter","phone number NOT contain letter");
        }

    }
}
