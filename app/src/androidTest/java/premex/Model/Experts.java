package premex.Model;

public class Experts {
    public int id;
    public String NameExpert,Position,Gred,PositionStatus,ActiveStatus,PTj,Department,Unit,Ummail,OtherEmail;

    public Experts(int id, String nameExpert, String position, String gred, String positionStatus, String activeStatus, String PTj, String department, String unit, String ummail, String otherEmail) {
        this.id = id;
        this.NameExpert = nameExpert;
        this.Position = position;
        this.Gred = gred;
        this.PositionStatus = positionStatus;
        this.ActiveStatus = activeStatus;
        this.PTj = PTj;
        this.Department = department;
        this.Unit = unit;
        this.Ummail = ummail;
        this.OtherEmail = otherEmail;
    }

    public Experts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameExpert() {
        return NameExpert;
    }

    public void setNameExpert(String nameExpert) {
        NameExpert = nameExpert;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getGred() {
        return Gred;
    }

    public void setGred(String gred) {
        Gred = gred;
    }

    public String getPositionStatus() {
        return PositionStatus;
    }

    public void setPositionStatus(String positionStatus) {
        PositionStatus = positionStatus;
    }

    public String getActiveStatus() {
        return ActiveStatus;
    }

    public void setActiveStatus(String activeStatus) {
        ActiveStatus = activeStatus;
    }

    public String getPTj() {
        return PTj;
    }

    public void setPTj(String PTj) {
        this.PTj = PTj;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getUmmail() {
        return Ummail;
    }

    public void setUmmail(String ummail) {
        Ummail = ummail;
    }

    public String getOtherEmail() {
        return OtherEmail;
    }

    public void setOtherEmail(String otherEmail) {
        OtherEmail = otherEmail;
    }
}
