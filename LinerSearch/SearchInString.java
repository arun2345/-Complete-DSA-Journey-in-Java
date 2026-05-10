package LinerSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "ArunKumar";
        char terget = 'K';

        System.out.println(search(name, terget));
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search2(String str, char terget){
      if(str.length() == 0){
        return false;
      }

      for (char ch : str.toCharArray()) {
         if(ch == terget){
           return true;
         }
      }

      return false;
    }


    static boolean search(String str, char terget){
      if(str.length() == 0){
        return false;
      }

      for (int index = 0; index < str.length(); index++) {
        if(terget == str.charAt(index)){
           return true;
        }
      }

      return false;
    }
}
