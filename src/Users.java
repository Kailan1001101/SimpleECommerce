public abstract class Users {
    private String name;
    private String surname;
    private String email;
    private String password;

    public Users(String name,String surname,String email,String Password){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<5){
            System.out.println("Please Enter A password with greater then 5 characters");
        }
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.contains("@")){
            System.out.print("Please enter a valid email address");
        }
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
