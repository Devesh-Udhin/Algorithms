public class Servicing {
     private int servicingNum;
     private String registrationNum;
     private String ownerName;
     private double charge;
     
     public Servicing(){
          this.servicingNum = 0;
          this.registrationNum = " ";
          this.ownerName = " ";
          this.charge = 0.0;
     }

     public Servicing(int ServicingNum, String RegistrationNum, String OwnerName, double Charge){
          this.servicingNum = ServicingNum;
          this.registrationNum = RegistrationNum;
          this.ownerName = OwnerName;
          this.charge = Charge;
     }

     public void setServicingNum(int ServicingN){
          this.servicingNum = ServicingN;
     }

     public int getServicingNum(){
          return servicingNum;
     }

     public void setRegistrationNum(String RegistrationN){
          this.registrationNum = RegistrationN;
     }

     public String getRegistrationNum(){
          return registrationNum;
     }

     public void setOwnerName(String OwnerN){
          this.ownerName = OwnerN;
     }

     public String getOwnerName(){
          return ownerName;
     }

     public void setCharge(double Charge){
          this.charge = Charge;
     }

     public double getCharge(){
          return charge;
     }

     public void toStrings(Servicing currentservice){
          System.out.println("Servicing Number is " + Double.toString(currentservice.getServicingNum()));
          System.out.println("Regitration Number is " + currentservice.getRegistrationNum());
          System.out.println("Owner name is " + currentservice.getOwnerName());
          System.out.println("Total charge is " + Double.toString(currentservice.getCharge()));
     }

}

