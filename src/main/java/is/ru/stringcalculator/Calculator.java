package is.ru.stringcalculator;

/*Veldu próf úr listanum ->  
Skrifaðu próf sem failar -> 
Compile-a test -> 
Keyrðu testið og sjáðu hvernig það failar -> 
Útfærðu virknina sem verið er að prófa, 
keyrðu testið inn á milli jafnóðum, þangað til það stenst prófunina -> 
Refactor, brjóttu kóðann upp í föll og/eða hreinsaðu til í honum ef þess þarf -> 
Keyra test aftur, 
sjá hvort að refactorið hafi brotið eitthvað -> 
Byrja á næsta prófi í listanum. Hringur kominn.*/

public class Calculator {
    public static int add(String text){
        try{
            String splitString = "[,\n";
            if(text == ""){
                return 0;
            } else if(text.contains(",") || text.contains("\n") || text.contains("//")){
                if(text.substring(0,2).equals("//")){
                    splitString += text.substring(2,3);
                    text = text.substring(3);
                }
                splitString += "]";
                String numbers[] = text.split(splitString);
                Boolean negativeFound = false;
                String negativeNumbers = "";
                for(String number : numbers){
                    if(toInt(number) < 0){
                        negativeFound = true;
                        negativeNumbers += number + ",";
                    }
                    if(negativeFound){
                        throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
                    }

                }
                
                return sum(numbers);
            }
            return toInt(text);
        }
        catch(Exception exc){
            throw exc;
        }
    }

    private static int toInt(String number){
        if(!number.equals("")){
            return Integer.parseInt(number);
        }
        return 0;
    }
    
    private static int sum(String [] numbers){
        int total = 0;
        for(String number : numbers){
            if(number.equals("")){

            }else if(toInt(number)<=1000){
                total += toInt(number); 
            }
        }
        
        return total;
    }

}