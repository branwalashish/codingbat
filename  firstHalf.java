public String firstHalf(String str) {
    int s = (str.length()-1)/2;
    if(str.length()==0){
      return str;
    }
    return str.substring(0,s+1);
  }
  