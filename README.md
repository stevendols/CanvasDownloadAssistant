# Canvas Download Assistant

I got the idea for this project while serving as a Computer Science Lab Assistant at [Point Loma Nazarene University][loma].  Part of my job is to download the source code that students submit to Canvas, an online Learning Management System, or LMS, utilized by the University.  Unfortunately, downloading the files gives you one folder with every file for every student inside, making it difficult to determine whose code is whose.  The file naming convention outputs files like this, which must be renamed in order to run correctly.


    <LastName><FirstName>_#####_########_<FileName>

## Objective

The objective of this project was to take the result of extracting the raw files from Canvas, and create a new directory structure like this:

    <Outer Directory Where Files Extract To>
        <LastName><FirstName>
            <Clean File Name>
            
## Running Code

    javac CanvasDownloadAssistant.java
    java CanvasDownloadAssistant <RELATIVE PATH>
Relative Path refers to the relative path from the directory where the program is run to the folder holding the Canvas downloads.

## Contributors

Steven Dols -- [Contact Me!][email]

## License

The software included in this repository is licensed under the terms of the MIT License, which can be read in full [here](LICENSE).

[loma]: https://www.pointloma.edu/schools-departments-colleges/department-mathematical-information-computer-sciences
[email]: mailto:stevendols5798@pointloma.edu
