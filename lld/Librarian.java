public class Librarian {
    private String name;
    private int staffid;

    public Librarian(String name, int staffid)
 {
        this.name = name;
        this.staffid = staffid;
    }

    public String getName() 
{
        return name;
    }

    public int getStaffid() 
{
        return staffid;
    }

    @Override
    public String toString() {
        return "Name    : " + name + "\n" +
               "Staffid : " + staffid;
    }
}
