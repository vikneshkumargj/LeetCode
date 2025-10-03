bool isPalindrome(char* s) {
    int l = strlen(s);
    int i=0,j=l-1;
    while(i<j)
    {
        if(!isalnum(s[i]))
        {
            i++;
            continue;
        }

        if(!isalnum(s[j]))
        {
            j--;
            continue;
        }

        if(tolower(s[i])!=tolower(s[j]))
        {
            return 0;
        }
        i++;
        j--;
    }

    return 1;
}