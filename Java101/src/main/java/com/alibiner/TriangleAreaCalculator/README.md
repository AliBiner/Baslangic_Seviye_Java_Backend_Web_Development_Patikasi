# Triangle Area Calculator

This is a simple Java **console application** that calculates the **area of a triangle** using its **three side lengths**. It uses **Heron’s formula** to compute the area. The user can interactively input values and get the result immediately.

## 📌 Features

- User-friendly console input
- Error handling for invalid inputs (letters, symbols, etc.)
- Supports floating point (decimal) numbers
- Uses **Heron's formula** to calculate triangle area
- Option to exit or repeat the calculation

## 🧮 Heron's Formula

If the three sides of a triangle are `a`, `b`, and `c`:

1. Compute the **semi-perimeter**:
   ```
   s = (a + b + c) / 2
   ```

2. Calculate the **area**:
   ```
   Area = √(s * (s - a) * (s - b) * (s - c))
   ```

---

## 📁 Project Structure

```
com/
└── alibiner/
    ├── Main.java             // Entry point of the application
    ├── TriangleCalculator.java // Main logic for triangle area calculation
    └── CustomScanner.java    // Utility for safe user input from console
```

---

## ▶️ How to Run

1. Clone or download the project.
2. Open it in any Java IDE (IntelliJ, Eclipse, VSCode, etc.)
3. Run the `Main.java` file.

---

## 🧑‍💻 Example Output

```
Üç kenarı bilinen üçgenin alanını hesaplamak için 1'e, çıkış için 2'ye basınız.
1
1. kenarın değerini giriniz:
5
2. kenarın değerini giriniz:
6
3. kenarın değerini giriniz:
7
Kenarları 5.0 - 6.0 - 7.0 olan üçgenin alanı: 14.6969
```

---

## 📦 Dependencies

- No external libraries are required.
- Uses only standard Java packages: `java.util.Scanner`

---

## 📘 Notes

- The program uses recursive input handling to ensure valid numbers are entered.
- The input can be integer or decimal numbers (like `5` or `5.5`).

---

## ✅ License

This project is open for educational and personal use.

---

## 👨‍💻 Author

**Ali Biner**  
Feel free to customize or extend the program to support different triangle types or calculation methods.
