# Selenium Grid with Java (JUnit) using Eclipse IDE

This project demonstrates how to use **Selenium Grid** to run automated tests on different browsers (Chrome, Edge, Firefox) using **Java** and **JUnit** in **Eclipse IDE**.

## 📦 Project Structure

Package: `seleniumGrid`  
Class: `TestGrid`

Contains four test methods that:
- Connect to a Selenium Grid hub
- Launch different browsers remotely
- Navigate to Google
- Print the page title
- Close the browser

## 🚀 Technologies Used

- Java
- JUnit 5
- Selenium WebDriver
- Selenium Grid
- Eclipse IDE

## 🧪 Test Overview

Each test connects to the Selenium Grid hub at:
http://192.168.56.1:4444/wd/hub


And runs on the specified browser via `DesiredCapabilities`:
- `test1`: Chrome
- `test2`: Microsoft Edge
- `test3`: Firefox
- `test4`: Chrome

Each test:
1. Creates a remote WebDriver using the hub URL
2. Opens [https://www.google.com](https://www.google.com)
3. Prints the page title
4. Quits the driver

## ⚙️ Prerequisites

- Java JDK (11+ recommended)
- Eclipse IDE
- Selenium WebDriver libraries
- JUnit 5
- Selenium Grid (Hub + Nodes running)
- Compatible browser drivers (chromedriver, geckodriver, msedgedriver)

## 📥 Setup Instructions

1. **Clone or Download** this project.
2. Open the project in **Eclipse**.
3. Add the required **Selenium and JUnit dependencies** to your build path.
4. Start **Selenium Grid**:
   - Start the hub:  
     ```bash
     java -jar selenium-server.jar hub
     ```
   - Start the nodes (with proper drivers configured):  
     ```bash
     java -jar selenium-server.jar node --detect-drivers true --hub http://<hub-ip>:4444
     ```

5. Run the `TestGrid` class as **JUnit Test** in Eclipse.

## 📸 Sample Output

```text
Title: Google
