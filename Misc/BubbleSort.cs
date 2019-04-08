using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

namespace BubbleSort
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = new int[] { 3, 2, 1 };
            countSwaps(a);
        }
        /// Input: {3,2,1
        //Array is sorted in 3 swaps.
        //First Element: 1
        //Last Element: 3
        static void countSwaps(int[] a)
        {
            int swaps = 0;
            for (int i = 0; i < a.Length; i++)
            {
                for ( int j = 0; j < a.Length - 1; j++)
                {
                    if (a[j] > a[j + 1])
                    {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                        swaps++;
                    }
                }
            }
            Console.WriteLine("Array is sorted in " + swaps + " swaps.");
            Console.WriteLine("First Element: " + a[0]);
            Console.Write("Last Element: " + a[a.Length-1]);
            //Console.ReadKey();
        }
    }
}
