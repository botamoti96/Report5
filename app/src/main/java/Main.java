public class Main {
    public static void main(String[] args){
        String str = "百二十三";
        try{
            int value = Integer.parseInt(str);
            System.out.println(value);
        }
        catch(NumberFormatException e){
            System.out.println("引数がおかしいですよ");
            System.out.println(e.getMessage());
        }
    }
}
