package vjzeba15;

public class Vjzeba15 {

    public static void main(String[] args) {

        int brArg = args.length;
        
        String padezArg = "";
        
        switch(brArg % 10){
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                padezArg = "Argumenata";
                break;
            case 1:
                if (brArg % 100 == 11) 
                    padezArg = "Argumenata";
                else
                    padezArg = "Argumentom";
                break;
            case 2:
            case 3:
            case 4:
                int mod100 = brArg % 100;
                if(mod100 == 12 || mod100 == 13 || mod100 == 14)
                    padezArg = "argumenata";
                else
                    padezArg = "argumenta";
                break;
                
                
            
    }
       System.out.println("Program je pokrenut sa " + brArg + " " + padezArg + " komandne linije.");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " ");
            System.out.println();
            
            for(String arg : args){
                System.out.println(arg);
            }
        }
        
    }

}
