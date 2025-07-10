# Java Grocery Bill Calculator

This is a simple Java console application that calculates the total price of grocery items based on their weight and price per kilogram.

---

## 🛒 What It Does

- Asks the user how many kilograms of each product they want to buy.
- Multiplies the weight by the unit price of each product.
- Sums all values and prints the total bill.

---

## 📦 Products and Prices

| Product    | Price per Kg (TL) |
|------------|-------------------|
| Armut      | 2.14 TL           |
| Elma       | 3.67 TL           |
| Domates    | 1.11 TL           |
| Muz        | 0.95 TL           |
| Patlıcan   | 5.00 TL           |

---

## 🧪 Example Usage

```
Armut Kaç Kilo ? : 2
Elma Kaç Kilo ? : 1.5
Domates Kaç Kilo ? : 1
Muz Kaç Kilo ? : 0.5
Patlıcan Kaç Kilo ? : 1
Toplam Tutar : 16.345TL
```

---

## 📁 Project Structure

```
com/
└── alibiner/
    ├── Main.java             // Main logic for product pricing
    └── CustomScanner.java    // Handles user input with validation
```

---

## ▶️ How to Run

1. Open the project in your Java IDE.
2. Make sure `CustomScanner` handles positive float input correctly.
3. Run the `Main` class and follow the prompts.

---

## 🔧 Notes

- Uses `Dictionary<String, Float>` to manage product prices and user orders.
- All values are validated to be **positive floats**.
- Output total is printed with 2 decimal digits (if needed).

---

## ✅ License

Free for educational and personal use.

---

## 👨‍💻 Author

**Ali Biner**
