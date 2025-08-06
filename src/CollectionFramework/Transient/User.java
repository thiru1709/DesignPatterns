package CollectionFramework.Transient;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", loginDate=" + loginDate +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    private String name;
    private Date loginDate;
    private transient String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
