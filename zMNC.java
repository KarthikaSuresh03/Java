//The empid, name, designation, nationality, year of joining and salary of all the employees of a Multinational Company are stored in a table. Write a Java program using JDBC (i) to display the details of all the employees in the descending order of their salary (ii) to display the details of a given employee using empid (use GUI), (iii) to display the details of the employees of a given nationality and a given designation (iv) to delete the details of the employees who joined before a given year.

import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class empGUI extends JFrame implements ActionListener {

    JButton get;
    JTextField ip, op;
    JLabel idL, detailsL;
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/mnc","root","root");
    Statement stm = con.createStatement();

    empGUI() {

        super("Employee Details");
        setLayout(null);
        setSize(500, 400);
        get = new JButton("Get Details");
        ip = new JTextField();
        op = new JTextField();
        idL = new JLabel("Enter Employee ID");
        detailsL = new JLabel("Details");

        add(get);
        add(ip);
        add(op);
        add(idL);
        add(detailsL);

        idL.setBounds(10, 40, 200, 20);
        ip.setBounds(10, 70, 200, 20);
        get.setBounds(10, 100, 200, 25);
        detailsL.setBounds(10, 135, 200, 20);
        op.setBounds(10, 165, 500, 20);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        get.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        int id = Integer.parseInt(ip.getText());

        String qry = "select * from employee where empid = " + id;
        ResultSet rs = stm.executeQuery(qry);
        op.setText(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getDouble(6));
    }
}
public class zMNC {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/mnc","root","root");
        Statement stm = con.createStatement();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Microsoft Corporation");
        System.out.println("---------------------");
        System.out.println("\t1 Insert Employee Details");
        System.out.println("\t2 Display Employee Details");
        System.out.println("\t3 Delete Employee Details");
        System.out.println("\t4 Exit");
        System.out.println("\nEnter your Choice");
        int ch = scan.nextInt();
        
        switch(ch) {

            case 1 : {

                System.out.println("Enter Details");
                System.out.print("\tEmployee ID: ");
                int empid = scan.nextInt();
                System.out.print("\tName: ");
                String name = scan.nextLine();
                System.out.print("\tDesignation: ");
                String designation = scan.nextLine();
                System.out.print("\tNationality: ");
                String nationality = scan.nextLine();
                System.out.print("\tYear of Joining: ");
                int year = scan.nextInt();
                System.out.print("\tSalary");
                double salary = scan.nextDouble();

                String qry = "insert into employee(empid, name, designation, nationality, year, salary) values ("+empid+","+name+","+designation+","+nationality+","+year+","+salary+")";
                int exe = stm.executeUpdate(qry);
                if(exe == 1)
                    System.out.println("\nSuccessful...");
                else
                    System.out.println("\nFailed...");

            }
            case 2 : {

                System.out.println("Display");
                System.out.println("\t1 Based on Salary");
                System.out.println("\t2 Based on Employee ID");
                System.out.println("\t3 Based on Nationality");
                System.out.println("\t4 Based on Designation");
                System.out.println("\nEnter your Choice");
                int display = scan.nextInt();

				ResultSet rs;
                switch(display) {

                    case 1 : {

                        String qry = "select * from employee order by salary desc";
                        rs = stm.executeQuery(qry);
                        while (rs.next()) {

                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getDouble(6));
                        }
                    }     
                    case 2 : {

                        empGUI g = new empGUI();
                    }
                    case 3 : {

                        System.out.println("Enter Nationality");
                        String nation = scan.nextLine();

                        String qry = "select * from employee where nationality = " + nation;
                        rs = stm.executeQuery(qry);                
                    }
                    case 4 : {

                        System.out.println("Enter Designation");
                        String des = scan.nextLine();

                        String qry = "select * from employee where designation = " + des;
                        rs = stm.executeQuery(qry);                
                    }
                    default: {

                        System.out.println("ERROR: INVALID CHOICE!");
                    }
                }
                while (rs.next()) {

                    System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getDouble(6));
                }
            }
            case 3 : {

                System.out.println("Enter the year");
                int yr = scan.nextInt();

                String qry = "delete from employee where year <= " + yr;
                int exe = stm.executeUpdate(qry);
                if(exe == 1)
                    System.out.println("Data Deleted...");
                else
                    System.out.println("Deletion Failed...");
            }
            case 4 : {

                System.out.println("ThankYou.. Have a Nice Day!");
                stm.close();
                con.close();

                System.out.println("Exiting...");
                System.exit(0);
            }
        }

    }
}
