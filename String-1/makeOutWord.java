public String makeOutWord(String out, String word) {
    // return out.substring(0,2)+""+word+""+out.substring(2,4);
    return out.substring(0,2)+""+word+""+out.substring(out.length()-2);
    // return out.charAt(0)+""+out.charAt(1)+word+out.charAt(out.length()-2)+out.charAt(out.length()-1);`
  }
  