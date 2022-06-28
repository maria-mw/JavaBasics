package Java_Basics.Lesson_6.HW;

public class Client extends Human implements PrintingInfo {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    private void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Client: " +
                "name = " + getName() +
                ", surname = " + getSurname() +
                ", bankName = " + getBankName();
    }


    public void printInformation() {
        System.out.println(toString());
    }
}
