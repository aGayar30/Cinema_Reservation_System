package Entities;

public class Customer extends User{
    private String card;

    public Customer (String firstname,int age){
        super(firstname,age);
    }
    public Customer(String firstname, String lastname, int age, String gender) {
        super(firstname, lastname, age, gender);
        this.card = null;
    }

    public Customer(String firstname, String lastname, int age, String gender, String card) {
        super(firstname, lastname, age, gender);
        this.card = card;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "card='" + card + '\'' +
                ", id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
