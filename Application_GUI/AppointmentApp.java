/*
 * Team K
 * AppointmentApp.java
 * 21191026 NAKYUNG KIM, 21234175 DONGHYEOK LEE, 21247544 SHINGIRIRAYI MABIKA
 */



import javax.swing.JOptionPane;

public class AppointmentApp {

    public static void main(String args[]) {
        // declare variables
        int x = 0;

        String arrCustomerName[];
        arrCustomerName = new String[100];

        String arrDoctor[];
        arrDoctor = new String[100];

        String arrDate[];
        arrDate = new String[100];

        String arrTime[];
        arrTime = new String[100];

        // declare objects
        Function myFunction;

        // create objects
        myFunction = new Function();

        while (x != 4) {

            String[] options = { "Make an appointment", "Check my appointment schedule",
                    "Change my appointment schedule", "Delete my appointment schedule", "Exit application" };

            x = JOptionPane.showOptionDialog(null, "What do you want to do?",
                    "Click a button",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            // make an appointment

            if (x == 0) {

                // input
                myFunction.setCustomerName(arrCustomerName);
                myFunction.setDoctor(arrDoctor);
                myFunction.setDate(arrDate);
                myFunction.setTime(arrTime);

                // process
                myFunction.MakeAppointment();

                // check an appointment schedule

            } else if (x == 1) {

                // input
                myFunction.setCustomerName(arrCustomerName);
                myFunction.setDoctor(arrDoctor);
                myFunction.setDate(arrDate);
                myFunction.setTime(arrTime);

                // process
                myFunction.CheckAppointment();
            }

            // change an appointment schedule

            else if (x == 2) {

                // input
                myFunction.setCustomerName(arrCustomerName);
                myFunction.setDoctor(arrDoctor);
                myFunction.setDate(arrDate);
                myFunction.setTime(arrTime);

                // process
                myFunction.ChangeAppointment();

            }

            // delete an appointment schedule

            else if (x == 3) {

                // input
                myFunction.setCustomerName(arrCustomerName);
                myFunction.setDoctor(arrDoctor);
                myFunction.setDate(arrDate);
                myFunction.setTime(arrTime);

                // process
                myFunction.DeleteAppointment();

            }

            else if (x == 4) {
                JOptionPane.showMessageDialog(null, "Thank you! Bye.");
            }

            else {
                JOptionPane.showMessageDialog(null, "Please select menu again.");

            }
        }
    }
}