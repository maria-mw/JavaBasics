package Java_Basics.Lesson_6.HW;

public class BankEmployee extends Human implements PrintingInfo{
    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
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
        return "BankEmployee: " +
                "name = " + getName() +
                ", surname = " + getSurname() +
                ", bankName = " + getBankName();
    }

    public void printInformation() {
        System.out.println(toString());
    }
}
