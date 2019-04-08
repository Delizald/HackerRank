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

namespace MarkandToys
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] prices = new int[]{ 1, 12, 5, 111, 200, 1000, 10 };
            maximumToys(prices, 50);
        }

        static int maximumToys(int[] prices, int k)
        {
            int maximumToys = 0;
            int moneySpent = 0;
            Array.Sort(prices);
            for (int i = 0; i < prices.Length;i++)
            {
                if ( (moneySpent + prices[i]) <= k)
                {
                    moneySpent += prices[i];
                    maximumToys++;
                }
                else { break; }
            }
            return maximumToys;
        }
    }
}
