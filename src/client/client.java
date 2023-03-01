package client;

import person.Person;
import project.project;

public class client extends Person {
    public client() {
        super();
    }

    private String clientID;
    private int totalProjectsRequested;
    private int priority;
    private int Total_Orders;
    private String Company;
    private String[] person_id_list;
    private String[] person_name_list;

    public String getID() {
        return this.clientID;
    }

    public void setID(String clientID) {
        this.clientID = clientID;
    }

    public int getTotalProjectsRequested() {
        return this.totalProjectsRequested;
    }

    public void setTotalProjectsRequested(int totalProjectsRequested) {
        this.totalProjectsRequested = totalProjectsRequested;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getTotal_Orders() {
        return this.Total_Orders;
    }

    public void setTotal_Orders(int Total_Orders) {
        this.Total_Orders = Total_Orders;
    }

    public String getCompany() {
        return this.Company;
    }

    public String[] getPersonIdList() {
        return this.person_id_list;
    }

    public String[] getPersonNameList() {
        return this.person_name_list;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    protected int findMissingNumber(int[] arr) { 
    	// arr is sorted in ascending order, the arrays will have the numbers
        int i;
        for (i = 1; i <= arr.length; i++) {
            System.out.println(arr[i - 1] + "\t" + i);
            if (i != arr[i - 1]) {
                return i;
            }
        }
        return i;
    }

    public String assignID() {
    	/*function returns the assigned id*/
        return "you got the assign id using the dbms quires";
    }

    public void retrieve_TotalOrders(project p) {
    	/*returns the total number of orders*/
        
    }

    public void AddProject(project p) {
    	/*add a new project*/
        
    }

    public void suggestChanges(project P) {
    	/*updates the suggested changes*/
     }
    
    public void ProjectList(project P, String client_id) {
    	/*prints the list of project*/
     }

    public void ClientPriority() {
    	/*sorts according to payment status and amount*/
     }

}