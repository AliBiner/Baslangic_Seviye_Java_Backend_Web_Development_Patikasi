# Circle Sector Area Calculator

This is a simple Java console application that calculates the **area of a circle sector**.  
The user inputs the radius and the central angle in degrees, and the program computes the sector area using the formula:

---

## 🚕 Features

- Console input with clear prompts
- Validates input values (radius > 0, angle between 0 and 360)
- Uses the standard mathematical formula for sector area
- Allows repeated calculations until the user exits

---

## 💰 Circle Sector Area Formula

The area is calculated using the formula:

```
Area = ( PI * (Radius * Radius) * Angle ) / 360 
```

---

## 💡 Example

```
Daire Hesaplama Aracına Hoş Geldiniz.
Hesaplama için 1'e basınız. Çıkış için 2'ye basınız.
1
Yarıçap değeri giriniz:
5
Merkez açının ölçüsünü giriniz:
90
Result = 19.634954084936208
```

---

## 📦 Project Structure

```
com/
└── alibiner/
    ├── Main.java               // Starts the program
    ├── Calculator.java         // Main calculator logic
    └── CustomScanner.java      // Handles user input and validation
```

---

## ▶️ How to Run

1. Open the project in your Java IDE.
2. Run the `Main` class.
3. Follow the on-screen instructions.

OR

1. Make sure you have **Java JDK** installed.
2. Clone or download the project files.
3. Open terminal or command prompt.
4. Compile the code:
   ```bash
   javac *.java
   java GPA
   ```

---

## 📘 Notes

- Input values are checked for correctness.
- The central angle is in degrees.
- The program runs repeatedly until the user chooses to exit.

---

## ✅ License

This project is open for learning and personal use.

---

## 👨‍💻 Author

**Ali Biner**
