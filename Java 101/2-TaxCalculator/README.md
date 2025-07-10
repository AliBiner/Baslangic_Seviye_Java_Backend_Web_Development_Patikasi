# Tax Calculator (Java Console App)

This is a simple **Java console application** that calculates tax (KDV in Turkey) based on a price entered by the user.

The program uses a **list of tax rates** and calculates:
- Tax amount
- Total price including tax
- Applied tax rate

---

## 💻 Technologies Used

- Java SE (JDK 8 or later)
- Console input/output (Scanner)

---

## 🎯 Features

- User can enter a price from the console.
- The program calculates and displays the total price with tax.
- Supports different tax rates for different price ranges.
- If invalid input is given (text instead of number), it will ask again.
- Runs in a loop until the user chooses to exit.

---

## 🧮 Example

```
Please enter a price: 1200
Price without Tax: 1200.0
Price with Tax   : 1296.0
Tax Amount       : 96.0
Tax Rate         : 8.0%
--------------------------
Press 1 to continue or 2 to exit: 2
```

---

## 📁 Project Structure

```
src/
│
├── Main.java             // Starts the application
├── TaxCalculator.java    // Contains tax calculation logic
├── TaxRate.java          // Represents tax rate and its range
├── TaxPrice.java         // Represents the result of calculation
└── OnConsole.java        // Helper methods to get user input
```

---

## 🔢 Tax Logic

| Price Range (₺)   | Tax Rate (%) |
|-------------------|--------------|
| 0 – 999.99        | 18%          |
| 1000 and above    | 8%           |

These values can be changed in `createTaxRateList()` method in `Main.java`.

---

## 🚀 How to Run

1. Clone or download this project.
2. Open it with your Java IDE (e.g. IntelliJ IDEA, Eclipse).
3. Run `Main.java`.
4. Follow the console instructions.

OR

1. Make sure you have **Java JDK** installed.
2. Clone or download the project files.
3. Open terminal or command prompt.
4. Compile the code:
   ```bash
   javac *.java
   java Main
   ```

---

## 📌 Notes

- All user input is validated. If you enter letters or symbols instead of numbers, the program will ask again.
- Prices must be **positive**. Negative values are not accepted.

---

## 🧠 Author

👤 **Ali Biner**  
📧 ali_bnr@outlook.com  
🌍 Türkiye

---

## 📃 License

This project is open source and free to use.
