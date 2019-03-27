package anaws.Proxy.ProxySubject;


import java.util.*;

public class Registrator{
	ArrayList<Registration> reg;
	public Registrator(){
		reg = new ArrayList<Registration>();
	}
	
	synchronized public boolean newRegistration(Registration _r){
		if(RegistrationNeeded(_r) == true){
			System.out.println("Nuova registrazione necessaria");
			reg.add(_r);
			return true;
		}
		else{
			System.out.println("Registrazione non necessaria");
			return false;
		}

	}
	synchronized private boolean RegistrationNeeded(Registration _r){
	
		for (Registration r: reg){
			System.out.println(r.getSensorNode().toString().equals(r.getSensorNode().toString()));
			if(r.equals(_r))
				return false;
			else if(r.getSensorNode().toString().equals(r.getSensorNode().toString())){
				if(r.getType() == _r.getType() && (_r.isCritic() == false && r.isCritic() == true)){
					System.out.println("Critico non corretto");
					return true;
				}
				else{
					System.out.println("Critico corretto");
					return false;
				}
			}
		}
		System.out.println("BELLA ZIIIII!!");
		return true;
	}
	synchronized public void removeRegistration(Registration _r){
		reg.remove(_r);
		System.out.println("Registrazione associata rimossa");

	}
}