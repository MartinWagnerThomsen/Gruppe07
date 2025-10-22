package Harry;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String mail;
    private boolean hasCredit;

    // Primary constructor med alle parametre
    public Customer(int id, String name, String phone, String mail, boolean hasCredit) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.hasCredit = hasCredit;  // RETTET: Bruger parameteren
    }

    // Alternative constructor (bruges i loadData)
    public Customer(int id, String name, String phone, String mail) {
        this(id, name, phone, mail, false);  // RETTET: Kalder primary constructor
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return mail;
    }

    public boolean hasCredit() {
        return hasCredit;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setHasCredit(boolean hasCredit) {
        this.hasCredit = hasCredit;
    }

    // Formateret customer info
    public String getCustomerInfo() {
        return "Customer Info:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Phone: " + phone + "\n" +
                "Mail: " + mail + "\n" +
                "Has Credit: " + (hasCredit ? "Yes" : "No");
    }

    @Override
    public String toString() {
        return getCustomerInfo();
    }
}