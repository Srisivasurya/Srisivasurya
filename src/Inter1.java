interface Details {

    float rate = 10.0f;
    int no_of_years=2;
    void show();
}

class Customer {

    String cust_name;
    int cust_id;
    Customer(String n,int i) {

        cust_name = n;
        cust_id = i;
    }

    void display() {

        System.out.println("Customer Name = "+cust_name);
        System.out.println("Customer Id = "+cust_id);
    }
}

class Account  extends Customer implements Details {

    int acc_no;
    float acc_bal;
    Account(String n,int i,int x,float y) {

        super(n,i);
        acc_no=x;
        acc_bal=y;
    }

    public void show() {

        display();
        System.out.println("Account No. = "+acc_no);
        System.out.println("Account Balance = "+acc_bal);
    }

    void interest() {

        show();
        float intr = (rate*acc_bal*no_of_years)/100;
        System.out.println("Interest = "+intr);
    }
}

class Inter {

    public static void main (String[] args)
    {
        Account ac = new Account("Surya",8,4052,5000);
        ac.interest();
    }
}