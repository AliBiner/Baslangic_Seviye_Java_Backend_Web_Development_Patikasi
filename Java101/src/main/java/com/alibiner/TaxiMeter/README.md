# Taximeter Calculator

This is a simple Java **console application** that calculates the **taxi fare** based on the distance entered by the user. It uses a fixed **starting price**, a **price per kilometer**, and ensures a **minimum fare**.

---

## 🚕 Features

- Easy-to-use console interface
- Calculates fare based on kilometers
- Enforces a minimum fare of 20.00 TL
- Handles invalid input safely (via `CustomScanner`)
- Recursively runs until the user chooses to exit

---

## 💰 Fare Calculation Formula

The fare is calculated using the formula:

```
Fare = Starting Price + (Distance × Price per km)
```

Then, the application compares the result with the **minimum fare** and returns the greater value.

---

## 💡 Example

If the user enters `3.5` kilometers:
```
Fare = 10.00 + (3.5 × 2.20) = 17.70
Since 17.70 < 20.00 → Final fare is 20.00 TL
```

---

## 📦 Project Structure

```
com/
└── alibiner/
    ├── Main.java               // Starts the program
    ├── TaximeterCalculator.java // Main calculator logic
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

- All prices are in **Turkish Lira (TL)**.
- Floating point (decimal) numbers like `2.5`, `7.75` are supported.
- You can exit the program anytime by pressing `2`.

---

## ✅ License

This project is open for learning and personal use.

---

## 👨‍💻 Author

**Ali Biner**  
Feel free to improve or expand this project (e.g., add night tariffs or waiting time fees).
