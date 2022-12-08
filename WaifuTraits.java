import java.io.*;
import java.util.*;

public class WaifuTraits{
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws IOException{
        int num;

        System.out.println("Please enter how much Waifu Files you will be creating. Anything Under 1 will Exit the Program");
        num = scan.nextInt();
        if(num <= 0){
            System.out.println("Exiting.");
            System.exit(0);
        }
        else{
            Waifu[] WaifuList = new Waifu[num];
            initiateAll(WaifuList);
            setAll(WaifuList);
            printWaifu(WaifuList);
    }
}
    //Initializes the Array
    public static void initiateAll(Waifu[] WaifuList){
        for(int i = 0; i<WaifuList.length; i++){
        WaifuList[i] = new Waifu(null, null, 0, null, null, null, null, null, null);
        
    }
    }
    //Sets the Characteristics
    public static void setAll(Waifu[] WaifuList) throws IOException{
        for(int i = 0; i<WaifuList.length; i++){
            
            
            
            System.out.println("What is Waifu " + i + "'s full name? Type EXIT to leave the Program.");
            WaifuList[i].setName(null);

            if(WaifuList[i].Name.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }
            System.out.println("What is her race? Type EXIT to leave the Program.");
            WaifuList[i].setRace(null);

            if(WaifuList[i].Race.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }
        
            System.out.println("What is her hair style? Type EXIT to leave the Program.");
            WaifuList[i].setHair(null);

            if(WaifuList[i].HairStyle.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }

            System.out.println("What color is her hair? Type EXIT to leave the Program.");
            WaifuList[i].setHairC(null);
            
            if(WaifuList[i].HairColor.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }

            System.out.println("Her Eye Color? Type EXIT to leave the Program.");
            WaifuList[i].setEyes(null);

            if(WaifuList[i].EyeColor.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }

            personalityList(WaifuList);

            System.out.println("What is her color palette? Type EXIT to leave the Program.");
            WaifuList[i].setColor(null);

            if(WaifuList[i].ColorPalette.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }

            System.out.println("Most importantly, her bust size? Just provide a letter. Type EXIT to leave the Program.");
            WaifuList[i].setBust(null);

            if(WaifuList[i].BustSize.equals("EXIT")){
                System.out.println("Exiting.");
                System.exit(0);
            }
            
            System.out.println("What is her age? Anything under 0 will exit the Program.");
            WaifuList[i].setAge(0);
        
            if(WaifuList[i].Age <=0){
                System.out.println("Exiting.");
                System.exit(0);
            }
        }
    }


    public static void printWaifu(Waifu[] WaifuList) throws IOException{
        for(int num = 0; num < WaifuList.length; num++){
            System.out.println("Waifu " + num + " has these traits.");
            System.out.println("Full Name: " + WaifuList[num].getName());
            System.out.println("Race: " + WaifuList[num].getRace());
            System.out.println("Age: " + WaifuList[num].getAge());
            System.out.println("Hair Style: " + WaifuList[num].getHair());
            System.out.println("Hair Color: " + WaifuList[num].getHairC());
            System.out.println("Eye Color: " + WaifuList[num].getEyes());
            System.out.println("Personality: " + WaifuList[num].getPersonality());
            System.out.println("Color Palette: " + WaifuList[num].getColor());
            System.out.println("Bust Size: " + WaifuList[num].getBust());
            System.out.println();

            try{
            BufferedWriter file = new BufferedWriter(new FileWriter("*\\Waifu List\\Waifu Files\\" + WaifuList[num].getName() + ".txt"));

            file.write(WaifuList[num].getName());
            file.write("\nShe is " + WaifuList[num].getAge() + " years old");
            file.write("\nHer race is: "+ WaifuList[num].getRace());
            file.write("\nHer Hairstyle is: " + WaifuList[num].getHair());
            file.write("\nHer Haircolor is: " + WaifuList[num].getHairC());
            file.write("\nHer Eye Color is: " + WaifuList[num].getEyes());
            file.write("\nShe has a " + WaifuList[num].getPersonality() + " Personality");
            file.write("\nHer Color Palette is: " + WaifuList[num].getColor());
            file.write("\nHer bust size is: " + WaifuList[num].getBust() + "-cup.");

            file.close(); 
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void personalityList(Waifu[] WaifuList) throws FileNotFoundException{
        for(int i = 0; i < WaifuList.length; i++){
        int num;
        System.out.println("What is her personality like? Type 0 or greater than 10 to leave the Program.");
            
       /*  BufferedReader read = new BufferedReader(new FileReader("PersonalityList.txt")); 
        
        String line;
        while((line = read.readLine()) != null){
            System.out.println(line);
        }
        read.close();
*/
        Scanner scanner = new Scanner(new File("PersonalityList.txt"));
        List<String> List = new ArrayList<>();
        while(scanner.hasNext()){
            List.add(scanner.nextLine()); 
        }
        System.out.println(List);
         num = scan.nextInt();
        
        if(num == 0 || num > 10){
            System.out.println("Exiting.");
            System.exit(0);
        }

        else if(num == 2){
            WaifuList[i].setPersonality("Yandere");
        }

        else if(num == 3){
            WaifuList[i].setPersonality("Airhead");
        }

        else if(num == 4){
            WaifuList[i].setPersonality("Tomboy");
        }

        else if(num == 5){
            WaifuList[i].setPersonality("Innocent");
        }

        else if(num == 6){
            WaifuList[i].setPersonality("Bookworm");
        }

        else if(num == 7){
            WaifuList[i].setPersonality("line");
        }

        else if(num == 8){
            WaifuList[i].setPersonality("");
        }
    }
}
}
