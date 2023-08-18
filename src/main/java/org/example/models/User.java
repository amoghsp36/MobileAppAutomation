package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {
    private String email;
    private String password;
    private String fullName;
    private String mobile;
    private String membershipStartDate;

    public User(){

    }

    public User(String email, String password, String fullName, String mobile,String membershipStartDate) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.mobile = mobile;
        this.membershipStartDate=membershipStartDate;
    }
}
