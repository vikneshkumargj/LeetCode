char* longestPalindrome(char* s) {
    int len = strlen(s);
    int start =0;
    int reslen =0;
    for(int i=0;s[i]!='\0';i++)
    {
        int l=i,r=i;
        while( (l>=0) && (r<len) && s[l]==s[r])
        {
            if(reslen<r-l+1)
            {
            start = l;
            reslen =r-l+1;
            }
            l--;
            r++;
        }

        l=i,r=i+1;
        while( (l>=0) && (r<len) && s[l]==s[r])
        {
            if(reslen<r-l+1)
            {
            start = l;
            reslen =r-l+1;
            }
            l--;
            r++;
        }
    }
    char* res=(char*)malloc(10000*sizeof(char));
    for(int i=0;i<reslen;i++)
    {
        res[i]=s[start+i];
    }
    res[reslen]='\0';
    return res;
}