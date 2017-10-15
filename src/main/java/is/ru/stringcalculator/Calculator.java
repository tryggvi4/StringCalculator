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
        if(text == ""){
            return 0;
        } else if(text.contains(",")){
            if(text.contains("\n2")){
                
            }
            String numbers[] = text.split(",");
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
            total += toInt(number); 
        }
        
        return total;
    }

}