import java.util.*;

public class Waifu{
    Scanner scan = new Scanner(System.in);
    //Character Variables
    String Name;
    String Race;
    String HairStyle;
    String HairColor;
    String EyeColor;
    String Personality;
    String BustSize;
    String ColorPalette;
    int Age;


    //Constructor
    public Waifu(String Name, String Race, int Age, String HairStyle, String HairColor, String EyeColor, String Personality, String ColorPalette, String BustSize){

        this.Name = Name;
        this.Race = Race;
        this.Age = Age;
        this.HairStyle = HairStyle;
        this.HairColor = HairColor;
        this.EyeColor = EyeColor;
        this.Personality = Personality;
        this.ColorPalette = ColorPalette;
        this.BustSize = BustSize;
        
    }


    //Set Methods
    public void setName(String Name){
        this.Name = scan.nextLine();
    }

    public void setRace(String Race){
        this.Race = scan.nextLine();
    }
    
    public void setHair(String HairStyle){
        this.HairStyle = scan.nextLine();
    }

    public void setHairC(String HairColor){
        this.HairColor = scan.nextLine();
    }

    public void setEyes(String EyeColor){
        this.EyeColor = scan.nextLine();
    }

    public void setBust(String BustSize){
        this.BustSize = scan.nextLine();
    }

    public void setPersonality(String Personality){
        this.Personality = Personality;
    }

    public void setAge(int Age){
        this.Age = scan.nextInt();
    }

    public void setColor(String ColorPalette){
        this.ColorPalette = scan.nextLine();
    }


    //Get Methods
    public String getName(){
        return this.Name;
    }

    public String getRace(){
        return this.Race;
    }

    public String getHair(){
        return this.HairStyle;
    }

    public String getHairC(){
        return this.HairColor;
    }

    public String getEyes(){
        return this.EyeColor;
    }

    public String getPersonality(){
        return this.Personality;
    }

    public String getBust(){
        return this.BustSize;
    }

    public int getAge(){
        return this.Age;
    }

    public String getColor(){
        return this.ColorPalette;
    }
}
