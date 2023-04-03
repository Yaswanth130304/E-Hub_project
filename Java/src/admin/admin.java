package admin;


import java.util.Date; //To retrieve the Current Date

import project.project;
import person.Person;
import client.client;
import employee.employee;


public class admin extends Person {
    private String adminID;
    private String password;

    public admin(){
        super();
        adminID = "ADM000";
        password = "admin";
    }

    
    public String getID() {
        return adminID;
    }

    public void setID(String adminID) {
        this.adminID = adminID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*

    This function takes a sorted array as input and finds first missing
    number in the array. In this function, there is a loop whose iterant's
    value starts from 1. It checks whether the iterant's value is equal to
    the array at the i-1th location. If it is different, it will return the
    value of i, which is the missing number.
    If there is no missing number, it will return the next number after all
    the numbers in the array.

    */
    protected int findMissingNumber(int[] arr){
        System.out.println("\n\nFinding the missing number");
        int i;
        for (i = 1; i <= arr.length; i++) {
            System.out.println(arr[i-1] +"\t"+i);
            if(i!=arr[i-1]){
                return i;
            }
        }
        return i;
    }

    public String assignID(){
    	/*function returns the assigned id*/
        return "you got the assign id using the dbms quires";
    }

    public String[] PersonList(client c){
    	/*returns the list of persons based on client*/
        String[]a={"this part is executed ","by using SQL methods"};
    	return a;
        
    }
    
    public String[] PersonList(employee emp){
    	/*returns the list of persons based on employee*/
        String[]a={"this part", " is executed ","by using"," SQL methods"};
    	return a;
    }

    public int AddPerson(employee E){
    	/*returns 0 if exception or else returns 1 if successful if it added employee or not*/
        return 0; 
    }

    public int AddPerson(client C){
    	/*returns 0 if exception or else returns 1 if successful if it added client or not*/
        return 0;
    }
    
    
    public void removePerson(client C){
    	/*removes a client person*/
    }
    public void removePerson(employee E){
    	/*removes a employee person*/
    }
    public String[] ProjectList(){
    	//This function below will list out all the projects which are approved
    	String[]a={"this ", "part", " is"," executed ","by"," using"," SQL methods"};
    	return a;
    }

    public String[] ProjectListAll(){
    	//This function below will list out all the projects
    	String[]a={"this"," part", " is"," executed ","by"," using"," SQL methods, in projectListAll()"};
    	return a;
    }

    public String[] ProjectListNotApproved(){
    	/*returns the list of projects which are not approved*/
    	String[]a={"this part", " is executed ","by using"," SQL methods"};
    	return a;
    }

    public String[] ProjectListChangesRequested(){
    	/*returns the list of projects which requrested changes*/
    	String[]a={"this part", " is executed ","by using"," SQL methods"};
    	return a;
    }


    public void approveProject(project P){
    	/*will just approve or reject the project*/
    }

    public void ProjectChanges(project P,String status){
    	//for approval or rejection of a change requested
    }

    public void addProjectLog(project P,String message){
    	//just adds the project logs
    }

    public void updateProjectStatus(project P, String status)
    {
        //updates the log for projects
    }

}