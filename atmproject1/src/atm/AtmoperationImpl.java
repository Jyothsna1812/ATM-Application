package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmoperationImpl implements atminterface{
	Map<Double,String> ministm = new HashMap<> ();
    Main atm = new Main();
	@Override
	public void viewBalance() {
		System.out.println("Available Balance:" + atm.getBalance() );
		
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%5 ==0) {
			if(withdrawAmount<atm.getBalance()) {
				System.out.println("Collect the cash" + withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministm.put(withdrawAmount, "Amount withdrawn");
				viewBalance();
				
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}
		else {
			System.out.println("Enter Amount in terms of 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Deposited Amount is:" + depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		ministm.put(depositAmount, "Deposited Successfully");
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		Set<Double> set=ministm.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministm.get(d));
		}
		
	}

}
