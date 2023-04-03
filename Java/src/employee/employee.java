package employee;

import person.Person;


public class employee extends Person {
    private String Employee_ID;
    private String Employee_join_date;
    private String Domain;
    private int Experience;
    private int ProjectsWorked;
    private int ProjectsLed;

    public int getProjectsWorked() {
        return this.ProjectsWorked;
    }

    public void setProjectsWorked(int ProjectsWorked) {
        this.ProjectsWorked = ProjectsWorked;
    }

    public int getProjectsLed() {
        return this.ProjectsLed;
    }

    public void setProjectsLed(int ProjectsLed) {
        this.ProjectsLed = ProjectsLed;
    }

    public String getID() {
        return this.Employee_ID;
    }

    public void setID(String Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public String getEmployee_join_date() {
        return this.Employee_join_date;
    }

    public void setEmployee_join_date(String Employee_join_date) {
        this.Employee_join_date = Employee_join_date;
    }

    public String getDomain() {
        return this.Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public int getExperience() {
        return this.Experience;
    }

    public void setExperience(int Experience) {
        this.Experience = Experience;
    }

    protected int findMissingNumber(int[] arr) { //arr is sorted in ascending order, the arrays will have the numbers 
        int i;
        for (i = 1; i <= arr.length; i++) {
            System.out.println(arr[i - 1] + "\t" + i); 
            if (i != arr[i - 1]) {
                return i;
            }
        }
        return i;
    }

    public String assignID(){
    	/*returns the final id*/
        return "this is executd by SQL quires";
    }

}