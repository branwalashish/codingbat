public String seeColor(String str) {
    // 1st Approach
    // if(str.length() <= 2)
    // { return "";
    // }
    // else if(str.length() <= 3 && !str.substring(0,3).equals("red")){ return "";}
    
    // else{
    // 	if(str.substring(0,3).equals("red"))
    //   {
    //     return "red";
    //   }
    //   else if(str.substring(0,4).equals("blue"))
    //   {
    //     return "blue";
    //   }
    // else{
    // return "";
    // }
    // }
    
    // 2nd Approach
    if(str.length()>=3 && str.substring(0,3).equals("red"))
    {
      return "red";
    }else if(str.length()>=4 && str.substring(0,4).equals("blue"))
    {
      return "blue";
    }
    return "";
    
    }
    
    