package com.company;

public class Average
{
    public static void main(String[] args){
        double a=0, b, c=0, d;
        String s;
        System.out.println("Insert a mark: ");
        s=scan.nextLine;	// we read the mark as string to check the word "end"
        while(s!="end"){  // if the mark isn't an end then we pass it to double to work with it
            b=Convert.ToDouble(s);
            c++;   //counter of numbers
            a+=b;  // sum of all the notes
            System.out.println("Insert a mark: ");
            s=scan.nextLine();
        }
        if(c!=0){
            d=a/c;  //calculate the average
            System.out.println("The average is {0}.",d);
        }
    }
}
