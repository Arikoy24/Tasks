package StringTasks.StringTask4;

//abcd@gmail.com

public class IsValidEmail {

    public static boolean isValidEmail(String email){


        if(email == null || email.isEmpty()){
            return false;
        }

        if(!email.contains("@")){
            return false;
        }

        if(!email.contains(".")){
            return false;
        }

        if(email.length() > 254){
            return false;
        }

        int dotIndex = email.lastIndexOf('.');
        int atIndex = email.lastIndexOf('@');

        if(dotIndex < atIndex){
            return false;
        }

        if(atIndex == 0){
            return false;
        }


        String topLevelDomain = email.substring(dotIndex + 1);
        String  domain = email.substring(atIndex + 1, dotIndex);
        String local = email.substring(0, atIndex);

        if(local.length() > 64){
            return false;
        }

        if(domain.isEmpty()){
            return false;
        }

        if(topLevelDomain.length() < 2){
            return false;
        }

        if(topLevelDomain.length() > 63){
            return false;
        }

        if(email.indexOf('@') != email.lastIndexOf('@')){
            return false;
        }

        if(email.endsWith(".") || email.endsWith("@")){
            return false;
        }

        return true;
    }
}
