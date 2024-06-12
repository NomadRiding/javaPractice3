import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        System.out.println(days);
//        System.out.println(Arrays.toString(days));
//        System.out.println(days.length);
//        System.out.println(days[days.length - 1]);
//
        String[] subjectArray = createSubjectsArray();
//
//        System.out.println(Arrays.toString(subjectArray));

        //understanding the for loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println("OSRS is fun!");
//        }
//        for (int i = 0; i < subjectArray.length; i++) {
//            System.out.println(i + " " + subjectArray[i]);
//        }

       // foreach loop
//
//        for(String subject : subjectArray){
//            System.out.println(subject);
//        }

        // WHILE LOOP
        int counter = 0;
//
//        while(counter < 10){
//            System.out.println("OSRS");
//            counter++;
//        }

        //DO WHILE

        do {
            System.out.println("Coding for life");
            counter++;
        }
        while (counter < 3);

        //ARRAY LIST

        List<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(1));
        countries.set(2, "Italy");
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove(2);
        System.out.println(countries);
        System.out.println(countries.size());
        countries.add("Canada");
        countries.add("Pakistan");
        countries.add("Brazil");

        for(int i = 0; i < countries.size(); i++){
            System.out.println(countries.get(i));
        }



        //ADD ELEMENTS TO ARRAY

//        int[] numbers = { 0, 1, 2, 3, 4};
////            numbers[5] = 5; THIS CAN'T BE DONE WITH IN THIS ARRAY
//
//        int[] newNumbers = new int[6];
//        for(int i = 0; i < numbers.length; i++){
//            newNumbers[i] = numbers[i];
//        }
//        newNumbers[5] = 5;


        // MATH CLASS & CASTING

        System.out.println(Math.sqrt(64));
        System.out.println((int)Math.pow(2, 5));
        System.out.println((int)Math.ceil(3.75));

    }

    public static String[] getCountry(int index){
        List<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Spain");
        countries.add("France");

        return new String[]{countries.get(index)};
    }

    public static String[] createSubjectsArray(){
        String[] subjects = new String[5];
        subjects[0] = "Math";
        subjects[1] = "Language";
        subjects[2] = "History";
        subjects[3] = "Biology";
        subjects[4] = "Chemistry";


        return subjects;
 }

        //for loop

}
