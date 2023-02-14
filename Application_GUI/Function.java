/*
 * Team K
 * function.java
 * 21191026 NAKYUNG KIM, 21234175 DONGHYEOK LEE, 21247544 SHINGIRIRAYI MABIKA
 */



import java.util.Arrays;

import javax.swing.JOptionPane;

public class Function {
    // data members
    private String arrCustomerName[] = new String[100];
    private String arrDoctor[] = new String[100];
    private String arrDate[] = new String[100];
    private String arrTime[] = new String[100];
    int i = 0;

    // constructor
    public Function() {
    }

    // set methods - one for every input
    public void setCustomerName(String arrCustomerName[]) {
        this.arrCustomerName = arrCustomerName;
    }

    public void setDoctor(String arrDoctor[]) {
        this.arrDoctor = arrDoctor;
    }

    public void setDate(String arrDate[]) {
        this.arrDate = arrDate;
    }

    public void setTime(String arrTime[]) {
        this.arrTime = arrTime;
    }


    // compute - process
    // make an appointment
    public void MakeAppointment() {
        String confirm = "no";
        while (confirm.equals("no")) {

            String name = "true";
            while (name.equals("true")) {
                arrCustomerName[i] = JOptionPane.showInputDialog(null, "Please write your name");

                if (arrCustomerName[i] == null) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter your name");

                } else {
                    name = "false";
                }
            }

            String doctor = "true";
            while (doctor == "true") {

                String[] selectionValues = { "Dr.KIM", "Dr.LEE", "Dr.SHING" };
                String initialSelection = "Veterinarian";
                Object selection = JOptionPane.showInputDialog(null, "Which veterinerian do you want to see?",
                        "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionValues,
                        initialSelection);
                arrDoctor[i] = (String) selection;

                if (arrDoctor[i] == null) {
                    JOptionPane.showMessageDialog(null,
                            "Please select the doctor you want");

                } else {
                    doctor = "false";
                }
            }

            String month = "true";
            while (month == "true") {

                String[] selectionMonth = { "01/2023", "02/2023", "03/2023" };
                String initialSelectionMonth = "Month";
                Object selectionMonths = JOptionPane.showInputDialog(null,
                        "Which month do you want to see the doctor?",
                        "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionMonth,
                        initialSelectionMonth);

                if ((String) selectionMonths == "01/2023") {
                    String date = "true";
                    while (date == "true") {

                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                                "26", "27", "28", "29", "30", "31" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);

                        if (selectionDates != null) {
                            arrDate[i] = (String) selectionDates + "/" + (String) selectionMonths;
                            date = "false";
                            month = "false";

                        } else {
                            JOptionPane.showMessageDialog(null, "Please input the date you want");
                            month = "false";
                        }
                    }

                } else if ((String) selectionMonths == "02/2023") {
                    String date = "true";
                    while (date == "true") {

                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                                "26", "27", "28" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);

                        if (selectionDates != null) {
                            arrDate[i] = (String) selectionDates + "/" + (String) selectionMonths;
                            date = "false";
                            month = "false";

                        } else {
                            JOptionPane.showMessageDialog(null, "Please input the date you want");
                            month = "false";
                        }
                    }

                } else if ((String) selectionMonths == "03/2023") {

                    String date = "true";
                    while (date == "true") {

                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
                                "26", "27", "28", "29", "30", "31" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);

                        if (selectionDates != null) {
                            arrDate[i] = (String) selectionDates + "/" + (String) selectionMonths;
                            date = "false";
                            month = "false";

                        } else {
                            JOptionPane.showMessageDialog(null, "Please input the date you want");
                            month = "false";
                        }
                    }

                } else if (selectionMonths == null) {
                    JOptionPane.showMessageDialog(null,
                            "Please select the month you want");

                } else {
                    month = "false";
                }
            }


            String answer = "true";
            while (answer == "true") {

                String time = "true";
                while (time == "true") {

                    String[] selectionTime = { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00",
                            "16:00", "17:00", "18:00" };
                    String initialSelectionTime = "Time";
                    Object selectionTimes = JOptionPane.showInputDialog(null,
                            "What time do you want to see the doctor?",
                            "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionTime,
                            initialSelectionTime);
                    arrTime[i] = (String) selectionTimes;

                    if (arrTime[i] == null) {
                        JOptionPane.showMessageDialog(null,
                                "Please select the time you want");

                    } else {
                        time = "false";
                    }
                }

                if (i != 0) {
                    for (int z = 0; z < i; z++) {

                        if (arrDoctor[i].equals(arrDoctor[z]) && arrDate[i].equals(arrDate[z])
                                && arrTime[i].equals(arrTime[z])) {
                            JOptionPane.showMessageDialog(null,
                                    "The Doctor already has another appointment at that time");

                        } else {
                            answer = "false";
                        }
                    }
                    
                } else {
                    answer = "false";
                }
            }

            confirm = JOptionPane.showInputDialog(null, "Your appointment schedule is"
                    + "\nCustomer Name :" + arrCustomerName[i]
                    + "\nDoctor :" + arrDoctor[i]
                    + "\nDate :" + arrDate[i]
                    + "\nTime :" + arrTime[i]
                    + "\nIf it's okay, please write 'yes'"
                    + "\nIf it's not okay, please write 'no'");
        }
        i = i + 1;
    }

    // check appointment
    public void CheckAppointment() {
        String CustomerName;
        CustomerName = JOptionPane.showInputDialog(null, "Plese enter your name.");
        boolean contains = Arrays.stream(arrCustomerName).anyMatch(CustomerName::equals);

        for (int k = 0; k < arrDoctor.length; k++) {

            if (arrCustomerName[k] != null && arrCustomerName[k].equals(CustomerName)) {
                JOptionPane.showMessageDialog(null, "Your appointment schedule is"
                        + "\nCustomer Name :" + arrCustomerName[k]
                        + "\nDoctor :" + arrDoctor[k]
                        + "\nDate :" + arrDate[k]
                        + "\nTime :" + arrTime[k]);
                break;

            } else if (contains == false) {
                JOptionPane.showMessageDialog(null, "You don't have any appointment schedule yet");
                break;
            }
        }
    }

    // chage appointment
    public void ChangeAppointment() {
        String CustomerName;
        CustomerName = JOptionPane.showInputDialog(null, "Plese write your name.");
        boolean contains = Arrays.stream(arrCustomerName).anyMatch(CustomerName::equals);

        for (int m = 0; m < arrDoctor.length; m++) {

            if (arrCustomerName[m] != null && arrCustomerName[m].equals(CustomerName)) {
                String change;
                change = JOptionPane.showInputDialog(null, "Your appointment schedule is"
                        + "\nCustomer Name :" + arrCustomerName[m]
                        + "\nDoctor :" + arrDoctor[m]
                        + "\nDate :" + arrDate[m]
                        + "\nTime :" + arrTime[m]
                        + "\nDo you want to change the appointment shedule?(yes/no)");

                if (change.equals("yes")) {
                    String[] selectionValues = { "Dr.KIM", "Dr.LEE", "Dr.SHING" };
                    String initialSelection = "Veterinarian";
                    Object selection = JOptionPane.showInputDialog(null,
                            "Which veterinerian do you want to see?",
                            "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionValues,
                            initialSelection);
                    arrDoctor[m] = (String) selection;
                    String[] selectionMonth = { "01/2023", "02/2023", "03/2023" };
                    String initialSelectionMonth = "Month";
                    Object selectionMonths = JOptionPane.showInputDialog(null,
                            "Which month do you want to see the doctor?",
                            "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionMonth,
                            initialSelectionMonth);

                    if ((String) selectionMonths == "01/2023") {
                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                                "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                                "25",
                                "26", "27", "28", "29", "30", "31" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);
                        arrDate[m] = (String) selectionDates + "/" + (String) selectionMonths;

                    } else if ((String) selectionMonths == "02/2023") {
                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                                "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                                "25",
                                "26", "27", "28" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);
                        arrDate[m] = (String) selectionDates + "/" + (String) selectionMonths;

                    } else {
                        String[] selectionDate = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                                "11",
                                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24",
                                "25",
                                "26", "27", "28", "29", "30", "31" };
                        String initialSelectionDate = "Date";
                        Object selectionDates = JOptionPane.showInputDialog(null,
                                "Which date do you want to see the doctor?",
                                "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionDate,
                                initialSelectionDate);
                        arrDate[m] = (String) selectionDates + "/" + (String) selectionMonths;
                    }

                    String answer = "true";
                    while (answer == "true") {

                        String time = "true";
                        while (time == "true") {

                            String[] selectionTime = { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00",
                                    "15:00",
                                    "16:00", "17:00", "18:00" };
                            String initialSelectionTime = "Time";
                            Object selectionTimes = JOptionPane.showInputDialog(null,
                                    "What time do you want to see the doctor?",
                                    "Make an appointment", JOptionPane.QUESTION_MESSAGE, null, selectionTime,
                                    initialSelectionTime);
                            arrTime[m] = (String) selectionTimes;

                            if (arrTime[m] == null) {
                                JOptionPane.showMessageDialog(null,
                                        "Please select the time you want");

                            } else {
                                time = "false";
                            }
                        }

                        if (m != 0) {

                            for (int z = 0; z < m; z++) {

                                if (arrDoctor[m].equals(arrDoctor[z]) && arrDate[m].equals(arrDate[z])
                                        && arrTime[m].equals(arrTime[z])) {
                                    JOptionPane.showMessageDialog(null,
                                            "The Doctor already has another appointment at that time");
                                } else {
                                    answer = "false";
                                }
                            }
                        } else {
                            answer = "false";
                        }
                    }

                    break;

                } else if (change.equals("no")) {
                    break;
                }

            } else if (contains == false) {
                JOptionPane.showMessageDialog(null, "You don't have any appointment schedule yet");
                break;
            }
        }
    }

    // Delete appointment
    public void DeleteAppointment() {
        String CustomerName;
        CustomerName = JOptionPane.showInputDialog(null, "Plese write your name.");
        boolean contains = Arrays.stream(arrCustomerName).anyMatch(CustomerName::equals);

        for (int j = 0; j < arrDoctor.length; j++) {

            if (arrCustomerName[j] != null && arrCustomerName[j].equals(CustomerName)) {
                String change;
                change = JOptionPane.showInputDialog(null, "Your appointment schedule is"
                        + "\nCustomer Name :" + arrCustomerName[j]
                        + "\nDoctor :" + arrDoctor[j]
                        + "\nDate :" + arrDate[j]
                        + "\nTime :" + arrTime[j]
                        + "\nDo you want to delete the appointment shedule?(yes/no)");

                if (change.equals("yes")) {
                    arrCustomerName[j] = "null";
                    arrDoctor[j] = "null";
                    arrDate[j] = "null";
                    arrTime[j] = "null";
                    JOptionPane.showMessageDialog(null, "Complete to delete!");
                    break;

                } else if (change.equals("no")) {
                    break;
                }

            } else if (contains == false) {
                JOptionPane.showMessageDialog(null, "You don't have any appointment schedule yet");
                break;
            }
        }
    }
}
