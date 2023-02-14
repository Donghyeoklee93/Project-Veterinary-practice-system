/*
 * Team K
 * Junit code
 * 21191026 NAKYUNG KIM, 21234175 DONGHYEOK LEE, 21247544 SHINGIRIRAYI MABIKA
 */

package test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import oose.Appointment;

@TestMethodOrder(OrderAnnotation.class)
class Testing {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Application started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Application ended");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("method started");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("method ended");
	}

	@Test
	@Order(1)
	void CheckAppointment() {
		Appointment aa = new Appointment();
		 
		 String arrCustomerName_check[] = new String[]{"AAA","BBB","CCC","DDD","EEE"};

		 String arrDoctor_check[] = new String[]{"Kim","Lee","Shingi","Kim","Lee"};

		 String arrDate_check[] = new String[]{"2023-01-04","2023-01-28","2023-01-15","2023-01-07","2023-01-12"};

		 String arrTime_check[] = new String[]{"14:00","15:00","09:00","10:00","17:00"};
	
		assertArrayEquals(aa.arrCustomerName, arrCustomerName_check);
		assertArrayEquals(aa.arrDoctor, arrDoctor_check);
		assertArrayEquals(aa.arrDate, arrDate_check);
		assertArrayEquals(aa.arrTime, arrTime_check);
		
	}


	@Test
	@Order(2)
	void ChangeAppointment() {
			Appointment aa = new Appointment();
		
		  String arrCustomerName_check[] = new String[]{"AAA","FFF","CCC","DDD","EEE"};

		  String arrDoctor_check[] = new String[]{"Kim","Shingi","Shingi","Kim","Lee"};

		  String arrDate_check[] = new String[]{"2023-01-04","2023-01-30","2023-01-15","2023-01-07","2023-01-12"};

		  String arrTime_check[] = new String[]{"14:00","15:00","09:00","10:00","17:00"};
		  
		for(int i = 0; i < 5; i++) {
			if(aa.arrCustomerName[i] == "BBB") {
				aa.arrCustomerName[i] = "FFF";
				aa.arrDoctor[i] = "Shingi";
				aa.arrDate[i] = "2023-01-30";
				aa.arrTime[i] = "15:00";
			assertEquals(aa.arrCustomerName[1], arrCustomerName_check[1]);
			assertEquals(aa.arrDoctor[1], arrDoctor_check[1]);
			assertEquals(aa.arrDate[1], arrDate_check[1]);
			assertEquals(aa.arrTime[1], arrTime_check[1]);
			
				}
			
			}
		
	
			

		
	   }
	
	
	@Test()
	@Order(3)
	void DeleteAppointment() {
		Appointment aa = new Appointment();

		for(int i = 0; i < 5; i++) {
			if(aa.arrCustomerName[i] == "AAA") {
			aa.arrCustomerName[i] = null;
			aa.arrDoctor[i] = null;
			aa.arrDate[i] = null;
			aa.arrTime[i] = null;
			}
			
			assertNull(aa.arrCustomerName[0]);
			assertNull(aa.arrDoctor[0]);
			assertNull(aa.arrDate[0]);
			assertNull(aa.arrTime[0]);
	
				}
			}
	
	
	
		@Disabled("Disabled until bug issue has been resolved")
		@Test()
		@Order(4)
		void MakeAppointment(){
			System.out.println("Disabled Method");
		}
		
}//class*/
