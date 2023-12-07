public class InternalUser{
    private int userid;

    private String firstname;

    private String middlename;

    private String lastname;

    private String email;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String zipCode;

    private String country;

    private String ssn;

    private String accessPrivilege;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1(){
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2(){
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        if(city.length() > 0)
        {
            this.city = city;
        }
        else
        {
            System.out.println("Invalid city");
        }
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        if(state.length() > 0)
        {
            this.state = state;
        }
        else
        {
            System.out.println("Invalid state");
        }
    }

    public String getZipCode(){
        return zipCode;
    }

    public void setZipCode(String zipCode){
        if(zipCode.length() > 0)
        {
            this.zipCode = zipCode;
        }
        else
        {
            System.out.println("Invalid zip code");
        }
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        if(country.length() > 0)
        {
            this.country = country;
        }
        else
        {
            System.out.println("Invalid country");
        }
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        if(ssn.length() > 0)
        {
            this.ssn = ssn;
        }
        else
        {
            System.out.println("Invalid SSN");
        }
    }

    public String getAccessPrivilege(){
        return accessPrivilege;
    }

    public void setAccessPrivilege(String accessPrivilege){
        if(accessPrivilege.length() > 0)
        {
            this.accessPrivilege = accessPrivilege;
        }
        else
        {
            System.out.println("Invalid access privilege");
        }
    }

    public Long getId() {
        return Long.valueOf(this.userid);
    }

    public String getLogDetail()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(" internaluser ").append(" userid :" ).append(userid)
                .append(" firstname : ").append(firstname)
                .append(" middlename : ").append(middlename)
                .append(" lastname : ").append(lastname)
                .append(" email : ").append(email)
                .append(" addressline1 :").append(addressLine1)
                .append(" addressline2 : ").append(addressLine2)
                .append(" city : ").append(city)
                .append(" state : ").append(state)
                .append(" zipcode :").append(zipCode)
                .append(" accessprivilege :").append(accessPrivilege);

        return sb.toString();
    }
}
