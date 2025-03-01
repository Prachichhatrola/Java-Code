/*
Input: PROGRAM 
Output:
G$ GR$ GRA$ GRAM$ 
GRAMP$ GRAMPR$ GRAMPRO$
  */

class GfG
{
    void printPattern(String s)
    {
        int mid = (s.length()/2);
        int i=mid, count=0;
        String str="";
        while(count < s.length()) {
            str = str+s.charAt(i);
            System.out.print(str+"$ ");
            i = (i+1)%s.length();
            count += 1;
        }
    }
}

