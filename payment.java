package Activity6Diagram;

import java.sql.Date;

public class payment {

    private float amount;

    public payment(float amount) {

        this.amount = amount;

    }

public class Cash extends payment {

    private float cashTendred;

    public Cash(float amount, float cashTendred) {
        super(amount);
        this.cashTendred = cashTendred;
    }
    
}

public class Check extends payment {

    private String name;

    private String bankID;

    public Check(float amount, String name, String bankID) {

        super(amount);

        this.name = name;

        this.bankID = bankID;

    }

    public void authorized() {

    }

}

public class Credit extends payment{

	private String type;

	private String number;

	private Date expDate;

	

	public Credit(String type,String number,Date expDate) {

        super(amount);

        this.type=type;

        this.number=number;

        this.expDate=expDate;

	}

    public void authorized() {

    }

}

}


