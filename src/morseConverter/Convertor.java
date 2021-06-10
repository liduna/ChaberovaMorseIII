package morseConverter;

import java.util.*;
import java.util.stream.Collectors;

public class Convertor {

    public static void main(String args []){



        Scanner scan = new Scanner (System.in);
        System.out.println("Write");
        String input = scan.nextLine();


        ArrayList<Character> firstInputList = new ArrayList<>();

        HashMap<Character, String> morseCode = new HashMap<>();


        morseCode.put('h', " .... ");
        morseCode.put('e', " . ");
        morseCode.put('l', " .-.. ");
        morseCode.put('o', " --- ");
        morseCode.put('w', " .-- ");
        morseCode.put('r', " .-. ");
        morseCode.put('d', " -.. ");
        morseCode.put(' ', "|");
        morseCode.put('j', " .--- ");
        morseCode.put('a', " .- ");
        morseCode.put(',', " | ");



        for (char ch: input.toCharArray()) {
            firstInputList.add(ch);
        }
        //Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
        //Set<String> keySet = someMap.keySet();
        //HashMap<String, HashMap> selects = new HashMap<String, HashMap>();
        //List<String> isbnCodes = books.entrySet().stream()
        /*List<String> titles = books.entrySet().stream()
                .filter(e -> e.getKey().startsWith("978-0"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());*/

      for (int i =0; i< firstInputList.size(); i++){
          char inputList = firstInputList.get(i);
          List<String>codes = morseCode.entrySet().stream()
                  .filter(e -> e.getKey().equals(inputList))
                  .map(Map.Entry::getValue)
                  .collect(Collectors.toList());
          String listCodes = Arrays.toString(codes.toArray()).replace("[", "").replace("]", "");
          System.out.print(listCodes);
      }

        /*for(Map.Entry<Character, String > entry : morseCode.entrySet()) {
            Character key = entry.getKey();
            String value = entry.getValue();


            if (entry.getKey().equals(firstInputList.get(i))){

                System.out.print(value);

            }

            // do what you have to do here
            // In your case, another loop.
        }

        }


            }









        System.out.println(firstInputList);

    }
        Character [] letters = new Character []{'h','e','l','o',};
        String [] code = new String []{"h","e","l","o",};

        

}
*/}}