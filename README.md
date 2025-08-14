# java-ifeval-equivalent

A Java equivalent of the COBOL IFEVAL.CBL program.

## Migration Overview

This project is a Java-based reimplementation of the functionality found in the [COBOL IFEVAL.CBL program](https://github.com/neopragma/cobol-samples/blob/main/src/main/cobol/IFEVAL.CBL). The original COBOL program demonstrates conditional logic using `IF` statements. This project aims to replicate that logic in Java.

## Architecture

The Java version will be a simple, console-based application. The core logic will be contained within a single class, mirroring the structure of the original COBOL program.

## Getting Started

To get started with this project, you will need to have Java and Maven installed.

1.  Clone the repository:
    ```bash
    git clone https://github.com/pmgridd/java-ifeval-equivalent.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd java-ifeval-equivalent
    ```
3.  Build the project:
    ```bash
    mvn clean install
    ```

## Usage Examples

To run the application, execute the following command:
```bash
java -cp target/java-ifeval-equivalent-1.0-SNAPSHOT.jar com.example.App
```

## Development Guide

Contributions are welcome! Please follow the standard GitHub flow:

1.  Fork the repository.
2.  Create a new branch for your feature.
3.  Make your changes.
4.  Submit a pull request.

## Migration Status

-   [ ] Initial project setup
-   [ ] Replicate COBOL `IFEVAL` logic in Java
-   [ ] Unit tests for all conditions
-   [ ] Final review and documentation

## Troubleshooting

If you encounter any issues, please open an issue on the GitHub repository.

## License & Credits

This project is licensed under the MIT License. See the `LICENSE` file for more details.

The original COBOL program was created by neopragma and is available in their [cobol-samples](https://github.com/neopragma/cobol-samples) repository.
