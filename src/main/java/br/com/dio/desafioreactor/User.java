package br.com.dio.desafioreactor;

@Getter
@Setter
public class User {

    public Long id;
    public String name;
    public String email;
    public String password;
    public Boolean isAdmin;

    public User(Long id,
                String name,
                String email,
                String password,
                Boolean isAdmin) {

        

    }
}
