package StringBuffer;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        do
        {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            buf.append(str);
            buf.append("\n");
        }
        while(buf.indexOf("#o") == -1);


            if(buf.indexOf("#b") != -1) {
                int a = buf.indexOf("#b");
                buf.delete(a-1, a+2);
            }


                int i,j = 0;
            if(buf.indexOf("#c") != -1){
                i = buf.indexOf("\n");
                if(i != -1){
                    do{
                        j = i;
                        i = buf.indexOf("\n",i+1);
                        if(buf.indexOf("#c",i+1) == -1){
                            break;
                        }
                    }while(i != -1);
                    i = buf.indexOf("#c");
                    if(j>i) {
                        buf.delete(0, i + 2);
                    }
                    else{
                        buf.delete(j+1,i+2);
                    }
                }
            }


            int x = buf.indexOf("#o");
            int y = buf.length();
            buf.delete(x, y);
            System.out.println(buf);
    }
}
//dbq,我太懒了，现在才赶作业QAQ。
