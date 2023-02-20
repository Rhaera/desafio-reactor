package br.com.dio.desafioreactor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    public Long id;
    public String name;
    public String email;
    public String password;
    public Boolean isAdmin;

}
