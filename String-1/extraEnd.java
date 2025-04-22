public String extraEnd(String str) {
    // int x= str.length();
    //   return str.substring(x-2)+""+str.substring(x-2)+""+str.substring(x-2);
    
    String last =  str.charAt(str.length()-2)+""+str.charAt(str.length()-1);
    return last+last+last;
      
    
  }
  