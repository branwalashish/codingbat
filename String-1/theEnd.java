public String theEnd(String str, boolean front) {
    if(front==true)
    {
      return ""+str.charAt(0);
    }
    else
    {
      return ""+str.charAt(str.length()-1);
    }

    // 2nd approach
    // if (str.isEmpty()) {
    //     return ""; 
    // }
    // return front ? String.valueOf(str.charAt(0)) : String.valueOf(str.charAt(str.length() - 1));
  }
  