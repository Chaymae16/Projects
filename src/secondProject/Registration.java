package secondProject;
/*
9. Create Registration Class in which you would have
variables as email, userName and password that have
 an access scope only within its own class.After
 creating an object of the class user should be able
 to call methods and in each method separately pass
 values to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo B. Valid
userName and password cannot be empty and should be of
 length larger than 6 characters. Also valid password
 cannot contain userName.
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
            this.email=email;
            System.out.println(email);
        }else {
            System.out.println("Invalid email must end with Yahoo.com");
        }
    }
    public void setUserName(String userName){
        if (!userName.isEmpty() && userName.length()>6 ){
            this.userName=userName;
            System.out.println(userName);
        }else {
            System.out.println("Invalid username follow instruction");
        }
    }
    public void setPassword(String password){
        if (!password.isEmpty() && password.length()>6 ){
            if (!password.contains(userName)){
                this.password=password;
                System.out.println(password);
            }else {
                System.out.println("Invalid password Follow instruction");
            }
        }
    }

}
