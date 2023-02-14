package oose;

import java.util.Arrays;

public class Appointment {

	public String arrCustomerName[] = new String[]{"AAA","BBB","CCC","DDD","EEE"};

	public String arrDoctor[] = new String[]{"Kim","Lee","Shingi","Kim","Lee"};

	public String arrDate[] =  new String[]{"2023-01-04","2023-01-28","2023-01-15","2023-01-07","2023-01-12"};

	public String arrTime[] = new String[]{"14:00","15:00","09:00","10:00","17:00"};
 
    
    public Appointment() {
   
    }
    
	
	@Override
	public String toString() {
		return "Reservation [arrCustomerName=" + Arrays.toString(arrCustomerName) + ", arrDoctor="
				+ Arrays.toString(arrDoctor) + ", arrDate=" + Arrays.toString(arrDate) + ", arrTime="
				+ Arrays.toString(arrTime) + "]";
	}
	

	public void CheckAppointment() {
		for(int i = 0; i < arrCustomerName.length; i++) {
		System.out.println((i+1)+"\n"+"\nCustomer's name: "+arrCustomerName[i]+"\nDoctor: "+arrDoctor[i]+"\nDate: "+arrDate[i]+"\nTime: "+arrTime[i]+"\n====================");
			
		}
		
	}

	public void ChangeAppointment() {
		for(int i = 0; i < arrCustomerName.length; i++) {
			if(arrCustomerName[i] == "BBB") {
				arrCustomerName[i]= "FFF";
				arrDoctor[i] = "Shingi";
				arrDate[i] = "2023-01-30";
				arrTime[i] = "15:00";
				//System.out.println("\nCustomer's name: "+arrCustomerName[i]+"\nDoctor: "+arrDoctor[i]+"\nDate: "+arrDate[i]+"\nTime: "+arrTime[i]+"\n====================");

			}

		}
		
	}
	
	public void DeleteAppointment() {
		for(int i = 0; i < arrCustomerName.length; i++) {
			if(arrCustomerName[i] == "AAA") {
				arrCustomerName[i]= null;
				arrDoctor[i] = null;
				arrDate[i] = null;
				arrTime[i] = null;
				//System.out.println("\nCustomer's name: "+arrCustomerName[i]+"\nDoctor: "+arrDoctor[i]+"\nDate: "+arrDate[i]+"\nTime: "+arrTime[i]+"\n====================");

			}
		}
	}


   
}
