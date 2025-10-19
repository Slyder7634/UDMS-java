public class Password{

    public void password_check(String pass){

        if ((pass.length())>8){

            int alphabets=0, symbols=0, numbers=0,spaces=0;
            char ch;

            for(int i=0;i<(pass.length());i++){
                ch=pass.charAt(i);
                
                if (Character.isLetter(ch)){
                    alphabets++;
                }
                else if (Character.isDigit(ch)){
                    numbers++;
                }
                else if (Character.isWhitespace(ch)){
                    spaces++;
                }
                else{
                    symbols++;
                }
            }

            if((alphabets<1) || (symbols<1) || (numbers<1) || (spaces>0)){ 
                if (alphabets<1){
                    System.out.println("Password must contain atleast one alphabet");
                }
                if (numbers<1){
                    System.out.println("Password must contain atleast one number");
                }
                if(symbols<1){
                    System.out.println("Password must contain atleast one symbol");
                }
                if(spaces>0){
                    System.out.println("A password cannot have blank spaces");
                }
            }

            else{
                System.out.println("Password is safe and passed all tests");
            }
        }
        
        else {
            System.out.println("Password must be longer than 8 characters");
        }
    }
}