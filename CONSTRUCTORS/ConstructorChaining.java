// Create a Company class with inner Depart class that extends a Branch class. Use constructors to print messages when a company, branch, and department are created.

class Branch{
    String branchName;
    public Branch (String branchName){
        this.branchName = branchName;
        System.out.println("Branch constructor called: " + branchName);
    }
}
class Company{
    String companyName;
    public Company(String companyName){
        this.companyName = companyName;
        System.out.println("Company constructor called: " + companyName);
    }
    class Depart extends Branch {
        String depName;
        public Depart (String branchName,String depName){
            super(branchName);
            this.depName = depName;
            System.out.println("Department constructor called: " + depName);
        }     
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Company c1 = new Company("folio3");
        Company.Depart depart = c1.new Depart("Main branch", "HR");
    }
}