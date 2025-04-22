public String deFront(String str) {    
    if(str.length()>=2 && str.charAt(0)==('a') && str.charAt(1)==('b'))
    {
      return str;
    }else if(str.length()>=2 && str.charAt(0)=='a')
    {
      return str.charAt(0)+str.substring(2);
    }else if(str.length()>=2 && str.charAt(1)=='b')
    {
      return str.substring(1);
    }
    else{
      return str.substring(2);
    }
  }
  