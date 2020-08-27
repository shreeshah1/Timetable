public class Account {
    private String password;
    private String email;
    private boolean signedTOS;
    private UserName userName;
    private boolean isPublic;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSignedTOS() {
        return signedTOS;
    }

    public void setSignedTOS(boolean signedTOS) {
        this.signedTOS = signedTOS;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }
}