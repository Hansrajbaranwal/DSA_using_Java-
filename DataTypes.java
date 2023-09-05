public class DataTypes {
    public static int dataTypes(String type) {
        // Write your code here
        if(type.equals("Integer")){
            return 4;
        }
        else if(type.equals("Long")){
            return 8;
        }
        else if(type.equals("Float")){
            return 4;
        }
        else if(type.equals("Double")){
            return 8;
        }
        else if(type.equals("Character")){
            return 1;
        }
        else{
            return 0;
        }
    }
}
