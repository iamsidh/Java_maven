package polymorphism.overriding;

public class HSBCBank extends RBI {

    public static void main(String[] args) {

        HSBCBank bank = new HSBCBank();
        
        RBI rbi = new RBI();

        System.out.println(bank.HomeLoanInterest());
        System.out.println(rbi.HomeLoanInterest());




    }

    public double HomeLoanInterest() {

        return 6.5;
    }

    public HSBCBank getObject(){

        HSBCBank bank = new HSBCBank();      //for q - Can we change return type performing overriding
                                             //Yes -- in case return type are ClassName
        return bank;
    }

}
