
# CMD File Interface Program

## Overview

**CMD File Interface Program** is a Java-based command-line tool designed for managing and displaying files directly from the terminal. Utilizing 2D arrays, the program allows users to:

- Create files
- Open existing files
- Write to files
- Resize and move files on the display
- View file content in the command line


## Features/Commands
- **new**: Creates and displays a new untitled file.
- **open `filename.txt`**: Open and display `filename.txt`. (Note: .txt files must be in same path as project files)
- **close**: Closes most recently opened/created file and updates display.
- **close `filename.txt`**: Closes `filename.txt`file and updates display.
- **select `filename.txt`**: Moves `filename.txt` to front of display.
- **write**: Writes text onto currently open file.
- **resize** `height` `length`: Resizes the currently open file to the specified `height` and `length`.
- **move** `y` `x`: Moves the currently open file to the specified `y` and `x` positions on the display screen.

## Installation

### Running in Eclipse

1. **Clone the repository:**

   `bash git clone https://github.com/safesaif21/CMD-File-Program.git
   `
2. **Open Eclipse:**
   - If you haven't installed Eclipse, you can download it from the [Eclipse website](https://www.eclipse.org/downloads/).

3. **Import the Project:**
   - Go to \`File\` > \`Import...\`.
   - Select \`General\` > \`Existing Projects into Workspace\`, then click \`Next\`.
   - Click \`Browse...\` and navigate to the directory where you cloned the repository.
   - Select the project and click \`Finish\`.

4. **Build the Project:**
   - Right-click on the project in the \`Project Explorer\`.
   - Select \`Build Path\` > \`Configure Build Path...\`.
   - Ensure that the \`JRE System Library\` is correctly set up. If not, click \`Add Library...\`, select \`JRE System Library\`, and configure it.

5. **Run the Program:**
   - Right-click the `DocumentHandlerDriver.java` file in the `src` folder.
   - Select `Run As` > `Java Application`.
   - The program will open in the Eclipse console, an empty grid with the name `display` will appear in the command line.
   - Click at the bottom of the `display` grid and begin entering commands.

## Usage

### Examples

- **Make a new file**:
  `new`
  
- **Modify a file**:
  `write Hello World!`
  
- **Open a file**:
  `open Jabberwocky.txt`

- **Resize a file**:
  `resize 10 20`

- **Move a file**:
  `move 20 20`


## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Acknowledgments

This program was created as an assignment for Object-Oriented Computing (CPSC 1181) at Langara College.

