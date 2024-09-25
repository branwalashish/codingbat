public String twoChar(String str, int index) {
  
    // if(index==2)
    // return str.substring(str.length()-2,str.length());
    // else if(index==1||index==3)
    // {
    //   return str.substring(1,3);
    // }else{
    
    
    // return str.substring(0,2);
    // }
    
    // Another Approach
    if(index<0 || index+1> str.length()-1)
    {
      return str.substring(0,2);
    }
    return str.substring(index,index+2);
    
    
    
    
  }
  