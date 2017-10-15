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
        String splitString = "[,\n";
        if(text == ""){
            return 0;
        } else if(text.contains(",") || text.contains("\n") || text.conains("//")){
            if(text.substring(0,2).equals("//")){
                splitString += text.substring(2,3);
                splitString += "]";
            }
            text = text.substring(3);
            String numbers[] = text.split(splitString);
            
            return sum(numbers);
        }
        return toInt(text);
    }

    private static int toInt(String number){
        return Integer.parseInt(number);
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