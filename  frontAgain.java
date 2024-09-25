public boolean frontAgain(String str) {

    //2nd method
    // if(str.length()>2
    
    
    //1st method
      if(str.length()<=1)
      {
        return false;
      }else if(str.substring(0,2).equals(str.substring(str.length()-2)))
      return true;
      
      return false;
    }
    