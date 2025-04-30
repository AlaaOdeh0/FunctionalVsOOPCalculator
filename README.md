📘 FunctionalVsOOPCalculator 
================================================


🔍 Description:
------------
This Java project compares Object-Oriented Programming (OOP) and Functional Programming
approaches by building a simple calculator with basic arithmetic operations:
- Addition
- Subtraction
- Multiplication
- Division
- Modulus

Project Structure:
------------------
📦Package: calculator

Files:
1. OOPCalculator.java           --> Contains standard methods for arithmetic operations.
2. OOPCalculatorTest.java       --> Tests the OOP implementation.
3. Calculator.java              --> A functional interface with method: double calculate(double a, double b)
4. FunctionalCalculatorTest.java --> Uses Lambda expressions to implement the Calculator interface and test operations.

🚀How to Run:
-----------
1. Open Eclipse.
2. Import the project folder:
   File > Import > Existing Projects into Workspace > Select Root Directory > Browse to project folder.
3. Navigate to the 'calculator' package.
4. Right-click on OOPCalculatorTest.java and choose Run As > Java Application.
5. Right-click on FunctionalCalculatorTest.java and choose Run As > Java Application.
6. Check the Console for output results of both approaches.

✅ Expected Output:
----------------
🧱 OOP Programming:
Add: 15.0
Subtract: 5.0
Multiply: 50.0
Divide: 2.0
Mod: 0.0

⚙️ Functional Programming:
Add: 15.0
Subtract: 5.0
Multiply: 50.0
Divide: 2.0
Mod: 0.0

📌 Note:
-----
Ensure Java SDK is configured in Eclipse.

