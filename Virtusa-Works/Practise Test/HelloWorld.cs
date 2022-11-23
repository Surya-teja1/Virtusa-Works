using System;

public class HelloWorld
{
    public static void Main(string[] args)
    {
        string a = Console.ReadLine();

        //Console.WriteLine(a);
        string val;
        int res;
        val = Console.ReadLine();
        res = Convert.ToInt32(val);
        //Console.WriteLine(val);
        string ans="";
        for(int i=0;i<a.Length;i=i+2)
        {
            //int x = a[i+1];
            char foo = a[i+1];
            int bar = Convert.ToInt32(new string(foo, 1));
            for(int j=0;j<bar;j++)
            {
                ans=ans+a[i];

            }
            
        }
        if(res-1<ans.Length){
             Console.WriteLine(ans[res-1]);
        }
        else
        {
            Console.WriteLine("-1");
        
        }
    }
}