/*
Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
Example:
n= 5, m=5: 25
n=-5, m=5:  0
*/

import java.util.stream.IntStream;

public class Paper
{
  public static int paperWork(int n, int m) 
  {
        if (n < 0 || m < 0) {
            return 0;
        }

        return IntStream.range(0, n)
                .mapToObj(i -> m)
                .reduce(0, Integer::sum);
  }
}

//OR better but not stream

public class Paper
{
  public static int paperWork(int n, int m) 
  {
    return Math.max(n,0) * Math.max(m,0);
  }
}

