package CollectionFramework.Transient;

import java.util.Date;

public class SerializationDemo {

    public static void main(String[] args) {
        User user = getUser();
        String fileName = "D:\\HLD & LLD\\DesignPatterns\\src\\CollectionFramework\\Transient\\user.ser";
        UtilClass.serializeObject(fileName,user);

        User userObj = (User) UtilClass.deSerializeObject(fileName);
        System.out.println("User details " + userObj);
    }

    private static User getUser() {
        User user = new User();
        user.setName("TestUser");
        user.setPwd("TestPwd");
        user.setLoginDate(new Date());
        return user;
    }
}
