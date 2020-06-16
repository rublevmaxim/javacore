package maxsoft.level5;

public class String_m {
    public String s3="";
    public int len_sequence(String s1, String s2)
    { int len=0;
      int last_ind1=s1.length ()-1;
      int last_ind2=s2.length ()-1;

      if (0>=last_ind1||0>=last_ind2) {
          return 0;
      }


        if (s1.charAt(last_ind1)==s2.charAt(last_ind2)) {
            s3=s3+s1.charAt(last_ind1);
            return len_sequence(s1.substring(0, s1.length()-1),s2.substring(0, s2.length()-1) )+1;
        }

        if (s1.charAt(last_ind1)!=s2.charAt(last_ind2)) {
            return Math.max(len_sequence(s1,s2.substring(0, s2.length()-1)),
                             len_sequence(s1.substring(0, s1.length()-1),s2) );
        }
        return len;
    }
}
