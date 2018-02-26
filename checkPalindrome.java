boolean checkPalindrome(String inputString) {
    char[] tmp = inputString.toCharArray();

    for (int x = 0; x <= inputString.length()/2; x++){
        if(tmp[x] != tmp[inputString.length()-(x+1)]){
            return false;
        }
    }
    
    return true;
}
