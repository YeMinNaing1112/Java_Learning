package constructor;

public class ATMCard {
    int id;
    String name;
    double amount;
    static String bankName="KBZ";
    ATMCard(int i,String n,double a){
        this.id=i;
        this.name=n;
        this.amount=a;
    }
    void insert(double amount){
        this.amount+=amount;
        System.out.println(this.amount);
    }
    void withDraw(double amt){
        if (this.amount>=amt){
            this.amount-=amt;
            System.out.println(this.amount);
        }else{
            System.out.println("You don't have enough money");
        }
    }
    void showResult(){
        System.out.println(amount);

    }

    public static void main(String[] args) {
     ATMCard user1=new ATMCard(1,"Ye MIn Naing",10000);
        System.out.println(user1.id);
        System.out.println(user1.name);
        System.out.println(user1.amount);
        System.out.println(bankName);
        user1.insert(100000);
        user1.withDraw(100000);
        user1.showResult();
    }
}
