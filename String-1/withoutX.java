public String withoutX(String str) {
    // Remove 'x' from the start if present
    if (str.startsWith("x")) {
        str = str.substring(1);
    }
    
    // Remove 'x' from the end if present
    if (str.endsWith("x")) {
        str = str.substring(0, str.length() - 1);
    }
    
    return str; // Return the modified string
}
