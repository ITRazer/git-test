package cn.xulei.day29.domain;

public class emp {
    private String username;
    private String password;
    private String companyname;
    private String address;
    private String tel;
    private String email;
    private int superuserint;

    public emp(String username, String password, String companyname, String address, String tel, String email, int superuserint) {
        this.username = username;
        this.password = password;
        this.companyname = companyname;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.superuserint = superuserint;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSuperuserint() {
        return superuserint;
    }

    public void setSuperuserint(int superuserint) {
        this.superuserint = superuserint;
    }

    @Override
    public String toString() {
        return "emp{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", companyname='" + companyname + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", superuserint=" + superuserint +
                '}';
    }
}
