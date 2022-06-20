import java.util.Scanner;

public class ServicingApplication{
     public static void main(String[] args){

          Scanner input = new Scanner(System.in);
          boolean option;
          int choice, servicingNum = 0;
          double sum_of_charges = 0;

           Servicing[] service1 = new Servicing[2];

           for(int j = 0; j < service1.length; j++){
               
               service1[j] = new Servicing();

          }

          for(int i = 0; i < service1.length; i++){

               System.out.println("Enter the servicing number : ");
               service1[i].setServicingNum(input.nextInt());
               input.nextLine();

               System.out.println("Enter the registration number : ");
               service1[i].setRegistrationNum(input.nextLine());

               System.out.println("Enter the owner name : ");
               service1[i].setOwnerName(input.nextLine());

               System.out.println("Enter total cost : ");
               service1[i].setCharge(input.nextDouble());

          }

          for(Servicing service: service1){
               
               System.out.println(service.getServicingNum());
               System.out.println(service.getRegistrationNum());
               System.out.println(service.getOwnerName());
               System.out.println(service.getCharge());

          }

          do{
               System.out.println("Option 1 : Create another object");
               System.out.println("Option 2 : Display the informations of your servicing number object");
               System.out.println("Option 3 : Display the average of the charges of all servicing objects");
               System.out.println("Option 4 : Press 0 to exit the program");
               choice = input.nextInt();

               if(choice == 0){
                    option = false;               
               }
               else{
                    option = true;
               }

               switch(choice){
                    case 1 :
                         Servicing newservice = new Servicing();
                         break;

                    case 2 :
                         System.out.println("Enter your servicing number :");
                         servicingNum = input.nextInt();

                         for(int k =0; k<service1.length; k++){
                              if(servicingNum == service1[k].getServicingNum()){
                                   service1[k].toStrings(service1[k]);
                              }

                         }
                         break;

                    case 3 :
                         for(int l = 0; l< service1.length; l++){
                              sum_of_charges += service1[l].getCharge();
                         }

                         System.out.println("The sum of charges is : " + sum_of_charges);
                         break;
                    
                    case 4 :
                         break;
               }

          }while(option = false);
          
     }
}