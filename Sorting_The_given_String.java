

// String str = "geeksforgeeks";
// eeeefggkkorss (sorting string)

// String str = "dhcfe";
// cdefh (sorting string)


import java.util.*;
public class Sorting_The_given_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the String : ");
        String str = sc.next();
        char[] s = str.toCharArray();
        int n = str.length();


        char temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(s[i] > s[j]){
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;

                }
            }
        }


        System.out.print("Sorting Given String : ");
        for(int i=0; i<n; i++){
            System.out.print(s[i]);
        }





    }
}
