using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MYf1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = 6;
            int p = 0;
            int req = 0;
            int[] arr = { 0900, 0940, 0950, 1100, 1500, 1800 };
            int[] dep = { 0910, 1200, 1120, 1130, 1900, 2000 };
            for (int i = 0; i < n; i++)
            {
                int a = arr[i];
                int b = dep[i];
                for (int j = i+1; j < n; j++)
                {
                    if (arr[j] <= b)
                    {
                        p++;
                    }
                }
                if (p > req)
                {
                    req = p;
                }
            }
            Console.WriteLine(p);
            Console.ReadLine();
        }
    }
}
