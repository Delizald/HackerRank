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

class Solution {

    // Complete the superReducedString function below.
    static string superReducedString(string input) {
		char[] charArray = input.ToCharArray();
		StringBuilder solution = new StringBuilder();
		for (int i = 0; i < charArray.Length; i++)
        {
            if (solution.Length != 0)
            {
                char lastChar = solution[solution.Length - 1];
                if ( lastChar == charArray[i])
                {
                    solution.Remove(solution.Length - 1, 1);
                }
                else
                {
                    solution.Append(charArray[i]);
                }
            }
            else
            {
				solution.Append(charArray[i]);
            }
        }

        if (solution.Length > 0)
        {
            return solution.ToString();
        }
        else
        {
            return "Empty String";
        }

    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        string result = superReducedString(s);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}
