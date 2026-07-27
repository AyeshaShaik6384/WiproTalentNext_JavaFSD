package String_Based;

class Result
{
    String output1;
    String output2;
    String output3;
}

public class EncodingThreeStrings
{
    static String[] splitString(String s)
    {
        int n = s.length();
        String[] parts = new String[3];

        if(n % 3 == 0)
        {
            int len = n / 3;
            parts[0] = s.substring(0, len);
            parts[1] = s.substring(len, 2 * len);
            parts[2] = s.substring(2 * len);
        }
        else if(n % 3 == 1)
        {
            int len = n / 3;
            parts[0] = s.substring(0, len);
            parts[1] = s.substring(len, 2 * len + 1);
            parts[2] = s.substring(2 * len + 1);
        }
        else
        {
            int len = n / 3;
            parts[0] = s.substring(0, len + 1);
            parts[1] = s.substring(len + 1, 2 * len + 1);
            parts[2] = s.substring(2 * len + 1);
        }

        return parts;
    }

    static Result encodeThreeStrings(String input1, String input2, String input3)
    {
        String[] a = splitString(input1);
        String[] b = splitString(input2);
        String[] c = splitString(input3);

        Result r = new Result();

        r.output1 = a[0] + b[0] + c[0];
        r.output2 = a[1] + b[1] + c[1];

        String temp = a[2] + b[2] + c[2];
        StringBuilder sb = new StringBuilder();

        for(char ch : temp.toCharArray())
        {
            if(Character.isUpperCase(ch))
                sb.append(Character.toLowerCase(ch));
            else
                sb.append(Character.toUpperCase(ch));
        }

        r.output3 = sb.toString();

        return r;
    }

    public static void main(String[] args)
    {
        Result r = encodeThreeStrings("John","Johny","Janardhan");

        System.out.println(r.output1);
        System.out.println(r.output2);
        System.out.println(r.output3);
    }
}
