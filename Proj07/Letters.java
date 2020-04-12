public class Letters
{
   /**
      Counts the frequencies of letters A-Za-z in a string
      @param str a string
      @return an array of 26 counts. The i-th count is the number of occurrences
      of 'A' + i or 'a' + i.
   */
   public int[] letterFrequencies(String str)
   {
      char letter = 'A';
      int a = 0;
      int b = 0; 
      int c = 0;
      int d = 0;
      int e = 0;
      int f = 0;
      int g = 0;
      int h = 0;
      int i = 0;
      int j = 0;
      int k = 0;
      int l = 0;
      int m = 0;
      int n = 0;
      int o = 0;
      int p = 0;
      int q = 0;
      int r = 0;
      int s = 0;
      int t = 0;
      int u = 0;
      int v = 0;
      int w = 0;
      int x = 0;
      int y = 0;
      int z = 0;
      for(int num = 0; num < str.length(); num++){
         letter = str.charAt(num);
         if(letter == 'a' || letter == 'A'){
            a++;
         }
         else if(letter == 'b' || letter == 'B'){
            b++;
         }
         else if(letter == 'c' || letter == 'C'){
            c++;
         }
         else if(letter == 'd' || letter == 'D'){
            d++;
         }
         else if(letter == 'e' || letter == 'E'){
            e++;
         }
         else if(letter == 'f' || letter == 'F'){
            f++;
         }
         else if(letter == 'g' || letter == 'G'){
            g++;
         }
         else if(letter == 'h' || letter == 'H'){
            h++;
         }
         else if(letter == 'i' || letter == 'I'){
            i++;
         }
         else if(letter == 'j' || letter == 'J'){
            j++;
         }
         else if(letter == 'k' || letter == 'K'){
            k++;
         }
         else if(letter == 'l' || letter == 'L'){
            l++;
         }
         else if(letter == 'm' || letter == 'M'){
            m++;
         }
         else if(letter == 'n' || letter == 'N'){
            n++;
         }
         else if(letter == 'o' || letter == 'O'){
            o++;
         }
         else if(letter == 'p' || letter == 'P'){
            p++;
         }
         else if(letter == 'q' || letter == 'Q'){
            q++;
         }
         else if(letter == 'r' || letter == 'R'){
            r++;
         }
         else if(letter == 's' || letter == 'S'){
            s++;
         }
         else if(letter == 't' || letter == 'T'){
            t++;
         }
         else if(letter == 'u' || letter == 'U'){
            u++;
         }
         else if(letter == 'v' || letter == 'V'){
            v++;
         }
         else if(letter == 'W' || letter == 'W'){
            w++;
         }
         else if(letter == 'x' || letter == 'X'){
            x++;
         }
         else if(letter == 'y' || letter == 'Y'){
            y++;
         }
         else if(letter == 'z' || letter == 'Z'){
            z++;
         }
         else{
            letter = 'A';
         }
      }
      int[] letters = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
      return letters;
   }
}