package chapter15.string.ex;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods sample = new UseStringMethods();
        String str = "The String class represents character strings.";
        sample.printWords(str);
        sample.findString(str, "string");
        sample.findAnyCaseString(str, "string");
        sample.countChar(str, 's');
        sample.printContainWords(str, "ss");

    }

    public void printWords(String str){
        String[] words = str.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }

    public void findString(String str, String findStr){
        int index = str.indexOf(findStr);
        if(index != -1){
            System.out.println(findStr + " is appeared at " + index);
        } else {
            System.out.println(findStr + " is not appeared");
        }
    }

    public void findAnyCaseString(String str, String findStr){
        int index = str.toLowerCase().indexOf(findStr.toLowerCase());
        if(index != -1){
            System.out.println(findStr + " is appeared at " + index);
        } else {
            System.out.println(findStr + " is not appeared");
        }
    }

    public void countChar(String str, char c){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == c){
                count++;
            }
        }
        System.out.println("char '" + c + "' count is " + count);
    }

    public void printContainWords (String str, String findStr){
        String[] words = str.split(" ");
        for(String word : words){
            if(word.contains(findStr)){
                System.out.println(word + " contains " + findStr);
            }
        }
    }
}
