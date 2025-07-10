# Body Mass Index (BMI) Calculator

This is a simple Java console application that calculates your **Body Mass Index (BMI)** based on your weight and height inputs.

---

## 📌 What is BMI?

**BMI (Body Mass Index)** is a number calculated from a person's weight and height. It gives an idea of whether the person is underweight, normal weight, overweight, or obese.

```
BMI = weight (kg) / ( height (m) * height (m) )
```

---

## 🚀 Features

- User-friendly console interface
- Takes input for **weight (kg)** and **height (in meters)**
- Ensures only **positive float values** are accepted
- Repeats until the user chooses to exit
- Prints the calculated BMI

---

## 🧪 Example Usage

```
Vücut Kitle İndeksi Hesaplama Aracına Hoş Geldiniz.
Hesaplama için 1'e, çıkış için 2'ye basınız.
1
Lütfen kilonuzu giriniz :
70
Lütfen boyunuzu (metre cinsinde) giriniz:
1.75
Vücut Kitle İndeksiniz : 22.857142857142858
```

---

## 🧱 Project Structure

```
com/
└── alibiner/
    ├── Main.java             // Start the program
    ├── Calculator.java       // Main logic for BMI calculation
    └── CustomScanner.java    // Handles input with validation
```

---

## ▶️ How to Run

1. Open the project in a Java IDE.
2. Run the `Calculator` class (that calls `start()`).
3. Follow the prompts on the console.

Or

1. Make sure you have **Java JDK** installed.
2. Clone or download the project.
3. Open terminal or command prompt.
4. Compile the code:
    ```bash
    javac *.java
    java Main
   ```

---

## 📘 Notes

- The program only accepts **positive numbers** for height and weight.
- You can repeat calculations as many times as you want.
- The calculation follows the standard BMI formula.

---

## ✅ License

This project is free to use and modify for educational and personal use.

---

## 👨‍💻 Author

**Ali Biner**  
Enhance this project by adding health advice based on BMI ranges, or units other than metric (e.g., pounds and inches).
