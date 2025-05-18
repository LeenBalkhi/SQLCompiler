# SQLCompiler

A Java-based SQL compiler utilizing ANTLR for parsing SQL statements.

## Overview

This project implements a simple SQL compiler using Java and ANTLR. It parses SQL statements defined in the `Sql.g4` grammar file and processes them accordingly.

## Features

* Parses SQL statements using ANTLR-generated parser
* Modular design with separate packages for aggregation and dependencies
* Sample SQL files for testing

## Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher
* ANTLR 4

### Compilation

To compile the project, navigate to the project's root directory and run:

```
javac -d out/production/SQLCompiler src/*.java
```

### Usage

After compilation, you can run the program using:

```
java -cp out/production/SQLCompiler Main
```

Follow the on-screen prompts to input SQL statements or load them from sample files.

## Project Structure

* `src/` - Contains the Java source code files
* `Agg/` - Contains aggregation-related classes
* `Dependencies/` - Contains dependency-related classes
* `sample/` - Contains sample SQL files for testing
* `Sql.g4` - ANTLR grammar file defining SQL syntax
* `out/production/SQLCompiler/` - Directory for compiled `.class` files
* `.idea/` - IntelliJ IDEA project configuration files
* `SQLCompiler.iml` - IntelliJ IDEA module file

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

