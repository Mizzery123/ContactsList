package sg.edu.rp.c346.contactslist;

/**
 * Created by 17000719 on 24/7/2018.
 */

public class Contacts {
    private String name;
    private int countrycode;
    private int phoneNum;

    public Contacts(String name, int countrycode, int phoneNum) {
        this.name = name;
        this.countrycode = countrycode;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", countrycode=" + countrycode +
                ", phoneNum=" + phoneNum +
                '}';
    }
}
