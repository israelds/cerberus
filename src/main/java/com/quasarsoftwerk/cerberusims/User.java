package com.quasarsoftwerk.cerberusims;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private BigInteger id;
    private String fullName;
    private String email;
    private String username;
    private String password;
    private String companyId;
}
