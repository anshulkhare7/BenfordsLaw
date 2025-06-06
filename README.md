## Project Description

Benford’s law is an observation about the frequency distribution of leading digits in many real-life sets of numerical data. The law states that in many naturally occurring collections of numbers, the leading significant digit is likely to be small. For example, in sets that obey the law, the number 1 appears as the most significant digit about 30% of the time, while 9 appears as the most significant digit less than 5% of the time. By contrast, if the digits were distributed uniformly, they would each occur about 11.1% of the time. [Wikipedia](https://en.wikipedia.org/wiki/Benford%27s_law)

This project implements Benford's Law analysis in Java. It takes a text file containing numbers as input, calculates the frequency of the leading digits, and compares it to the distribution predicted by Benford's Law.

Here are few more interesting instances where Benford’s law has been used:

- Benford’s Law was invoked as evidence of fraud in the 2009 Iranian elections.
- The macroeconomic data the Greek government reported to the European Union before entering the eurozone was shown to be probably fraudulent using Benford’s law.
- One researcher even applied the law to thirteen years of Bill Clinton’s tax returns. He passed.

In this repository, I've included the code to run the Benford's analysis on an annual report of Indian Listed Company.

![Result of Benford's analysis of Reliance Comm Annual Report](https://user-images.githubusercontent.com/26899066/76157017-0f82b880-6129-11ea-80e6-3495e3e596f6.png)

## Building and Running the Project

This project uses Maven for building. To build the project, navigate to the project's root directory and run the following command:

```bash
mvn clean install
```

Once the project is built, you can run the analysis using the following command:

```bash
java -jar target/benfords-law-1.0-SNAPSHOT.jar <path_to_input_file>
```

Replace `<path_to_input_file>` with the actual path to your input data file.

## Input Data Format

The input data should be a plain text file (`.txt`) with one number on each line. The program will process these numbers to determine the leading digit for the Benford's Law analysis.

Example:
```
123.45
0.005
6789
98.7
...
```

## Program Output

The program will output the following:

1.  **Frequency Distribution:** A table showing the frequency of each leading digit (1-9) found in the input data.
2.  **Benford's Law Comparison:** A comparison of the observed frequencies with the frequencies predicted by Benford's Law.
3.  **Graphical Representation (Optional):** If a graphical interface is implemented, it might display a bar chart visualizing the comparison. *(Note: The current version mentioned in the image seems to produce a chart, this part might need verification based on the actual project capabilities.)*

## Disclaimer

This was a quick and sloppy experiment. Ideally, I should have scrubbed the numerical data before running my analysis, i.e., I should have filtered out the numbers which were not really financial data like the page numbers, section numbers, etc. I didn’t do all that.

So please don’t rely on these results. It was an experiment more for fun rather than investigation.
