public class App {
    public static void main(String[] args) throws Exception {

        // FOR LOOP
        for (int firstNameCount =5 ; firstNameCount!= 0; firstNameCount--) {
            if (firstNameCount == 4) {
                System.out.println("Wait! Timeout! I need to go to the bathroom!");
                break;
            }
            System.out.println("Simmone");
        }
    
        //  WHILE
            int nickNameCount = 5;
    
            while (nickNameCount != 0) { 
                  nickNameCount--;
                    if (nickNameCount == 4) {
                    System.out.println("Go ahead i will skip this third loop. i will ride on the next loop!");
                    continue;
            }

                System.out.println("Sim");
              
        }
        // DO WHILE
             int lastNameCount = 5;

            do {
                System.out.println("Delos reyes");
                lastNameCount--;
            } while (lastNameCount != 0);
    }
}
     
