package bai10;

public class c_person {
    // khai báo biến
    private String name, address;

    // Khơi tạo constructor
    /**
     * 
     * @param name
     * @param address
     */
    c_person(String n, String a) {
        name = n;
        address = a;
    }

    c_person() {

    }

    // setter getter
    /**
     * 
     * @param name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * 
     * @param address
     */
    public void setAddress(String a) {
        address = a;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public String toString() {
        return " ----- \n Name:" + this.getName() + "\n address: " + this.getAddress();
    }
}
